package net.erfmd;

import net.erfmd.block.EMDBlocks;
import net.erfmd.item.EMDGroups;
import net.erfmd.item.EMDItems;
import net.erfmd.util.EMDCustomTrades;
import net.erfmd.util.EMDLootTableModifiers;
import net.erfmd.world.gen.EMDWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EMDUniverse implements ModInitializer {
	public static final String MOD_ID = "emd_universe";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		EMDGroups.registerItemGroups();

		EMDItems.registerModItems();
		EMDBlocks.registerModBlocks();

		EMDCustomTrades.registerCustomTrades();

		EMDLootTableModifiers.modifyLootTables();

		EMDWorldGeneration.generateModWorldGen();
	}
}