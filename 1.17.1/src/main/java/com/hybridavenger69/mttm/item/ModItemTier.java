package com.hybridavenger69.mttm.item;

import com.hybridavenger69.lib.main.ItemRegistry;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;



public class ModItemTier {
    public static final ForgeTier TECH = new ForgeTier(2, 450, 3f,
            4f, 7, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ItemRegistry.TECH_INGOT.get()));

    public static final ForgeTier EUCLASE = new ForgeTier(3, 900, 5f,
            9f, 11, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ItemRegistry.EUCLASE_GEM.get()));
}