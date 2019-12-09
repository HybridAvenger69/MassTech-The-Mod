package com.hybridavenger69.mttm.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


public class FusionRecipes {
	
	public static void init() {
		
	    
	}

	private static void addFusionRecipe(ItemStack itemStack, ItemStack itemStack2, ItemStack itemStack3, float f) {
		// TODO Auto-generated method stub
		
		addFusionRecipe(new ItemStack(Items.IRON_INGOT), new ItemStack(Items.NETHER_STAR), new ItemStack(ModItems.NETHER_INGOT), 5.0F);
	}

}