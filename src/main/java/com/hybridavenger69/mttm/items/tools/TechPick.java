package com.hybridavenger69.mttm.items.tools;

import com.hybridavenger69.mttm.Main;
import com.hybridavenger69.mttm.init.ModItems;
import com.hybridavenger69.mttm.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class TechPick extends ItemPickaxe implements IHasModel {

public TechPick(String name, ToolMaterial material) {
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.mttmtab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
