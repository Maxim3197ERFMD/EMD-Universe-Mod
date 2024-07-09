package net.erfmd.item;

import net.erfmd.EMDUniverse;
import net.erfmd.block.EMDBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class EMDGroups {
    public static final ItemGroup TEST_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(EMDUniverse.MOD_ID, "test"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.test"))
                    .icon(() -> new ItemStack(EMDItems.EMD_ICON)).entries((displayContext, entries) -> {
                        entries.add(EMDBlocks.NETHER_IRON_ORE);
                        entries.add(EMDBlocks.RUBY_ORE);
                        entries.add(EMDBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(EMDBlocks.NETHER_RUBY_ORE);
                        entries.add(EMDBlocks.RAW_RUBY_BLOCK);
                        entries.add(EMDBlocks.RUBY_BLOCK);

                        entries.add(EMDItems.RAW_RUBY);
                        entries.add(EMDItems.RUBY);

                        entries.add(EMDItems.DISSASEMBLY_CHAINSAW);
                        entries.add(EMDItems.LM85_BLADE);

                        entries.add(EMDBlocks.STONE_TILES);
                        entries.add(EMDBlocks.CRACKED_STONE_TILES);
                        entries.add(EMDBlocks.STONE_TILE_STAIRS);
                        entries.add(EMDBlocks.STONE_TILE_SLAB);
                        entries.add(EMDBlocks.STONE_TILE_WALL);
                        entries.add(EMDBlocks.CHISELED_STONE);
                        entries.add(EMDBlocks.POLISHED_STONE);
                        entries.add(EMDBlocks.CHISELED_POLISHED_STONE);
                        entries.add(EMDBlocks.POLISHED_STONE_STAIRS);
                        entries.add(EMDBlocks.POLISHED_STONE_SLAB);
                        entries.add(EMDBlocks.POLISHED_STONE_WALL);
                        entries.add(EMDBlocks.POLISHED_GRANITE_BRICKS);
                        entries.add(EMDBlocks.POLISHED_GRANITE_BRICK_STAIRS);
                        entries.add(EMDBlocks.POLISHED_GRANITE_BRICK_SLAB);
                        entries.add(EMDBlocks.POLISHED_GRANITE_BRICK_WALL);
                        entries.add(EMDBlocks.POLISHED_BLACKSTONE_TILES);
                        entries.add(EMDBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
                        entries.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
                        entries.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB);
                        entries.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_WALL);
                        entries.add(EMDBlocks.SNOW_BRICKS);
                        entries.add(EMDBlocks.SNOW_BRICK_STAIRS);
                        entries.add(EMDBlocks.SNOW_BRICK_SLAB);
                        entries.add(EMDBlocks.SNOW_BRICK_WALL);
                        entries.add(EMDBlocks.SANDSTONE_BRICKS);
                        entries.add(EMDBlocks.CHISELED_SANDSTONE_BRICKS);
                        entries.add(EMDBlocks.SANDSTONE_BRICK_STAIRS);
                        entries.add(EMDBlocks.SANDSTONE_BRICK_SLAB);
                        entries.add(EMDBlocks.SANDSTONE_BRICK_WALL);
                        entries.add(EMDBlocks.POLISHED_NETHER_BRICKS);
                        entries.add(EMDBlocks.POLISHED_NETHER_BRICK_STAIRS);
                        entries.add(EMDBlocks.POLISHED_NETHER_BRICK_SLAB);
                        entries.add(EMDBlocks.WARP_NETHER_BRICKS);
                        entries.add(EMDBlocks.WARP_NETHER_BRICK_STAIRS);
                        entries.add(EMDBlocks.WARP_NETHER_BRICK_SLAB);
                        entries.add(EMDBlocks.WARP_NETHER_BRICK_WALL);
                        entries.add(EMDBlocks.SMOOTH_END_STONE);
                        entries.add(EMDBlocks.SMOOTH_END_STONE_STAIRS);
                        entries.add(EMDBlocks.SMOOTH_END_STONE_SLAB);
                        entries.add(EMDBlocks.END_STONE_TILES);
                        entries.add(EMDBlocks.END_STONE_TILE_STAIRS);
                        entries.add(EMDBlocks.END_STONE_TILE_SLAB);
                        entries.add(EMDBlocks.END_STONE_TILE_WALL);
                        entries.add(EMDBlocks.IRON_BAR_BLOCK);
                        entries.add(EMDBlocks.IRON_BAR_SLAB);
                        entries.add(EMDBlocks.IRON_BAR_TRAPDOOR);
                        entries.add(EMDBlocks.IRON_BAR_DOOR);

                        entries.add(EMDBlocks.BLACK_REDSTONE_LAMP);
                        entries.add(EMDBlocks.BLUE_REDSTONE_LAMP);
                        entries.add(EMDBlocks.BROWN_REDSTONE_LAMP);
                        entries.add(EMDBlocks.CYAN_REDSTONE_LAMP);
                        entries.add(EMDBlocks.GRAY_REDSTONE_LAMP);
                        entries.add(EMDBlocks.GREEN_REDSTONE_LAMP);
                        entries.add(EMDBlocks.LIGHT_BLUE_REDSTONE_LAMP);
                        entries.add(EMDBlocks.LIGHT_GRAY_REDSTONE_LAMP);
                        entries.add(EMDBlocks.LIME_REDSTONE_LAMP);
                        entries.add(EMDBlocks.MAGENTA_REDSTONE_LAMP);
                        entries.add(EMDBlocks.ORANGE_REDSTONE_LAMP);
                        entries.add(EMDBlocks.PINK_REDSTONE_LAMP);
                        entries.add(EMDBlocks.PURPLE_REDSTONE_LAMP);
                        entries.add(EMDBlocks.RED_REDSTONE_LAMP);
                        entries.add(EMDBlocks.WHITE_REDSTONE_LAMP);
                        entries.add(EMDBlocks.YELLOW_REDSTONE_LAMP);
                        entries.add(EMDBlocks.REDSTONE_HEART);

                        entries.add(EMDBlocks.CHOCOLATE_CAKE);
                        entries.add(EMDBlocks.EXPERIMENT_115);
                        entries.add(EMDBlocks.EXPERIMENT_803S);
                        entries.add(EMDItems.PIECE_OF_CAKE);
                        entries.add(EMDItems.PIECE_OF_CHOCOLATE_CAKE);
                        entries.add(EMDItems.PIECE_OF_EXPERIMENT_115);
                        entries.add(EMDItems.PIECE_OF_EXPERIMENT_803S);
                        entries.add(EMDItems.CARAMEL);
                        entries.add(EMDItems.CARAMEL_APPLE);

                        entries.add(EMDItems.MEAT_CLUB);
                        entries.add(EMDItems.LOLLICHOP);
                        entries.add(EMDItems.CANDY_CANE);
                        entries.add(EMDItems.WORKER_DRONE_ARM);

                        entries.add(EMDItems.ROSE_GOLD_INGOT);
                        entries.add(EMDItems.ROSE_GOLDEN_SWORD);
                        entries.add(EMDItems.ROSE_GOLDEN_AXE);
                        entries.add(EMDItems.ROSE_GOLDEN_PICKAXE);
                        entries.add(EMDItems.ROSE_GOLDEN_SHOVEL);
                        entries.add(EMDItems.ROSE_GOLDEN_HOE);
                        entries.add(EMDItems.ROSE_GOLDEN_HELMET);
                        entries.add(EMDItems.ROSE_GOLDEN_CHESTPLATE);
                        entries.add(EMDItems.ROSE_GOLDEN_LEGGINGS);
                        entries.add(EMDItems.ROSE_GOLDEN_BOOTS);
                        entries.add(EMDBlocks.ROSE_GOLD_BLOCK);

                        entries.add(EMDItems.ROSE_GOLDEN_APPLE);

                        entries.add(EMDItems.CHERRIES);
                        entries.add(EMDItems.BANANA);
                        entries.add(EMDItems.HONEYSUCKLE);
                        entries.add(EMDItems.CHERRY_PIE);
                        entries.add(EMDItems.HONEYSUCKLE_PIE);
                    }).build());

    public static void registerItemGroups() {
        EMDUniverse.LOGGER.info("Registering Item Groups for EMD Universe" + EMDUniverse.MOD_ID);
    }
}
