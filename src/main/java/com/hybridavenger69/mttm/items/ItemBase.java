package com.hybridavenger69.mttm.items;

import com.hybridavenger69.mttm.MTTM;
import com.hybridavenger69.mttm.init.ModItems;
import com.hybridavenger69.mttm.utils.Interfaces.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MTTM.mttmtab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		MTTM.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
