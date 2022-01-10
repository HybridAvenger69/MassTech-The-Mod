package com.hybridavenger69.mttm.blocks;


import com.hybridavenger69.mttm.Main;
import com.hybridavenger69.mttm.init.ModBlocks;
import com.hybridavenger69.mttm.init.ModItems;
import com.hybridavenger69.mttm.utils.Interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;


public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.mttmtab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
