package com.hybridavenger69.mttm.tabs;

import com.hybridavenger69.mttm.init.ModBlocks;
 

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MttmTab extends CreativeTabs 
{
	public MttmTab(String labe) {super("mttmtab"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModBlocks.FUSION_FURNACE);}

}