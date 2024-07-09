package net.erfmd.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.erfmd.block.EMDBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class EMDBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public EMDBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(EMDBlocks.RAW_RUBY_BLOCK)
                .add(EMDBlocks.RUBY_BLOCK)
                .add(EMDBlocks.RUBY_ORE)
                .add(EMDBlocks.ROSE_GOLD_BLOCK)
                .add(EMDBlocks.DEEPSLATE_RUBY_ORE)
                .add(EMDBlocks.NETHER_RUBY_ORE)
                .add(EMDBlocks.NETHER_IRON_ORE)
                .add(EMDBlocks.STONE_TILES)
                .add(EMDBlocks.CRACKED_STONE_TILES)
                .add(EMDBlocks.POLISHED_BLACKSTONE_TILES)
                .add(EMDBlocks.CRACKED_POLISHED_BLACKSTONE_TILES)
                .add(EMDBlocks.STONE_TILE_STAIRS)
                .add(EMDBlocks.STONE_TILE_SLAB)
                .add(EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS)
                .add(EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB)
                .add(EMDBlocks.SMOOTH_END_STONE)
                .add(EMDBlocks.SMOOTH_END_STONE_STAIRS)
                .add(EMDBlocks.SMOOTH_END_STONE_SLAB)
                .add(EMDBlocks.END_STONE_TILES)
                .add(EMDBlocks.END_STONE_TILE_STAIRS)
                .add(EMDBlocks.END_STONE_TILE_SLAB)
                .add(EMDBlocks.REDSTONE_HEART)
                .add(EMDBlocks.IRON_BAR_BLOCK)
                .add(EMDBlocks.IRON_BAR_SLAB)
                .add(EMDBlocks.IRON_BAR_DOOR)
                .add(EMDBlocks.IRON_BAR_TRAPDOOR)
                .add(EMDBlocks.POLISHED_STONE)
                .add(EMDBlocks.POLISHED_STONE_STAIRS)
                .add(EMDBlocks.POLISHED_STONE_SLAB)
                .add(EMDBlocks.POLISHED_STONE_WALL)
                .add(EMDBlocks.CHISELED_STONE)
                .add(EMDBlocks.CHISELED_POLISHED_STONE)
                .add(EMDBlocks.SANDSTONE_BRICKS)
                .add(EMDBlocks.CHISELED_SANDSTONE_BRICKS)
                .add(EMDBlocks.SANDSTONE_BRICK_STAIRS)
                .add(EMDBlocks.SANDSTONE_BRICK_SLAB)
                .add(EMDBlocks.SANDSTONE_BRICK_WALL)
                .add(EMDBlocks.POLISHED_NETHER_BRICKS)
                .add(EMDBlocks.POLISHED_NETHER_BRICK_STAIRS)
                .add(EMDBlocks.POLISHED_NETHER_BRICK_SLAB)
                .add(EMDBlocks.WARP_NETHER_BRICKS)
                .add(EMDBlocks.WARP_NETHER_BRICK_STAIRS)
                .add(EMDBlocks.WARP_NETHER_BRICK_SLAB)
                .add(EMDBlocks.WARP_NETHER_BRICK_WALL)
                .add(EMDBlocks.POLISHED_GRANITE_BRICKS)
                .add(EMDBlocks.POLISHED_GRANITE_BRICK_STAIRS)
                .add(EMDBlocks.POLISHED_GRANITE_BRICK_SLAB)
                .add(EMDBlocks.POLISHED_GRANITE_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(EMDBlocks.STONE_TILE_STAIRS)
                .add(EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS)
                .add(EMDBlocks.SMOOTH_END_STONE_STAIRS)
                .add(EMDBlocks.END_STONE_TILE_STAIRS)
                .add(EMDBlocks.POLISHED_STONE_STAIRS)
                .add(EMDBlocks.SANDSTONE_BRICK_STAIRS)
                .add(EMDBlocks.POLISHED_NETHER_BRICK_STAIRS)
                .add(EMDBlocks.WARP_NETHER_BRICK_STAIRS)
                .add(EMDBlocks.SNOW_BRICK_STAIRS)
                .add(EMDBlocks.POLISHED_GRANITE_BRICK_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(EMDBlocks.STONE_TILE_SLAB)
                .add(EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB)
                .add(EMDBlocks.SMOOTH_END_STONE_SLAB)
                .add(EMDBlocks.END_STONE_TILE_SLAB)
                .add(EMDBlocks.IRON_BAR_SLAB)
                .add(EMDBlocks.POLISHED_STONE_SLAB)
                .add(EMDBlocks.SANDSTONE_BRICK_SLAB)
                .add(EMDBlocks.POLISHED_NETHER_BRICK_SLAB)
                .add(EMDBlocks.WARP_NETHER_BRICK_SLAB)
                .add(EMDBlocks.SNOW_BRICK_SLAB)
                .add(EMDBlocks.POLISHED_GRANITE_BRICK_SLAB);

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(EMDBlocks.IRON_BAR_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(EMDBlocks.IRON_BAR_DOOR);

        getOrCreateTagBuilder(BlockTags.CANDLE_CAKES)
                .add(EMDBlocks.CHOCOLATE_CAKE)
                .add(EMDBlocks.EXPERIMENT_803S)
                .add(EMDBlocks.EXPERIMENT_115);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(EMDBlocks.STONE_TILE_WALL)
                .add(EMDBlocks.POLISHED_BLACKSTONE_TILE_WALL)
                .add(EMDBlocks.END_STONE_TILE_WALL)
                .add(EMDBlocks.POLISHED_STONE_WALL)
                .add(EMDBlocks.SANDSTONE_BRICK_WALL)
                .add(EMDBlocks.WARP_NETHER_BRICK_WALL)
                .add(EMDBlocks.SNOW_BRICK_WALL)
                .add(EMDBlocks.POLISHED_GRANITE_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(EMDBlocks.BLACK_REDSTONE_LAMP)
                .add(EMDBlocks.BLUE_REDSTONE_LAMP)
                .add(EMDBlocks.BROWN_REDSTONE_LAMP)
                .add(EMDBlocks.CYAN_REDSTONE_LAMP)
                .add(EMDBlocks.GRAY_REDSTONE_LAMP)
                .add(EMDBlocks.GREEN_REDSTONE_LAMP)
                .add(EMDBlocks.LIGHT_BLUE_REDSTONE_LAMP)
                .add(EMDBlocks.LIGHT_GRAY_REDSTONE_LAMP)
                .add(EMDBlocks.LIME_REDSTONE_LAMP)
                .add(EMDBlocks.MAGENTA_REDSTONE_LAMP)
                .add(EMDBlocks.ORANGE_REDSTONE_LAMP)
                .add(EMDBlocks.PINK_REDSTONE_LAMP)
                .add(EMDBlocks.PURPLE_REDSTONE_LAMP)
                .add(EMDBlocks.RED_REDSTONE_LAMP)
                .add(EMDBlocks.WHITE_REDSTONE_LAMP)
                .add(EMDBlocks.YELLOW_REDSTONE_LAMP)
                .add(EMDBlocks.COLORED_REDSTONE_LAMP);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(EMDBlocks.RAW_RUBY_BLOCK)
                .add(EMDBlocks.RUBY_BLOCK)
                .add(EMDBlocks.RUBY_ORE)
                .add(EMDBlocks.DEEPSLATE_RUBY_ORE)
                .add(EMDBlocks.NETHER_RUBY_ORE);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(EMDBlocks.SNOW_BRICKS)
                .add(EMDBlocks.SNOW_BRICK_STAIRS)
                .add(EMDBlocks.SNOW_BRICK_SLAB)
                .add(EMDBlocks.SNOW_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(EMDBlocks.POTATO_BLOCK)
                .add(EMDBlocks.POISONOUS_POTATO_BLOCK);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(EMDBlocks.RUBY_BLOCK)
                .add(EMDBlocks.ROSE_GOLD_BLOCK);
    }
}
