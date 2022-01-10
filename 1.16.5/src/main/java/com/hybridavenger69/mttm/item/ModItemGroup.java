package com.hybridavenger69.mttm.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static  final ItemGroup MTTM_GROUP = new ItemGroup("mttmTab") {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.CRAFTING_COMPONENT.get());
        }
    };
    
    
}
