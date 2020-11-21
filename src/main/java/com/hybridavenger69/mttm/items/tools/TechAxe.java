package com.hybridavenger69.mttm.items.tools;

import com.hybridavenger69.mttm.MTTM;
import com.hybridavenger69.mttm.init.ModItems;
import com.hybridavenger69.mttm.utils.Interfaces.IHasModel;

import net.minecraft.item.ItemAxe;

public class TechAxe extends ItemAxe implements IHasModel
{

	public TechAxe(String name, ToolMaterial material){
		
		
		          super(material, 6.0F, -3.2F);
		          setUnlocalizedName(name);
		          setRegistryName(name);
		          setCreativeTab(MTTM.mttmtab);
		          
		          
		          ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		MTTM.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
