package net.erfmd.datagen;

import net.erfmd.item.EMDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.erfmd.block.EMDBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;

import java.util.concurrent.CompletableFuture;

public class EMDLootTableProvider extends FabricBlockLootTableProvider {
    public EMDLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(EMDBlocks.RUBY_BLOCK);
        addDrop(EMDBlocks.RAW_RUBY_BLOCK);
        addDrop(EMDBlocks.ROSE_GOLD_BLOCK);
        addDrop(EMDBlocks.STONE_TILES);
        addDrop(EMDBlocks.CRACKED_STONE_TILES);
        addDrop(EMDBlocks.POLISHED_BLACKSTONE_TILES);
        addDrop(EMDBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        addDrop(EMDBlocks.SMOOTH_END_STONE);
        addDrop(EMDBlocks.END_STONE_TILES);
        addDrop(EMDBlocks.IRON_BAR_BLOCK);
        addDrop(EMDBlocks.IRON_BAR_TRAPDOOR);
        addDrop(EMDBlocks.BLACK_REDSTONE_LAMP);
        addDrop(EMDBlocks.BLUE_REDSTONE_LAMP);
        addDrop(EMDBlocks.BROWN_REDSTONE_LAMP);
        addDrop(EMDBlocks.CYAN_REDSTONE_LAMP);
        addDrop(EMDBlocks.GRAY_REDSTONE_LAMP);
        addDrop(EMDBlocks.GREEN_REDSTONE_LAMP);
        addDrop(EMDBlocks.LIGHT_BLUE_REDSTONE_LAMP);
        addDrop(EMDBlocks.LIGHT_GRAY_REDSTONE_LAMP);
        addDrop(EMDBlocks.LIME_REDSTONE_LAMP);
        addDrop(EMDBlocks.MAGENTA_REDSTONE_LAMP);
        addDrop(EMDBlocks.ORANGE_REDSTONE_LAMP);
        addDrop(EMDBlocks.PINK_REDSTONE_LAMP);
        addDrop(EMDBlocks.PURPLE_REDSTONE_LAMP);
        addDrop(EMDBlocks.RED_REDSTONE_LAMP);
        addDrop(EMDBlocks.WHITE_REDSTONE_LAMP);
        addDrop(EMDBlocks.YELLOW_REDSTONE_LAMP);
        addDrop(EMDBlocks.REDSTONE_HEART);
        addDrop(EMDBlocks.POTATO_BLOCK);
        addDrop(EMDBlocks.POISONOUS_POTATO_BLOCK);
        addDrop(EMDBlocks.POLISHED_STONE);
        addDrop(EMDBlocks.CHISELED_STONE);
        addDrop(EMDBlocks.CHISELED_POLISHED_STONE);
        addDrop(EMDBlocks.SANDSTONE_BRICKS);
        addDrop(EMDBlocks.CHISELED_SANDSTONE_BRICKS);
        addDrop(EMDBlocks.POLISHED_NETHER_BRICKS);
        addDrop(EMDBlocks.WARP_NETHER_BRICKS);
        addDrop(EMDBlocks.POLISHED_GRANITE_BRICKS);

        addDrop(EMDBlocks.SMOOTH_END_STONE_STAIRS);
        addDrop(EMDBlocks.STONE_TILE_STAIRS);
        addDrop(EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
        addDrop(EMDBlocks.END_STONE_TILE_STAIRS);
        addDrop(EMDBlocks.POLISHED_STONE_STAIRS);
        addDrop(EMDBlocks.SANDSTONE_BRICK_STAIRS);
        addDrop(EMDBlocks.POLISHED_NETHER_BRICK_STAIRS);
        addDrop(EMDBlocks.WARP_NETHER_BRICK_STAIRS);
        addDrop(EMDBlocks.POLISHED_GRANITE_BRICK_STAIRS);

        addDrop(EMDBlocks.IRON_BAR_DOOR, doorDrops(EMDBlocks.IRON_BAR_DOOR));

        addDrop(EMDBlocks.SMOOTH_END_STONE_SLAB, slabDrops(EMDBlocks.SMOOTH_END_STONE_SLAB));
        addDrop(EMDBlocks.STONE_TILE_SLAB, slabDrops(EMDBlocks.STONE_TILE_SLAB));
        addDrop(EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB, slabDrops(EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB));
        addDrop(EMDBlocks.END_STONE_TILE_SLAB, slabDrops(EMDBlocks.END_STONE_TILE_SLAB));
        addDrop(EMDBlocks.IRON_BAR_SLAB, slabDrops(EMDBlocks.IRON_BAR_SLAB));
        addDrop(EMDBlocks.POLISHED_STONE_SLAB, slabDrops(EMDBlocks.POLISHED_STONE_SLAB));
        addDrop(EMDBlocks.SANDSTONE_BRICK_SLAB, slabDrops(EMDBlocks.SANDSTONE_BRICK_SLAB));
        addDrop(EMDBlocks.POLISHED_NETHER_BRICK_SLAB, slabDrops(EMDBlocks.POLISHED_NETHER_BRICK_SLAB));
        addDrop(EMDBlocks.WARP_NETHER_BRICK_SLAB, slabDrops(EMDBlocks.WARP_NETHER_BRICK_SLAB));
        addDrop(EMDBlocks.SNOW_BRICK_SLAB, slabDrops(EMDBlocks.SNOW_BRICK_SLAB));
        addDrop(EMDBlocks.POLISHED_GRANITE_BRICK_SLAB, slabDrops(EMDBlocks.POLISHED_GRANITE_BRICK_SLAB));

        addDrop(EMDBlocks.STONE_TILE_WALL);
        addDrop(EMDBlocks.POLISHED_BLACKSTONE_TILE_WALL);
        addDrop(EMDBlocks.END_STONE_TILE_WALL);
        addDrop(EMDBlocks.POLISHED_STONE_WALL);
        addDrop(EMDBlocks.SANDSTONE_BRICK_WALL);
        addDrop(EMDBlocks.WARP_NETHER_BRICK_WALL);
        addDrop(EMDBlocks.SNOW_BRICK_WALL);
        addDrop(EMDBlocks.POLISHED_GRANITE_BRICK_WALL);

        addDrop(EMDBlocks.RUBY_ORE, copperOreDrops(EMDBlocks.RUBY_ORE, EMDItems.RAW_RUBY));
        addDrop(EMDBlocks.DEEPSLATE_RUBY_ORE, copperOreDrops(EMDBlocks.DEEPSLATE_RUBY_ORE, EMDItems.RAW_RUBY));
        addDrop(EMDBlocks.NETHER_RUBY_ORE, copperOreDrops(EMDBlocks.NETHER_RUBY_ORE, EMDItems.RAW_RUBY));
        addDrop(EMDBlocks.NETHER_IRON_ORE, copperLikeOreDrops(EMDBlocks.NETHER_IRON_ORE, Items.IRON_NUGGET));
    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
    public LootTable.Builder copperOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
