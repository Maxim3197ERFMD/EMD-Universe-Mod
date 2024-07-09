package net.erfmd;

import net.erfmd.datagen.lang.EMDLangBelarusianProvider;
import net.erfmd.datagen.lang.EMDLangEnglishProvider;
import net.erfmd.datagen.lang.EMDLangRussianProvider;
import net.erfmd.datagen.lang.EMDLangUkrainianProvider;
import net.erfmd.datagen.lang.EMDLangKazakhProvider;
import net.erfmd.datagen.lang.EMDLangFinnishProvider;
import net.erfmd.datagen.lang.EMDLangGermanProvider;
import net.erfmd.datagen.lang.EMDLangFrenchProvider;
import net.erfmd.world.EMDConfiguredFeatures;
import net.erfmd.world.EMDPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.erfmd.datagen.*;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class EMDUniverseDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(EMDBlockTagProvider::new);
		pack.addProvider(EMDItemTagProvider::new);
		pack.addProvider(EMDLootTableProvider::new);
		pack.addProvider(EMDModelProvider::new);
		pack.addProvider(EMDRecipeProvider::new);
		pack.addProvider(EMDWorldGenerator::new);

		pack.addProvider(EMDLangEnglishProvider::new);
		pack.addProvider(EMDLangRussianProvider::new);
		pack.addProvider(EMDLangUkrainianProvider::new);
		pack.addProvider(EMDLangBelarusianProvider::new);
		pack.addProvider(EMDLangKazakhProvider::new);
		pack.addProvider(EMDLangGermanProvider::new);
		pack.addProvider(EMDLangFrenchProvider::new);
		pack.addProvider(EMDLangFinnishProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, EMDConfiguredFeatures::boostrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, EMDPlacedFeatures::boostrap);
	}
}
