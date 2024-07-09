package net.erfmd.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.erfmd.world.EMDPlacedFeatures;
import net.minecraft.world.gen.GenerationStep;

public class EMDOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, EMDPlacedFeatures.RUBY_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES, EMDPlacedFeatures.NETHER_RUBY_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES, EMDPlacedFeatures.NETHER_IRON_ORE_PLACED_KEY);
    }
}