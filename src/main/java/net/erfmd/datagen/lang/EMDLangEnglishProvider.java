package net.erfmd.datagen.lang;

import net.erfmd.block.EMDBlocks;
import net.erfmd.item.EMDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class EMDLangEnglishProvider extends FabricLanguageProvider {
    public EMDLangEnglishProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(EMDItems.RAW_RUBY, "Raw Ruby");
        translationBuilder.add(EMDItems.RUBY, "Ruby");

        translationBuilder.add(EMDItems.PIECE_OF_CAKE, "Piece Of Cake");
        translationBuilder.add(EMDItems.PIECE_OF_CHOCOLATE_CAKE, "Piece Of Chocolate Cake");
        translationBuilder.add(EMDItems.PIECE_OF_EXPERIMENT_115, "Piece Of \"Experiment 115\"");
        translationBuilder.add(EMDItems.PIECE_OF_EXPERIMENT_803S, "Piece Of \"Experiment 803-S\"");
        translationBuilder.add(EMDItems.CARAMEL, "Caramel");
        translationBuilder.add(EMDItems.CARAMEL_APPLE, "Caramel Apple");

        translationBuilder.add(EMDBlocks.CHOCOLATE_CAKE, "Chocolate Cake");
        translationBuilder.add(EMDBlocks.EXPERIMENT_115, "Experiment 115");
        translationBuilder.add(EMDBlocks.EXPERIMENT_803S, "Experiment 803-S");

        translationBuilder.add(EMDItems.ROSE_GOLDEN_APPLE, "Rose Golden Apple");

        translationBuilder.add(EMDItems.ROSE_GOLD_INGOT, "Rose Gold Ingot");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_SWORD, "Rose Golden Sword");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_AXE, "Rose Golden Axe");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_PICKAXE, "Rose Golden Pickaxe");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_SHOVEL, "Rose Golden Shovel");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_HOE, "Rose Golden Hoe");

        translationBuilder.add(EMDItems.ROSE_GOLDEN_HELMET, "Rose Golden Helmet");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_CHESTPLATE, "Rose Golden Chestplate");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_LEGGINGS, "Rose Golden Leggings");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_BOOTS, "Rose Golden Boots");

        translationBuilder.add(EMDItems.COPPER_COIL, "Copper Coil");
        translationBuilder.add(EMDItems.COPPER_CABLE, "Copper Cable");
        translationBuilder.add(EMDItems.ACCUMULATOR, "Accumulator");
        translationBuilder.add(EMDItems.ENERGY_BALL, "Energy Ball");
        translationBuilder.add(EMDItems.SPECIAL_STORAGE, "Special Storage");
        translationBuilder.add(EMDItems.EMERALD_DUST, "Emerald Dust");
        translationBuilder.add(EMDItems.DIAMOND_DUST, "Diamond Dust");
        translationBuilder.add(EMDItems.METAL_ALLOY, "Metal Alloy");
        translationBuilder.add(EMDItems.WARPED_NETHERITE_INGOT, "Warped Netherite Ingot");
        translationBuilder.add(EMDItems.HIGH_VOLTAGE_BATTERY, "High Voltage Battery");

        translationBuilder.add(EMDItems.RAILGUN, "Railgun");
        translationBuilder.add(EMDItems.DISSASEMBLY_CHAINSAW, "Dissasembly Chainsaw");
        translationBuilder.add(EMDItems.LM85_BLADE, "LM-85 Blade");

        translationBuilder.add(EMDItems.MEAT_CLUB, "Meat Club");
        translationBuilder.add(EMDItems.LOLLICHOP, "Lollichop");
        translationBuilder.add(EMDItems.CANDY_CANE, "Candy Cane");
        translationBuilder.add(EMDItems.WORKER_DRONE_ARM, "Worker Drone Arm");

        translationBuilder.add(EMDItems.CHERRIES, "Cherries");
        translationBuilder.add(EMDItems.BANANA, "Banana");
        translationBuilder.add(EMDItems.HONEYSUCKLE, "Honeysuckle");
        translationBuilder.add(EMDItems.CHERRY_PIE, "Cherry Pie");
        translationBuilder.add(EMDItems.HONEYSUCKLE_PIE, "Honeysuckle Pie");

        translationBuilder.add(EMDBlocks.POTATO_BLOCK, "Potato Block");
        translationBuilder.add(EMDBlocks.POISONOUS_POTATO_BLOCK, "Poisonous Potato Block");

        translationBuilder.add(EMDBlocks.RUBY_ORE, "Ruby Ore");
        translationBuilder.add(EMDBlocks.DEEPSLATE_RUBY_ORE, "Deepslate Ruby Ore");
        translationBuilder.add(EMDBlocks.NETHER_RUBY_ORE, "Iron Bar Trapdoor");
        translationBuilder.add(EMDBlocks.NETHER_IRON_ORE, "Nether Iron Ore");
        translationBuilder.add(EMDBlocks.RAW_RUBY_BLOCK, "Block of Raw Ruby");
        translationBuilder.add(EMDBlocks.RUBY_BLOCK, "Block of Ruby");
        translationBuilder.add(EMDBlocks.ROSE_GOLD_BLOCK, "Block of Rose Gold");
        translationBuilder.add(EMDBlocks.STONE_TILES, "Stone Tiles");
        translationBuilder.add(EMDBlocks.STONE_TILE_SLAB, "Stone Tile Slab");
        translationBuilder.add(EMDBlocks.STONE_TILE_STAIRS, "Stone Tile Stairs");
        translationBuilder.add(EMDBlocks.STONE_TILE_WALL, "Stone Tile Wall");
        translationBuilder.add(EMDBlocks.CRACKED_STONE_TILES, "Cracked Stone Tiles");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILES, "Polished Blackstone Tiles");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB, "Polished Blackstone Tile Slab");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, "Polished Blackstone Tile Wall");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_WALL, "Polished Blackstone Tile Stairs");
        translationBuilder.add(EMDBlocks.CRACKED_POLISHED_BLACKSTONE_TILES, "Cracked Polished Blackstone Tiles");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE, "Smooth End Stone");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE_SLAB, "Smooth End Stone Slab");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE_STAIRS, "Smooth End Stone Stairs");
        translationBuilder.add(EMDBlocks.END_STONE_TILES, "End Stone Tiles");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_SLAB, "End Stone Tile Slab");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_STAIRS, "End Stone Tile Stairs");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_WALL, "End Stone Tile Wall");
        translationBuilder.add(EMDBlocks.POLISHED_STONE, "Polished Stone");
        translationBuilder.add(EMDBlocks.POLISHED_STONE_SLAB, "Polished Stone Slab");
        translationBuilder.add(EMDBlocks.POLISHED_STONE_STAIRS, "Polished Stone Stairs");
        translationBuilder.add(EMDBlocks.CHISELED_STONE, "Chiseled Stone");
        translationBuilder.add(EMDBlocks.CHISELED_POLISHED_STONE, "Chiseled Polished Stone");
        translationBuilder.add(EMDBlocks.SANDSTONE_BRICKS, "Sandstone Bricks");
        translationBuilder.add(EMDBlocks.SANDSTONE_BRICK_SLAB, "Sandstone Brick Slab");
        translationBuilder.add(EMDBlocks.SANDSTONE_BRICK_STAIRS, "Sandstone Brick Stairs");
        translationBuilder.add(EMDBlocks.SANDSTONE_BRICK_WALL, "Sandstone Brick Wall");
        translationBuilder.add(EMDBlocks.CHISELED_SANDSTONE_BRICKS, "Chiseled Sandstone Bricks");
        translationBuilder.add(EMDBlocks.POLISHED_NETHER_BRICKS, "Polished Nether Bricks");
        translationBuilder.add(EMDBlocks.POLISHED_NETHER_BRICK_SLAB, "Polished Nether Brick Slab");
        translationBuilder.add(EMDBlocks.POLISHED_NETHER_BRICK_STAIRS, "Polished Nether Brick Stairs");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICKS, "Warp Nether Bricks");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICK_SLAB, "Warp Nether Brick Slab");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICK_STAIRS, "Warp Nether Brick Stairs");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICK_WALL, "Warp Nether Brick Wall");
        translationBuilder.add(EMDBlocks.SNOW_BRICKS, "Snow Bricks");
        translationBuilder.add(EMDBlocks.SNOW_BRICK_SLAB, "Snow Brick Slab");
        translationBuilder.add(EMDBlocks.SNOW_BRICK_STAIRS, "Snow Brick Stairs");
        translationBuilder.add(EMDBlocks.SNOW_BRICK_WALL, "Snow Brick Wall");

        translationBuilder.add(EMDBlocks.IRON_BAR_DOOR, "Iron Bar Door");
        translationBuilder.add(EMDBlocks.IRON_BAR_BLOCK, "Iron Bar Block");
        translationBuilder.add(EMDBlocks.IRON_BAR_SLAB, "Iron Bar Slab");
        translationBuilder.add(EMDBlocks.IRON_BAR_TRAPDOOR, "Iron Bar Trapdoor");

        translationBuilder.add(EMDBlocks.REDSTONE_HEART, "Redstone Heart");

        translationBuilder.add(EMDBlocks.COLORED_REDSTONE_LAMP, "Colored Redstone Lamp");
        translationBuilder.add(EMDBlocks.BLACK_REDSTONE_LAMP, "Black Redstone Lamp");
        translationBuilder.add(EMDBlocks.BLUE_REDSTONE_LAMP, "Blue Redstone Lamp");
        translationBuilder.add(EMDBlocks.BROWN_REDSTONE_LAMP, "Brown Redstone Lamp");
        translationBuilder.add(EMDBlocks.CYAN_REDSTONE_LAMP, "Cyan Redstone Lamp");
        translationBuilder.add(EMDBlocks.GRAY_REDSTONE_LAMP, "Gray Redstone Lamp");
        translationBuilder.add(EMDBlocks.GREEN_REDSTONE_LAMP, "Green Redstone Lamp");
        translationBuilder.add(EMDBlocks.LIGHT_BLUE_REDSTONE_LAMP, "Light Blue Redstone Lamp");
        translationBuilder.add(EMDBlocks.LIGHT_GRAY_REDSTONE_LAMP, "Light Gray Redstone Lamp");
        translationBuilder.add(EMDBlocks.LIME_REDSTONE_LAMP, "Lime Redstone Lamp");
        translationBuilder.add(EMDBlocks.MAGENTA_REDSTONE_LAMP, "Magenta Redstone Lamp");
        translationBuilder.add(EMDBlocks.ORANGE_REDSTONE_LAMP, "Orange Redstone Lamp");
        translationBuilder.add(EMDBlocks.PINK_REDSTONE_LAMP, "Pink Redstone Lamp");
        translationBuilder.add(EMDBlocks.PURPLE_REDSTONE_LAMP, "Purple Redstone Lamp");
        translationBuilder.add(EMDBlocks.RED_REDSTONE_LAMP, "Red Redstone Lamp");
        translationBuilder.add(EMDBlocks.WHITE_REDSTONE_LAMP, "White Redstone Lamp");
        translationBuilder.add(EMDBlocks.YELLOW_REDSTONE_LAMP, "Yellow Redstone Lamp");

        translationBuilder.add("trim_material.emd_universe.rose", "Rose Gold Material");

        translationBuilder.add("itemgroup.test", "Test");
    }
}
