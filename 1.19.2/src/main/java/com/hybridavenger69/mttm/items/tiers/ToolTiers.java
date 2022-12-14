package com.hybridavenger69.mttm.items.tiers;

import com.hybridavenger69.hybridlib.main.ItemRegistry;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ToolTiers {
    public static ForgeTier TECH = new ForgeTier(2,450,3f,
            4f, 7, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ItemRegistry.TECH_INGOT.get()));

    public static ForgeTier EUCLASE = new ForgeTier(3,900,5f,
            9f, 11, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ItemRegistry.EUCLASE_GEM.get()));

    public static ForgeTier ICARUS = new ForgeTier(4, 1800, 5.5f,
            11f, 15, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ItemRegistry.NETHER_INGOT.get()));

    public static ForgeTier ICARUS2 =  new ForgeTier(5, 25000, 6F,
            12f, 32, Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ItemRegistry.NETHER_INGOT.get()));
}
