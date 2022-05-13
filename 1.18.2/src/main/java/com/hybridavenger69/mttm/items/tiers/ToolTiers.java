package com.hybridavenger69.mttm.items.tiers;

import com.hybridavenger69.hlib.main.ItemRegistry;
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
}
