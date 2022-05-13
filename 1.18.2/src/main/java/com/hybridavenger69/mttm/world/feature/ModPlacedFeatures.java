package com.hybridavenger69.mttm.world.feature;

import com.hybridavenger69.mttm.world.feature.ModConfiguredFeatures;
import com.hybridavenger69.mttm.world.feature.ModOrePlacement;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> TECH_ORE_PLACED = PlacementUtils.register("tech_ore_placed",
            ModConfiguredFeatures.TECH_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
}
