package com.hybridavenger69.mttm.items.registry;

import com.hybridavenger69.hybridlib.main.ModTiers;
import com.hybridavenger69.mttm.MTTM;
import com.hybridavenger69.hybridlib.main.MtGroup;
import com.hybridavenger69.mttm.items.tools.ExcavatorItem;
import net.minecraft.world.item.Item;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ExcavatorRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MTTM.MOD_ID);


    public static final RegistryObject<Item> TECH_EXCAVATOR = ITEMS.register("tech_excavator",
            () -> new ExcavatorItem(ModTiers.ToolTiers.TECH, 7, 6.5f, props()));

    public static final RegistryObject<Item> EUCLASE_EXCAVATOR = ITEMS.register("euclase_excavator",
            () -> new ExcavatorItem(ModTiers.ToolTiers.EUCLASE, 7, 6.5f, props()));

    public static final RegistryObject<Item> ICARUS_EXCAVATOR = ITEMS.register("icarus_excavator",
            () -> new ExcavatorItem(ModTiers.ToolTiers.ICARUS, 7,6.5f, props()));

    public static final RegistryObject<Item> ICARUS2_EXCAVATOR = ITEMS.register("icarus2_excavator",
            () -> new ExcavatorItem(ModTiers.ToolTiers.ICARUS2,7,6.5f, props()));


    private static Item.Properties props() {
        return new Item.Properties().tab(MtGroup.MT_GROUP);
    }

}