package com.hybridavenger69.mttm.utils;

import com.hybridavenger69.mttm.items.registry.FoodRegistry;
import com.hybridavenger69.mttm.items.registry.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MtFood {

    public static final CreativeModeTab MT_FOOD = new CreativeModeTab("mtfood") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(FoodRegistry.BURGER.get());
        }
    };
}
