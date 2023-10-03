package com.hybridavenger69.mttm.items.tiers;

import com.hybridavenger69.hybridlib.main.ItemRegistry;

import com.hybridavenger69.mttm.MTTM;
import com.hybridavenger69.mttm.items.registry.OtherRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ToolTiers {


    public static Tier TECH;
    public static Tier EUCLASE;
    public static Tier ICARUS;
    public static Tier ICARUS2;

    static {
        TECH = TierSortingRegistry.registerTier(
                new ForgeTier(2, 450, 3f, 4f, 7,
                        Tags.Blocks.ORES, () -> Ingredient.of(ItemRegistry.TECH_INGOT.get())),
                new ResourceLocation(MTTM.MOD_ID, "tech"), List.of(Tiers.IRON), List.of());
    }

    static {
        EUCLASE = TierSortingRegistry.registerTier(
                new ForgeTier(3, 900, 5f, 9f, 11,
                        Tags.Blocks.ORES, () -> Ingredient.of(ItemRegistry.EUCLASE_GEM.get())),
                new ResourceLocation(MTTM.MOD_ID, "euclase"), List.of(Tiers.DIAMOND), List.of());
    }

    static {
        ICARUS = TierSortingRegistry.registerTier(
                new ForgeTier(4, 1800, 7f, 12f, 15,
                        Tags.Blocks.ORES, () -> Ingredient.of(ItemRegistry.NETHER_INGOT.get())),
                new ResourceLocation(MTTM.MOD_ID, "icarus"), List.of(Tiers.NETHERITE), List.of());
    }

    static {
        ICARUS2 = TierSortingRegistry.registerTier(
                new ForgeTier(4, 25000, 8f, 18f, 32,
                        Tags.Blocks.ORES, () -> Ingredient.of(ItemRegistry.DOUBLE_NETHERITE_INGOT.get())),
                new ResourceLocation(MTTM.MOD_ID, "icarus2"), List.of(Tiers.NETHERITE), List.of());
    }
}
