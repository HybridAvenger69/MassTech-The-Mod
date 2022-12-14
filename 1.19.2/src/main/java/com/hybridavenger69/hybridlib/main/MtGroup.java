package com.hybridavenger69.hybridlib.main;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MtGroup {
    public static final CreativeModeTab MT_GROUP = new CreativeModeTab("mtgroup") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.NETHER_INGOT.get());
        }
    };
}