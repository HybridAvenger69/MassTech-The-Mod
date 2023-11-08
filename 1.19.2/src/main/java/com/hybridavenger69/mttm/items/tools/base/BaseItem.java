package com.hybridavenger69.mttm.items.tools.base;

import com.hybridavenger69.mttm.items.tools.util.ToolEnergy;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;


import java.util.function.Function;

public class BaseItem extends Item {
    public BaseItem(Function<Properties, Properties> properties) {
        super(properties.apply(new Properties()));
    }


}