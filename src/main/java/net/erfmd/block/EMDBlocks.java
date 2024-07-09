package net.erfmd.block;

import net.erfmd.EMDUniverse;
import net.erfmd.block.custom.ChocolateCakeBlock;
import net.erfmd.block.custom.Experiment_115_Block;
import net.erfmd.block.custom.Experiment_803S_Block;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class EMDBlocks {

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE)));
    public static final Block NETHER_IRON_ORE = registerBlock("nether_iron_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE)));
    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK)));
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block STONE_TILES = registerBlock("stone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_TILES = registerBlock("polished_blackstone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_TILES = registerBlock("cracked_polished_blackstone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block SMOOTH_END_STONE = registerBlock("smooth_end_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block END_STONE_TILES = registerBlock("end_stone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));



    public static final Block STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            new StairsBlock(EMDBlocks.STONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STONE_BRICK_STAIRS)));
    public static final Block STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_SLAB)));
    public static final Block POLISHED_BLACKSTONE_TILE_STAIRS = registerBlock("polished_blackstone_tile_stairs",
            new StairsBlock(EMDBlocks.POLISHED_BLACKSTONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS)));
    public static final Block POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("polished_blackstone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)));
    public static final Block SMOOTH_END_STONE_STAIRS = registerBlock("smooth_end_stone_stairs",
            new StairsBlock(EMDBlocks.STONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.END_STONE_BRICK_STAIRS)));
    public static final Block SMOOTH_END_STONE_SLAB = registerBlock("smooth_end_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICK_SLAB)));
    public static final Block END_STONE_TILE_STAIRS = registerBlock("end_stone_tile_stairs",
            new StairsBlock(EMDBlocks.STONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.END_STONE_BRICK_STAIRS)));
    public static final Block END_STONE_TILE_SLAB = registerBlock("end_stone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICK_SLAB)));



    public static final Block STONE_TILE_WALL = registerBlock("stone_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_WALL)));
    public static final Block POLISHED_BLACKSTONE_TILE_WALL = registerBlock("polished_blackstone_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICK_WALL)));
    public static final Block END_STONE_TILE_WALL = registerBlock("end_stone_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICK_WALL)));



    public static final Block REDSTONE_HEART = registerBlock("redstone_heart",
            new RedstoneBlock(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));



    public static final Block BLACK_REDSTONE_LAMP = registerBlock("black_redstone_lamp",
            new RedstoneLampBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block BLUE_REDSTONE_LAMP = registerBlock("blue_redstone_lamp",
            new RedstoneLampBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block BROWN_REDSTONE_LAMP = registerBlock("brown_redstone_lamp",
            new RedstoneLampBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block CYAN_REDSTONE_LAMP = registerBlock("cyan_redstone_lamp",
            new RedstoneLampBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block GRAY_REDSTONE_LAMP = registerBlock("gray_redstone_lamp",
            new RedstoneLampBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block GREEN_REDSTONE_LAMP = registerBlock("green_redstone_lamp",
            new RedstoneLampBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block LIGHT_BLUE_REDSTONE_LAMP = registerBlock("light_blue_redstone_lamp",
            new RedstoneLampBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block LIGHT_GRAY_REDSTONE_LAMP = registerBlock("light_gray_redstone_lamp",
            new RedstoneLampBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block LIME_REDSTONE_LAMP = registerBlock("lime_redstone_lamp",
            new RedstoneLampBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block MAGENTA_REDSTONE_LAMP = registerBlock("magenta_redstone_lamp",
            new RedstoneLampBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block ORANGE_REDSTONE_LAMP = registerBlock("orange_redstone_lamp",
            new RedstoneLampBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block PINK_REDSTONE_LAMP = registerBlock("pink_redstone_lamp",
            new RedstoneLampBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block PURPLE_REDSTONE_LAMP = registerBlock("purple_redstone_lamp",
            new RedstoneLampBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block RED_REDSTONE_LAMP = registerBlock("red_redstone_lamp",
            new RedstoneLampBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block WHITE_REDSTONE_LAMP = registerBlock("white_redstone_lamp",
            new RedstoneLampBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block YELLOW_REDSTONE_LAMP = registerBlock("yellow_redstone_lamp",
            new RedstoneLampBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));
    public static final Block COLORED_REDSTONE_LAMP = registerBlock("colored_redstone_lamp",
            new RedstoneLampBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_LAMP)
                    .luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0 )));



    public static final Block IRON_BAR_DOOR = registerBlock("iron_bar_door",
            new DoorBlock(BlockSetType.BAMBOO, AbstractBlock.Settings.copy(Blocks.IRON_DOOR).nonOpaque()));
    public static final Block IRON_BAR_TRAPDOOR = registerBlock("iron_bar_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.copy(Blocks.CHAIN)
                    .sounds(BlockSoundGroup.METAL).nonOpaque()));
    public static final Block IRON_BAR_BLOCK = registerBlock("iron_bar_block",
            new Block(AbstractBlock.Settings.copy(Blocks.CHAIN).sounds(BlockSoundGroup.METAL)));
    public static final Block IRON_BAR_SLAB = registerBlock("iron_bar_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHAIN).sounds(BlockSoundGroup.METAL)));



    public static final Block CHOCOLATE_CAKE = registerBlock("chocolate_cake",
            new ChocolateCakeBlock(AbstractBlock.Settings.copy(Blocks.CAKE)));
    public static final Block EXPERIMENT_115 = registerBlock("experiment_115",
            new Experiment_115_Block(AbstractBlock.Settings.copy(Blocks.CAKE)));
    public static final Block EXPERIMENT_803S = registerBlock("experiment_803-s",
            new Experiment_803S_Block(AbstractBlock.Settings.copy(Blocks.CAKE)));



    public static final Block POTATO_BLOCK = registerBlock("potato_block",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK)));
    public static final Block POISONOUS_POTATO_BLOCK = registerBlock("poisonous_potato_block",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK)));



    public static final Block ROSE_GOLD_BLOCK = registerBlock("rose_gold_block",
            new Block(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));

    public static final Block POLISHED_STONE = registerBlock("polished_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));
    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            new StairsBlock(EMDBlocks.POLISHED_STONE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.STONE_STAIRS)));
    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE_SLAB)));
    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE_WALL)));
    public static final Block CHISELED_STONE = registerBlock("chiseled_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block CHISELED_POLISHED_STONE = registerBlock("chiseled_polished_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block CHISELED_SANDSTONE_BRICKS = registerBlock("chiseled_sandstone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            new StairsBlock(EMDBlocks.SANDSTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.SANDSTONE_STAIRS)));
    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE_SLAB)));
    public static final Block SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE_WALL)));

    public static final Block POLISHED_NETHER_BRICKS = registerBlock("polished_nether_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS)));
    public static final Block POLISHED_NETHER_BRICK_STAIRS = registerBlock("polished_nether_brick_stairs",
            new StairsBlock(EMDBlocks.POLISHED_NETHER_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_STAIRS)));
    public static final Block POLISHED_NETHER_BRICK_SLAB = registerBlock("polished_nether_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_SLAB)));
    public static final Block WARP_NETHER_BRICKS = registerBlock("warp_nether_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS)));
    public static final Block WARP_NETHER_BRICK_STAIRS = registerBlock("warp_nether_brick_stairs",
            new StairsBlock(EMDBlocks.WARP_NETHER_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICK_STAIRS)));
    public static final Block WARP_NETHER_BRICK_SLAB = registerBlock("warp_nether_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICK_SLAB)));
    public static final Block WARP_NETHER_BRICK_WALL = registerBlock("warp_nether_bricks_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICK_WALL)));



    public static final Block SNOW_BRICKS = registerBlock("snow_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK)));
    public static final Block SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            new StairsBlock(EMDBlocks.SNOW_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK)));
    public static final Block SNOW_BRICK_SLAB = registerBlock("snow_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK)));
    public static final Block SNOW_BRICK_WALL = registerBlock("snow_bricks_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK)));



    public static final Block POLISHED_GRANITE_BRICKS = registerBlock("polished_granite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_BRICK_STAIRS = registerBlock("polished_granite_brick_stairs",
            new StairsBlock(EMDBlocks.POLISHED_GRANITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_BRICK_SLAB = registerBlock("polished_granite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_BRICK_WALL = registerBlock("polished_granite_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(EMDUniverse.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(EMDUniverse.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        EMDUniverse.LOGGER.info("Registering Mod Items for EMD Universe" + EMDUniverse.MOD_ID);
    }
}
