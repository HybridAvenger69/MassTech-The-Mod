package com.hybridavenger69.mttm.world.feature;

import com.hybridavenger69.mttm.blocks.BlockRegistry;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TECH_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.TECH_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEPSLATE_TECH_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_EUCLASE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockRegistry.EUCLASE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockRegistry.DEEPSLATE_EUCLASE_ORE.get().defaultBlockState()));



    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TECH_ORE = FeatureUtils.register("tech_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_TECH_ORES, 9));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> EUCLASE_ORE = FeatureUtils.register("euclase_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_EUCLASE_ORES, 9));
}
