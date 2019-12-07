package com.hybridavenger69.mttm.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.TECH_ORE, new ItemStack(ModItems.TECH_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(ModItems.TECH_DUST, new ItemStack(ModItems.TECH_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(Items.NETHER_STAR, new ItemStack(ModItems.NETHER_INGOT, 1), 2.5f);
	
	}

}
