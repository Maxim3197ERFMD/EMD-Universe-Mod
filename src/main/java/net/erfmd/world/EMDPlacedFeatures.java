package net.erfmd.world;

import net.erfmd.EMDUniverse;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class EMDPlacedFeatures {
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_RUBY_ORE_PLACED_KEY = registerKey("nether_ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_IRON_ORE_PLACED_KEY = registerKey("nether_iron_ore_placed");

    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(EMDConfiguredFeatures.RUBY_ORE_KEY),
                EMDOrePlacement.modifiersWithCount(3,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-32), YOffset.fixed(12))));
        register(context, NETHER_RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(EMDConfiguredFeatures.NETHER_RUBY_ORE_KEY),
                EMDOrePlacement.modifiersWithCount(3,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(104), YOffset.fixed(120))));
        register(context, NETHER_IRON_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(EMDConfiguredFeatures.NETHER_IRON_ORE_KEY),
                EMDOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(10), YOffset.belowTop(10))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(EMDUniverse.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
