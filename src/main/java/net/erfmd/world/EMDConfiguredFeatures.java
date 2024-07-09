package net.erfmd.world;

import net.erfmd.EMDUniverse;
import net.erfmd.block.EMDBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class EMDConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE_KEY = registerKey("nether_ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_IRON_ORE_KEY = registerKey("nether_iron_ore");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneRubyReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateRubyReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherRubyReplacables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);

        RuleTest netherIronReplacables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);


        List<OreFeatureConfig.Target> overworldRubyOres =
                List.of(OreFeatureConfig.createTarget(stoneRubyReplacables, EMDBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateRubyReplacables, EMDBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherRubyOres =
                List.of(OreFeatureConfig.createTarget(netherRubyReplacables, EMDBlocks.NETHER_RUBY_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherIronOres =
                List.of(OreFeatureConfig.createTarget(netherIronReplacables, EMDBlocks.NETHER_IRON_ORE.getDefaultState()));


        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 3));
        register(context, NETHER_RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherRubyOres, 3));

        register(context, NETHER_IRON_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherIronOres, 10));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(EMDUniverse.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
