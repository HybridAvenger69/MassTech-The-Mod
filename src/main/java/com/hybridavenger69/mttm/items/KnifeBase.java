package com.hybridavenger69.mttm.items;

import com.hybridavenger69.mttm.Main;
import com.hybridavenger69.mttm.init.ModItems;
import com.hybridavenger69.mttm.util.IHasModel;

import net.minecraft.item.Item;

public class KnifeBase extends Item implements IHasModel 
{

	public  KnifeBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.mttmtab);
		
		boolean type = false;
		this.hasSubtypes =  type;
		this.setMaxDamage( 50 );
		this.setMaxStackSize( 1 );
		
		ModItems.ITEMS.add(this);
	}
	
	
	

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
