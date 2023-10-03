package com.hybridavenger69.mttm.items.tools.base;

import net.minecraft.world.item.Item;


import java.util.function.Function;

public class BaseItem extends Item {
    public BaseItem(Function<Properties, Properties> properties) {
        super(properties.apply(new Properties()));
    }


}