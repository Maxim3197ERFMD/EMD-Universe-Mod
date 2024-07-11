package net.erfmd.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.erfmd.block.EMDBlocks;
import net.erfmd.item.EMDItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class EMDRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(EMDItems.RAW_RUBY,
            EMDBlocks.RUBY_ORE, EMDBlocks.DEEPSLATE_RUBY_ORE, EMDBlocks.NETHER_RUBY_ORE);
    private static final List<ItemConvertible> IRON_SMELTABLES = List.of(EMDBlocks.NETHER_IRON_ORE);
    private static final List<ItemConvertible> STONE_SMELTABLES = List.of(EMDBlocks.STONE_TILES);
    private static final List<ItemConvertible> BLACKSTONE_SMELTABLES = List.of(EMDBlocks.POLISHED_BLACKSTONE_TILES);
    private static final List<ItemConvertible> COOKING_SMELTABLES = List.of(Items.SUGAR);

    public EMDRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, EMDItems.RUBY,
                0.7f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, EMDItems.RUBY,
                0.7f, 100, "ruby");
        offerSmelting(exporter, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT,
                0.7f, 200, "iron_ingot");
        offerBlasting(exporter, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT,
                0.7f, 100, "iron_ingot");
        offerSmelting(exporter, BLACKSTONE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.CRACKED_POLISHED_BLACKSTONE_TILES,
                0.1f, 200, "blackstone");
        offerSmelting(exporter, STONE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.CRACKED_STONE_TILES,
                0.1f, 200, "stone");



        offerSmelting(exporter, COOKING_SMELTABLES, RecipeCategory.FOOD, EMDItems.CARAMEL,
                0.1f, 200, "food");



        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, EMDItems.RUBY, RecipeCategory.DECORATIONS,
                EMDBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, EMDItems.RAW_RUBY, RecipeCategory.DECORATIONS,
                EMDBlocks.RAW_RUBY_BLOCK);



        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.POTATO, RecipeCategory.DECORATIONS,
                EMDBlocks.POTATO_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.FOOD, Items.POISONOUS_POTATO, RecipeCategory.DECORATIONS,
                EMDBlocks.POISONOUS_POTATO_BLOCK);



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_BLACKSTONE_TILES, 4)
                .pattern("SS")
                .pattern("SS")
                .input('S', Blocks.POLISHED_BLACKSTONE_BRICKS)
                .criterion(hasItem(Blocks.POLISHED_BLACKSTONE_BRICKS), conditionsFromItem(Blocks.POLISHED_BLACKSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.POLISHED_BLACKSTONE_TILES)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.STONE_TILES, 4)
                .pattern("SS")
                .pattern("SS")
                .input('S', Blocks.STONE_BRICKS)
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Blocks.STONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.STONE_TILES)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SMOOTH_END_STONE, 4)
                .pattern("SS")
                .pattern("SS")
                .input('S', Blocks.END_STONE)
                .criterion(hasItem(Blocks.END_STONE), conditionsFromItem(Blocks.END_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.SMOOTH_END_STONE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.END_STONE_TILES, 4)
                .pattern("SS")
                .pattern("SS")
                .input('S', Blocks.END_STONE_BRICKS)
                .criterion(hasItem(Blocks.END_STONE_BRICKS), conditionsFromItem(Blocks.END_STONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.END_STONE_TILES)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.STONE_TILE_STAIRS, 4)
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .input('S', EMDBlocks.STONE_TILES)
                .criterion(hasItem(EMDBlocks.STONE_TILES), conditionsFromItem(EMDBlocks.STONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.STONE_TILE_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.STONE_TILE_SLAB, 6)
                .pattern("SSS")
                .input('S', EMDBlocks.STONE_TILES)
                .criterion(hasItem(EMDBlocks.STONE_TILES), conditionsFromItem(EMDBlocks.STONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.STONE_TILE_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, 4)
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .input('S', EMDBlocks.POLISHED_BLACKSTONE_TILES)
                .criterion(hasItem(EMDBlocks.POLISHED_BLACKSTONE_TILES), conditionsFromItem(EMDBlocks.POLISHED_BLACKSTONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB, 6)
                .pattern("SSS")
                .input('S', EMDBlocks.POLISHED_BLACKSTONE_TILES)
                .criterion(hasItem(EMDBlocks.POLISHED_BLACKSTONE_TILES), conditionsFromItem(EMDBlocks.POLISHED_BLACKSTONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SMOOTH_END_STONE_STAIRS, 4)
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .input('S', EMDBlocks.SMOOTH_END_STONE)
                .criterion(hasItem(EMDBlocks.SMOOTH_END_STONE), conditionsFromItem(EMDBlocks.SMOOTH_END_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.SMOOTH_END_STONE_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SMOOTH_END_STONE_SLAB, 6)
                .pattern("SSS")
                .input('S', EMDBlocks.SMOOTH_END_STONE)
                .criterion(hasItem(EMDBlocks.SMOOTH_END_STONE), conditionsFromItem(EMDBlocks.SMOOTH_END_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.SMOOTH_END_STONE_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.END_STONE_TILE_STAIRS, 4)
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .input('S', EMDBlocks.END_STONE_TILES)
                .criterion(hasItem(EMDBlocks.END_STONE_TILES), conditionsFromItem(EMDBlocks.END_STONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.END_STONE_TILE_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.END_STONE_TILE_SLAB, 6)
                .pattern("SSS")
                .input('S', EMDBlocks.END_STONE_TILES)
                .criterion(hasItem(EMDBlocks.END_STONE_TILES), conditionsFromItem(EMDBlocks.END_STONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.END_STONE_TILE_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, EMDBlocks.STONE_TILE_WALL, 6)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', EMDBlocks.STONE_TILES)
                .criterion(hasItem(EMDBlocks.STONE_TILES), conditionsFromItem(EMDBlocks.STONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.STONE_TILE_WALL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, EMDBlocks.POLISHED_BLACKSTONE_TILE_WALL, 6)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', EMDBlocks.POLISHED_BLACKSTONE_TILES)
                .criterion(hasItem(EMDBlocks.POLISHED_BLACKSTONE_TILES), conditionsFromItem(EMDBlocks.POLISHED_BLACKSTONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.POLISHED_BLACKSTONE_TILE_WALL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, EMDBlocks.END_STONE_TILE_WALL, 6)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', EMDBlocks.END_STONE_TILES)
                .criterion(hasItem(EMDBlocks.END_STONE_TILES), conditionsFromItem(EMDBlocks.END_STONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.END_STONE_TILE_WALL)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EMDBlocks.BLACK_REDSTONE_LAMP, 1)
                .pattern("SRS")
                .pattern("RGR")
                .pattern("SRS")
                .input('G', Blocks.GLOWSTONE)
                .input('R', Items.REDSTONE)
                .input('S', Blocks.BLACK_STAINED_GLASS)
                .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Blocks.BLACK_STAINED_GLASS), conditionsFromItem(Blocks.BLACK_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.BLACK_REDSTONE_LAMP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EMDBlocks.BLUE_REDSTONE_LAMP, 1)
                .pattern("SRS")
                .pattern("RGR")
                .pattern("SRS")
                .input('G', Blocks.GLOWSTONE)
                .input('R', Items.REDSTONE)
                .input('S', Blocks.BLUE_STAINED_GLASS)
                .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Blocks.BLUE_STAINED_GLASS), conditionsFromItem(Blocks.BLUE_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.BLUE_REDSTONE_LAMP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EMDBlocks.BROWN_REDSTONE_LAMP, 1)
                .pattern("SRS")
                .pattern("RGR")
                .pattern("SRS")
                .input('G', Blocks.GLOWSTONE)
                .input('R', Items.REDSTONE)
                .input('S', Blocks.BROWN_STAINED_GLASS)
                .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Blocks.BROWN_STAINED_GLASS), conditionsFromItem(Blocks.BROWN_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.BROWN_REDSTONE_LAMP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EMDBlocks.CYAN_REDSTONE_LAMP, 1)
                .pattern("SRS")
                .pattern("RGR")
                .pattern("SRS")
                .input('G', Blocks.GLOWSTONE)
                .input('R', Items.REDSTONE)
                .input('S', Blocks.CYAN_STAINED_GLASS)
                .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Blocks.CYAN_STAINED_GLASS), conditionsFromItem(Blocks.CYAN_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.CYAN_REDSTONE_LAMP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EMDBlocks.GRAY_REDSTONE_LAMP, 1)
                .pattern("SRS")
                .pattern("RGR")
                .pattern("SRS")
                .input('G', Blocks.GLOWSTONE)
                .input('R', Items.REDSTONE)
                .input('S', Blocks.GRAY_STAINED_GLASS)
                .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Blocks.GRAY_STAINED_GLASS), conditionsFromItem(Blocks.GRAY_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.GRAY_REDSTONE_LAMP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EMDBlocks.GREEN_REDSTONE_LAMP, 1)
                .pattern("SRS")
                .pattern("RGR")
                .pattern("SRS")
                .input('G', Blocks.GLOWSTONE)
                .input('R', Items.REDSTONE)
                .input('S', Blocks.GREEN_STAINED_GLASS)
                .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Blocks.GREEN_STAINED_GLASS), conditionsFromItem(Blocks.GREEN_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.GREEN_REDSTONE_LAMP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EMDBlocks.LIGHT_BLUE_REDSTONE_LAMP, 1)
                .pattern("SRS")
                .pattern("RGR")
                .pattern("SRS")
                .input('G', Blocks.GLOWSTONE)
                .input('R', Items.REDSTONE)
                .input('S', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS), conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.LIGHT_BLUE_REDSTONE_LAMP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EMDBlocks.LIGHT_GRAY_REDSTONE_LAMP, 1)
                .pattern("SRS")
                .pattern("RGR")
                .pattern("SRS")
                .input('G', Blocks.GLOWSTONE)
                .input('R', Items.REDSTONE)
                .input('S', Blocks.LIGHT_GRAY_STAINED_GLASS)
                .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS), conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.LIGHT_GRAY_REDSTONE_LAMP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EMDBlocks.LIME_REDSTONE_LAMP, 1)
                .pattern("SRS")
                .pattern("RGR")
                .pattern("SRS")
                .input('G', Blocks.GLOWSTONE)
                .input('R', Items.REDSTONE)
                .input('S', Blocks.LIME_STAINED_GLASS)
                .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Blocks.LIME_STAINED_GLASS), conditionsFromItem(Blocks.LIME_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.LIME_REDSTONE_LAMP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EMDBlocks.MAGENTA_REDSTONE_LAMP, 1)
                .pattern("SRS")
                .pattern("RGR")
                .pattern("SRS")
                .input('G', Blocks.GLOWSTONE)
                .input('R', Items.REDSTONE)
                .input('S', Blocks.MAGENTA_STAINED_GLASS)
                .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Blocks.MAGENTA_STAINED_GLASS), conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.MAGENTA_REDSTONE_LAMP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EMDBlocks.ORANGE_REDSTONE_LAMP, 1)
                .pattern("SRS")
                .pattern("RGR")
                .pattern("SRS")
                .input('G', Blocks.GLOWSTONE)
                .input('R', Items.REDSTONE)
                .input('S', Blocks.ORANGE_STAINED_GLASS)
                .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Blocks.ORANGE_STAINED_GLASS), conditionsFromItem(Blocks.ORANGE_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.ORANGE_REDSTONE_LAMP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EMDBlocks.PINK_REDSTONE_LAMP, 1)
                .pattern("SRS")
                .pattern("RGR")
                .pattern("SRS")
                .input('G', Blocks.GLOWSTONE)
                .input('R', Items.REDSTONE)
                .input('S', Blocks.PINK_STAINED_GLASS)
                .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Blocks.PINK_STAINED_GLASS), conditionsFromItem(Blocks.PINK_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.PINK_REDSTONE_LAMP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EMDBlocks.PURPLE_REDSTONE_LAMP, 1)
                .pattern("SRS")
                .pattern("RGR")
                .pattern("SRS")
                .input('G', Blocks.GLOWSTONE)
                .input('R', Items.REDSTONE)
                .input('S', Blocks.PURPLE_STAINED_GLASS)
                .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Blocks.PURPLE_STAINED_GLASS), conditionsFromItem(Blocks.PURPLE_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.PURPLE_REDSTONE_LAMP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EMDBlocks.RED_REDSTONE_LAMP, 1)
                .pattern("SRS")
                .pattern("RGR")
                .pattern("SRS")
                .input('G', Blocks.GLOWSTONE)
                .input('R', Items.REDSTONE)
                .input('S', Blocks.RED_STAINED_GLASS)
                .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Blocks.RED_STAINED_GLASS), conditionsFromItem(Blocks.RED_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.RED_REDSTONE_LAMP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EMDBlocks.WHITE_REDSTONE_LAMP, 1)
                .pattern("SRS")
                .pattern("RGR")
                .pattern("SRS")
                .input('G', Blocks.GLOWSTONE)
                .input('R', Items.REDSTONE)
                .input('S', Blocks.WHITE_STAINED_GLASS)
                .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Blocks.WHITE_STAINED_GLASS), conditionsFromItem(Blocks.WHITE_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.WHITE_REDSTONE_LAMP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EMDBlocks.YELLOW_REDSTONE_LAMP, 1)
                .pattern("SRS")
                .pattern("RGR")
                .pattern("SRS")
                .input('G', Blocks.GLOWSTONE)
                .input('R', Items.REDSTONE)
                .input('S', Blocks.YELLOW_STAINED_GLASS)
                .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Blocks.YELLOW_STAINED_GLASS), conditionsFromItem(Blocks.YELLOW_STAINED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.YELLOW_REDSTONE_LAMP)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, EMDItems.HIGH_VOLTAGE_BATTERY, 1)
                .pattern("#S#")
                .pattern("SAS")
                .pattern("#S#")
                .input('A', EMDItems.ENERGY_BALL)
                .input('S', EMDItems.ACCUMULATOR)
                .input('#', EMDItems.EMERALD_DUST)
                .criterion(hasItem(EMDItems.ENERGY_BALL), conditionsFromItem(EMDItems.ENERGY_BALL))
                .criterion(hasItem(EMDItems.ACCUMULATOR), conditionsFromItem(EMDItems.ACCUMULATOR))
                .criterion(hasItem(EMDItems.EMERALD_DUST), conditionsFromItem(EMDItems.EMERALD_DUST))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.HIGH_VOLTAGE_BATTERY)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, EMDItems.COPPER_COIL, 1)
                .pattern("###")
                .pattern("#S#")
                .pattern("#S#")
                .input('#', EMDItems.COPPER_CABLE)
                .input('S', Items.IRON_NUGGET)
                .criterion(hasItem(EMDItems.COPPER_CABLE), conditionsFromItem(EMDItems.COPPER_CABLE))
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.COPPER_COIL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, EMDItems.COPPER_CABLE, 3)
                .pattern("#S")
                .input('#', Items.SHEARS)
                .input('S', Items.COPPER_INGOT)
                .criterion(hasItem(Items.SHEARS), conditionsFromItem(Items.SHEARS))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.COPPER_CABLE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, EMDItems.EMERALD_DUST, 2)
                .pattern("#S#")
                .pattern("G#G")
                .pattern("AAA")
                .input('#', Items.EMERALD)
                .input('S', Items.IRON_PICKAXE)
                .input('G', Items.GOLD_INGOT)
                .input('A', Items.LAPIS_LAZULI)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .criterion(hasItem(Items.IRON_PICKAXE), conditionsFromItem(Items.IRON_PICKAXE))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.LAPIS_LAZULI), conditionsFromItem(Items.LAPIS_LAZULI))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.EMERALD_DUST)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, EMDItems.ACCUMULATOR, 1)
                .pattern("#S#")
                .pattern("SRS")
                .pattern("ASA")
                .input('#', Items.IRON_INGOT)
                .input('S', EMDItems.COPPER_CABLE)
                .input('R', Items.REDSTONE)
                .input('A', EMDItems.COPPER_COIL)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(EMDItems.COPPER_CABLE), conditionsFromItem(EMDItems.COPPER_CABLE))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(EMDItems.COPPER_COIL), conditionsFromItem(EMDItems.COPPER_COIL))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.ACCUMULATOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, EMDItems.ENERGY_BALL, 1)
                .pattern("#R#")
                .pattern("SES")
                .pattern("#R#")
                .input('E', EMDItems.ACCUMULATOR)
                .input('R', Items.REDSTONE)
                .input('S', EMDItems.EMERALD_DUST)
                .input('#', EMDItems.DIAMOND_DUST)
                .criterion(hasItem(EMDItems.ACCUMULATOR), conditionsFromItem(EMDItems.ACCUMULATOR))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(EMDItems.EMERALD_DUST), conditionsFromItem(EMDItems.EMERALD_DUST))
                .criterion(hasItem(EMDItems.DIAMOND_DUST), conditionsFromItem(EMDItems.DIAMOND_DUST))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.ENERGY_BALL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, EMDItems.DIAMOND_DUST, 2)
                .pattern("#R#")
                .pattern("SES")
                .pattern("#R#")
                .input('E', Items.IRON_PICKAXE)
                .input('R', Items.DIAMOND)
                .input('S', Items.GOLD_INGOT)
                .input('#', Items.REDSTONE)
                .criterion(hasItem(Items.IRON_PICKAXE), conditionsFromItem(Items.IRON_PICKAXE))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.DIAMOND_DUST)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, EMDItems.SPECIAL_STORAGE, 1)
                .pattern("#R#")
                .pattern("SES")
                .pattern("#R#")
                .input('E', Blocks.GOLD_BLOCK)
                .input('R', EMDItems.DIAMOND_DUST)
                .input('S', EMDItems.ENERGY_BALL)
                .input('#', EMDItems.EMERALD_DUST)
                .criterion(hasItem(Blocks.GOLD_BLOCK), conditionsFromItem(Blocks.GOLD_BLOCK))
                .criterion(hasItem(EMDItems.DIAMOND_DUST), conditionsFromItem(EMDItems.DIAMOND_DUST))
                .criterion(hasItem(EMDItems.ENERGY_BALL), conditionsFromItem(EMDItems.ENERGY_BALL))
                .criterion(hasItem(EMDItems.EMERALD_DUST), conditionsFromItem(EMDItems.EMERALD_DUST))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.SPECIAL_STORAGE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, EMDItems.METAL_ALLOY, 1)
                .pattern("###")
                .pattern("#ES")
                .pattern("SSS")
                .input('E', EMDItems.WARPED_NETHERITE_INGOT)
                .input('S', Blocks.IRON_BLOCK)
                .input('#', Blocks.COPPER_BLOCK)
                .criterion(hasItem(EMDItems.WARPED_NETHERITE_INGOT), conditionsFromItem(EMDItems.WARPED_NETHERITE_INGOT))
                .criterion(hasItem(Blocks.IRON_BLOCK), conditionsFromItem(Blocks.IRON_BLOCK))
                .criterion(hasItem(Blocks.COPPER_BLOCK), conditionsFromItem(Blocks.COPPER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.METAL_ALLOY)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, EMDItems.WARPED_NETHERITE_INGOT, 1)
                .pattern("#D#")
                .pattern("E#E")
                .pattern("#E#")
                .input('D', EMDItems.DIAMOND_DUST)
                .input('#', Items.NETHERITE_INGOT)
                .input('E', EMDItems.EMERALD_DUST)
                .criterion(hasItem(EMDItems.DIAMOND_DUST), conditionsFromItem(EMDItems.DIAMOND_DUST))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .criterion(hasItem(EMDItems.EMERALD_DUST), conditionsFromItem(EMDItems.EMERALD_DUST))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.WARPED_NETHERITE_INGOT)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EMDBlocks.IRON_BAR_DOOR, 1)
                .pattern("##")
                .pattern("EE")
                .pattern("##")
                .input('#', Items.IRON_INGOT)
                .input('E', Items.IRON_BARS)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.IRON_BAR_DOOR)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EMDBlocks.REDSTONE_HEART, 1)
                .pattern("###")
                .pattern("#R#")
                .pattern("###")
                .input('#', Items.NETHERITE_INGOT)
                .input('R', Blocks.REDSTONE_BLOCK)
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .criterion(hasItem(Blocks.REDSTONE_BLOCK), conditionsFromItem(Blocks.REDSTONE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.REDSTONE_HEART)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, EMDBlocks.CHOCOLATE_CAKE, 1)
                .pattern("###")
                .pattern("ARA")
                .pattern("BBB")
                .input('#', Items.MILK_BUCKET)
                .input('R', Items.EGG)
                .input('A', Items.COCOA_BEANS)
                .input('B', Items.WHEAT)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.CHOCOLATE_CAKE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, EMDBlocks.EXPERIMENT_115, 1)
                .pattern("###")
                .pattern("ARA")
                .pattern("BBB")
                .input('#', Items.GOLDEN_APPLE)
                .input('R', Items.EGG)
                .input('A', Items.SWEET_BERRIES)
                .input('B', Items.COOKIE)
                .criterion(hasItem(Items.GOLDEN_APPLE), conditionsFromItem(Items.GOLDEN_APPLE))
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(Items.SWEET_BERRIES))
                .criterion(hasItem(Items.COOKIE), conditionsFromItem(Items.COOKIE))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.EXPERIMENT_115)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, EMDBlocks.EXPERIMENT_803S, 1)
                .pattern("###")
                .pattern("ARA")
                .pattern("BBB")
                .input('#', Items.HONEY_BOTTLE)
                .input('R', Items.SPIDER_EYE)
                .input('A', Items.ROTTEN_FLESH)
                .input('B', Items.WHEAT)
                .criterion(hasItem(Items.HONEY_BOTTLE), conditionsFromItem(Items.HONEY_BOTTLE))
                .criterion(hasItem(Items.SPIDER_EYE), conditionsFromItem(Items.SPIDER_EYE))
                .criterion(hasItem(Items.ROTTEN_FLESH), conditionsFromItem(Items.ROTTEN_FLESH))
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.EXPERIMENT_803S)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, EMDItems.CARAMEL_APPLE, 1)
                .pattern("###")
                .pattern("#A#")
                .pattern("###")
                .input('#', EMDItems.CARAMEL)
                .input('A', Items.APPLE)
                .criterion(hasItem(EMDItems.CARAMEL), conditionsFromItem(EMDItems.CARAMEL))
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.CARAMEL_APPLE)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT, 1)
                .pattern("T")
                .pattern("T")
                .input('T', Items.TORCH)
                .criterion(hasItem(Items.TORCH), conditionsFromItem(Items.TORCH))
                .offerTo(exporter, new Identifier(getRecipeName(Items.LIGHT)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, EMDItems.ROSE_GOLDEN_APPLE, 1)
                .pattern("RRR")
                .pattern("RAR")
                .pattern("RRR")
                .input('R', EMDItems.ROSE_GOLD_INGOT)
                .input('A', Items.APPLE)
                .criterion(hasItem(EMDItems.ROSE_GOLD_INGOT), conditionsFromItem(EMDItems.ROSE_GOLD_INGOT))
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.ROSE_GOLDEN_APPLE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EMDItems.ROSE_GOLDEN_SWORD, 1)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" S ")
                .input('R', EMDItems.ROSE_GOLD_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(EMDItems.ROSE_GOLD_INGOT), conditionsFromItem(EMDItems.ROSE_GOLD_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.ROSE_GOLDEN_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EMDItems.ROSE_GOLDEN_HELMET, 1)
                .pattern("RRR")
                .pattern("R R")
                .input('R', EMDItems.ROSE_GOLD_INGOT)
                .criterion(hasItem(EMDItems.ROSE_GOLD_INGOT), conditionsFromItem(EMDItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.ROSE_GOLDEN_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EMDItems.ROSE_GOLDEN_CHESTPLATE, 1)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', EMDItems.ROSE_GOLD_INGOT)
                .criterion(hasItem(EMDItems.ROSE_GOLD_INGOT), conditionsFromItem(EMDItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.ROSE_GOLDEN_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EMDItems.ROSE_GOLDEN_LEGGINGS, 1)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', EMDItems.ROSE_GOLD_INGOT)
                .criterion(hasItem(EMDItems.ROSE_GOLD_INGOT), conditionsFromItem(EMDItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.ROSE_GOLDEN_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EMDItems.ROSE_GOLDEN_BOOTS, 1)
                .pattern("R R")
                .pattern("R R")
                .input('R', EMDItems.ROSE_GOLD_INGOT)
                .criterion(hasItem(EMDItems.ROSE_GOLD_INGOT), conditionsFromItem(EMDItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.ROSE_GOLDEN_BOOTS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EMDItems.ROSE_GOLDEN_AXE, 1)
                .pattern("RR ")
                .pattern("RS ")
                .pattern(" S ")
                .input('R', EMDItems.ROSE_GOLD_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(EMDItems.ROSE_GOLD_INGOT), conditionsFromItem(EMDItems.ROSE_GOLD_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.ROSE_GOLDEN_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EMDItems.ROSE_GOLDEN_PICKAXE, 1)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', EMDItems.ROSE_GOLD_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(EMDItems.ROSE_GOLD_INGOT), conditionsFromItem(EMDItems.ROSE_GOLD_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.ROSE_GOLDEN_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EMDItems.ROSE_GOLDEN_SHOVEL, 1)
                .pattern(" R ")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', EMDItems.ROSE_GOLD_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(EMDItems.ROSE_GOLD_INGOT), conditionsFromItem(EMDItems.ROSE_GOLD_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.ROSE_GOLDEN_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EMDItems.ROSE_GOLDEN_HOE, 1)
                .pattern("RR ")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', EMDItems.ROSE_GOLD_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(EMDItems.ROSE_GOLD_INGOT), conditionsFromItem(EMDItems.ROSE_GOLD_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.ROSE_GOLDEN_HOE)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, EMDItems.HONEYSUCKLE_PIE, 1)
                .pattern("BBB")
                .pattern("#A#")
                .input('B', EMDItems.HONEYSUCKLE)
                .input('A', Items.EGG)
                .input('#', Items.WHEAT)
                .criterion(hasItem(EMDItems.HONEYSUCKLE), conditionsFromItem(EMDItems.HONEYSUCKLE))
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.HONEYSUCKLE_PIE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, EMDItems.CHERRY_PIE, 1)
                .pattern("SSS")
                .pattern("#A#")
                .input('S', EMDItems.CHERRIES)
                .input('A', Items.EGG)
                .input('#', Items.WHEAT)
                .criterion(hasItem(EMDItems.CHERRIES), conditionsFromItem(EMDItems.CHERRIES))
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .offerTo(exporter, new Identifier(getRecipeName(EMDItems.CHERRY_PIE)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.IRON_BAR_BLOCK, 4)
                .pattern("#B#")
                .pattern("B#B")
                .pattern("#B#")
                .input('B', Blocks.IRON_BARS)
                .input('#', Items.IRON_NUGGET)
                .criterion(hasItem(Blocks.IRON_BARS), conditionsFromItem(Blocks.IRON_BARS))
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.IRON_BAR_BLOCK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.IRON_BAR_SLAB, 6)
                .pattern("BBB")
                .input('B', EMDBlocks.IRON_BAR_BLOCK)
                .criterion(hasItem(EMDBlocks.IRON_BAR_BLOCK), conditionsFromItem(EMDBlocks.IRON_BAR_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.IRON_BAR_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.IRON_BAR_TRAPDOOR, 2)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', EMDBlocks.IRON_BAR_BLOCK)
                .criterion(hasItem(EMDBlocks.IRON_BAR_BLOCK), conditionsFromItem(EMDBlocks.IRON_BAR_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.IRON_BAR_TRAPDOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.IRON_BAR_DOOR, 3)
                .pattern("##")
                .pattern("BB")
                .pattern("##")
                .input('B', Blocks.IRON_BARS)
                .input('#', Items.IRON_INGOT)
                .criterion(hasItem(Blocks.IRON_BARS), conditionsFromItem(Blocks.IRON_BARS))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.IRON_BAR_DOOR)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_STONE, 1)
                .pattern("SS")
                .pattern("SS")
                .input('S', Blocks.STONE_SLAB)
                .criterion(hasItem(Blocks.STONE_SLAB), conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.POLISHED_STONE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_STONE_STAIRS, 4)
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .input('S', EMDBlocks.POLISHED_STONE)
                .criterion(hasItem(EMDBlocks.POLISHED_STONE), conditionsFromItem(EMDBlocks.POLISHED_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.POLISHED_STONE_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_STONE_SLAB, 6)
                .pattern("SSS")
                .input('S', EMDBlocks.POLISHED_STONE)
                .criterion(hasItem(EMDBlocks.POLISHED_STONE), conditionsFromItem(EMDBlocks.POLISHED_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.POLISHED_STONE_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_STONE_WALL, 6)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', EMDBlocks.POLISHED_STONE)
                .criterion(hasItem(EMDBlocks.POLISHED_STONE), conditionsFromItem(EMDBlocks.POLISHED_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.POLISHED_STONE_WALL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.CHISELED_POLISHED_STONE, 1)
                .pattern("S")
                .pattern("S")
                .input('S', EMDBlocks.POLISHED_STONE)
                .criterion(hasItem(EMDBlocks.POLISHED_STONE), conditionsFromItem(EMDBlocks.POLISHED_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.CHISELED_POLISHED_STONE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.CHISELED_STONE, 1)
                .pattern("S")
                .pattern("S")
                .input('S', Blocks.STONE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.CHISELED_STONE)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SANDSTONE_BRICKS, 4)
                .pattern("SS")
                .pattern("SS")
                .input('S', Blocks.CUT_SANDSTONE)
                .criterion(hasItem(Blocks.CUT_SANDSTONE), conditionsFromItem(Blocks.CUT_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.SANDSTONE_BRICKS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SANDSTONE_BRICK_STAIRS, 4)
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .input('S', EMDBlocks.SANDSTONE_BRICKS)
                .criterion(hasItem(EMDBlocks.SANDSTONE_BRICKS), conditionsFromItem(EMDBlocks.SANDSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.SANDSTONE_BRICK_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SANDSTONE_BRICK_SLAB, 6)
                .pattern("SSS")
                .input('S', EMDBlocks.SANDSTONE_BRICKS)
                .criterion(hasItem(EMDBlocks.SANDSTONE_BRICKS), conditionsFromItem(EMDBlocks.SANDSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.SANDSTONE_BRICK_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SANDSTONE_BRICK_WALL, 6)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', EMDBlocks.SANDSTONE_BRICKS)
                .criterion(hasItem(EMDBlocks.SANDSTONE_BRICKS), conditionsFromItem(EMDBlocks.SANDSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.SANDSTONE_BRICK_WALL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.CHISELED_SANDSTONE_BRICKS, 1)
                .pattern("S")
                .pattern("S")
                .input('S', EMDBlocks.SANDSTONE_BRICK_SLAB)
                .criterion(hasItem(EMDBlocks.SANDSTONE_BRICK_SLAB), conditionsFromItem(EMDBlocks.SANDSTONE_BRICK_SLAB))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.CHISELED_SANDSTONE_BRICKS)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_NETHER_BRICKS, 4)
                .pattern("NN")
                .pattern("NN")
                .input('N', Blocks.NETHER_BRICKS)
                .criterion(hasItem(Blocks.NETHER_BRICKS), conditionsFromItem(Blocks.NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.POLISHED_NETHER_BRICKS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_NETHER_BRICK_STAIRS, 4)
                .pattern("N  ")
                .pattern("NN ")
                .pattern("NNN")
                .input('N', EMDBlocks.POLISHED_NETHER_BRICKS)
                .criterion(hasItem(EMDBlocks.POLISHED_NETHER_BRICKS), conditionsFromItem(EMDBlocks.POLISHED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.POLISHED_NETHER_BRICK_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_NETHER_BRICK_SLAB, 6)
                .pattern("NNN")
                .input('N', EMDBlocks.POLISHED_NETHER_BRICKS)
                .criterion(hasItem(EMDBlocks.POLISHED_NETHER_BRICKS), conditionsFromItem(EMDBlocks.POLISHED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.POLISHED_NETHER_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.WARP_NETHER_BRICKS, 1)
                .pattern("*N")
                .pattern("N*")
                .input('N', Blocks.NETHER_BRICKS)
                .input('*', Blocks.WARPED_WART_BLOCK)
                .criterion(hasItem(Blocks.NETHER_BRICKS), conditionsFromItem(Blocks.NETHER_BRICKS))
                .criterion(hasItem(Blocks.WARPED_WART_BLOCK), conditionsFromItem(Blocks.WARPED_WART_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.WARP_NETHER_BRICKS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.WARP_NETHER_BRICK_STAIRS, 4)
                .pattern("N  ")
                .pattern("NN ")
                .pattern("NNN")
                .input('N', EMDBlocks.WARP_NETHER_BRICKS)
                .criterion(hasItem(EMDBlocks.WARP_NETHER_BRICKS), conditionsFromItem(EMDBlocks.WARP_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.WARP_NETHER_BRICK_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.WARP_NETHER_BRICK_SLAB, 6)
                .pattern("NNN")
                .input('N', EMDBlocks.WARP_NETHER_BRICKS)
                .criterion(hasItem(EMDBlocks.WARP_NETHER_BRICKS), conditionsFromItem(EMDBlocks.WARP_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.WARP_NETHER_BRICK_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.WARP_NETHER_BRICK_WALL, 6)
                .pattern("NNN")
                .pattern("NNN")
                .input('N', EMDBlocks.WARP_NETHER_BRICKS)
                .criterion(hasItem(EMDBlocks.WARP_NETHER_BRICKS), conditionsFromItem(EMDBlocks.WARP_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.WARP_NETHER_BRICK_WALL)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SNOW_BRICKS, 4)
                .pattern("SS")
                .pattern("SS")
                .input('S', Blocks.SNOW_BLOCK)
                .criterion(hasItem(Blocks.SNOW_BLOCK), conditionsFromItem(Blocks.SNOW_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.SNOW_BRICKS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SNOW_BRICK_STAIRS, 4)
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .input('S', EMDBlocks.SNOW_BRICKS)
                .criterion(hasItem(EMDBlocks.SNOW_BRICKS), conditionsFromItem(EMDBlocks.SNOW_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.SNOW_BRICK_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SNOW_BRICK_SLAB, 6)
                .pattern("SSS")
                .input('S', EMDBlocks.SNOW_BRICKS)
                .criterion(hasItem(EMDBlocks.SNOW_BRICKS), conditionsFromItem(EMDBlocks.SNOW_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.SNOW_BRICK_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SNOW_BRICK_WALL, 6)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', EMDBlocks.SNOW_BRICKS)
                .criterion(hasItem(EMDBlocks.SNOW_BRICKS), conditionsFromItem(EMDBlocks.SNOW_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.SNOW_BRICK_WALL)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_GRANITE_BRICKS, 4)
                .pattern("GG")
                .pattern("GG")
                .input('G', Blocks.POLISHED_GRANITE)
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.POLISHED_GRANITE_BRICKS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_GRANITE_BRICK_STAIRS, 4)
                .pattern("G  ")
                .pattern("GG ")
                .pattern("GGG")
                .input('G', Blocks.POLISHED_GRANITE)
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.POLISHED_GRANITE_BRICK_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_GRANITE_BRICK_SLAB, 6)
                .pattern("GGG")
                .input('G', Blocks.POLISHED_GRANITE)
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.POLISHED_GRANITE_BRICK_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_GRANITE_BRICK_WALL, 6)
                .pattern("GGG")
                .pattern("GGG")
                .input('G', Blocks.POLISHED_GRANITE)
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter, new Identifier(getRecipeName(EMDBlocks.POLISHED_GRANITE_BRICK_WALL)));




        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.STONE_TILES, Blocks.STONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.STONE_TILES, Blocks.STONE_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.STONE_TILE_STAIRS, Blocks.STONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.STONE_TILE_STAIRS, Blocks.STONE_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.STONE_TILE_STAIRS, EMDBlocks.STONE_TILES);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.STONE_TILE_SLAB, Blocks.STONE, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.STONE_TILE_SLAB, Blocks.STONE_BRICKS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.STONE_TILE_SLAB, EMDBlocks.STONE_TILES, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.STONE_TILE_WALL, Blocks.STONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.STONE_TILE_WALL, Blocks.STONE_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.STONE_TILE_WALL, EMDBlocks.STONE_TILES);



        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SMOOTH_END_STONE, Blocks.END_STONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SMOOTH_END_STONE_STAIRS, Blocks.END_STONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SMOOTH_END_STONE_STAIRS, EMDBlocks.SMOOTH_END_STONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SMOOTH_END_STONE_SLAB, Blocks.END_STONE, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SMOOTH_END_STONE_SLAB, EMDBlocks.SMOOTH_END_STONE, 2);



        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.END_STONE_TILES, Blocks.END_STONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.END_STONE_TILES, Blocks.END_STONE_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.END_STONE_TILE_STAIRS, Blocks.END_STONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.END_STONE_TILE_STAIRS, Blocks.END_STONE_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.END_STONE_TILE_STAIRS, EMDBlocks.END_STONE_TILES);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.END_STONE_TILE_SLAB, Blocks.END_STONE, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.END_STONE_TILE_SLAB, Blocks.END_STONE_BRICKS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.END_STONE_TILE_SLAB, EMDBlocks.END_STONE_TILES, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, EMDBlocks.END_STONE_TILE_WALL, Blocks.END_STONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, EMDBlocks.END_STONE_TILE_WALL, Blocks.END_STONE_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, EMDBlocks.END_STONE_TILE_WALL, EMDBlocks.END_STONE_TILES);



        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_BLACKSTONE_TILES, Blocks.BLACKSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Blocks.BLACKSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Blocks.POLISHED_BLACKSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Blocks.POLISHED_BLACKSTONE_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, EMDBlocks.POLISHED_BLACKSTONE_TILES);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Blocks.BLACKSTONE, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Blocks.POLISHED_BLACKSTONE, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Blocks.POLISHED_BLACKSTONE_BRICKS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB, EMDBlocks.POLISHED_BLACKSTONE_TILES, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, EMDBlocks.POLISHED_BLACKSTONE_TILE_WALL, Blocks.BLACKSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, EMDBlocks.POLISHED_BLACKSTONE_TILE_WALL, Blocks.POLISHED_BLACKSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, EMDBlocks.POLISHED_BLACKSTONE_TILE_WALL, Blocks.POLISHED_BLACKSTONE_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.MISC, EMDBlocks.POLISHED_BLACKSTONE_TILE_WALL, EMDBlocks.POLISHED_BLACKSTONE_TILES);



        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_STONE, Blocks.STONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_STONE_STAIRS, Blocks.STONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_STONE_SLAB, Blocks.STONE, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_STONE_WALL, Blocks.STONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.CHISELED_POLISHED_STONE, Blocks.STONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_STONE_STAIRS, EMDBlocks.POLISHED_STONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_STONE_SLAB, EMDBlocks.POLISHED_STONE, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_STONE_WALL, EMDBlocks.POLISHED_STONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.CHISELED_POLISHED_STONE, EMDBlocks.POLISHED_STONE);



        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SANDSTONE_BRICKS, Blocks.SANDSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.CHISELED_SANDSTONE_BRICKS, Blocks.SANDSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SANDSTONE_BRICK_STAIRS, Blocks.SANDSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SANDSTONE_BRICK_SLAB, Blocks.SANDSTONE, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SANDSTONE_BRICK_WALL, Blocks.SANDSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SANDSTONE_BRICKS, Blocks.CUT_SANDSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.CHISELED_SANDSTONE_BRICKS, Blocks.CUT_SANDSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SANDSTONE_BRICK_STAIRS, Blocks.CUT_SANDSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SANDSTONE_BRICK_SLAB, Blocks.CUT_SANDSTONE, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SANDSTONE_BRICK_WALL, Blocks.CUT_SANDSTONE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.CHISELED_SANDSTONE_BRICKS, EMDBlocks.SANDSTONE_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SANDSTONE_BRICK_STAIRS, EMDBlocks.SANDSTONE_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SANDSTONE_BRICK_SLAB, EMDBlocks.SANDSTONE_BRICKS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.SANDSTONE_BRICK_WALL, EMDBlocks.SANDSTONE_BRICKS);



        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_NETHER_BRICKS, Blocks.NETHER_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_NETHER_BRICK_STAIRS, Blocks.NETHER_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_NETHER_BRICK_SLAB, Blocks.NETHER_BRICKS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_NETHER_BRICK_STAIRS, EMDBlocks.POLISHED_NETHER_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_NETHER_BRICK_SLAB, EMDBlocks.POLISHED_NETHER_BRICKS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.WARP_NETHER_BRICK_STAIRS, EMDBlocks.WARP_NETHER_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.WARP_NETHER_BRICK_SLAB, EMDBlocks.WARP_NETHER_BRICKS,2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.WARP_NETHER_BRICK_WALL, EMDBlocks.WARP_NETHER_BRICKS);



        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_GRANITE_BRICKS, Blocks.GRANITE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_GRANITE_BRICK_STAIRS, Blocks.GRANITE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_GRANITE_BRICK_SLAB, Blocks.GRANITE, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_GRANITE_BRICK_WALL, Blocks.GRANITE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_GRANITE_BRICK_STAIRS, Blocks.POLISHED_GRANITE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_GRANITE_BRICK_WALL, Blocks.POLISHED_GRANITE);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_GRANITE_BRICK_STAIRS, EMDBlocks.POLISHED_GRANITE_BRICKS);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_GRANITE_BRICK_SLAB, EMDBlocks.POLISHED_GRANITE_BRICKS, 2);
        RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EMDBlocks.POLISHED_GRANITE_BRICK_WALL, EMDBlocks.POLISHED_GRANITE_BRICKS);

    }
}
