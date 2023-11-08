package com.hybridavenger69.mttm.items.registry;


import com.hybridavenger69.hybridlib.HybridIDS;
import com.hybridavenger69.hybridlib.HybridLib;
import com.hybridavenger69.hybridlib.main.MtGroup;
import com.hybridavenger69.mttm.MTTM;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HybridIDS.MTTM_MODID);

    //Crafting Components
    public static final RegistryObject<Item> CRAFTING_COMPONENT = ITEMS.register("crafting_component",
            () -> new Item(new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> CRAFTING_COMPONENT_2 = ITEMS.register("crafting_component_2",
            () -> new Item(new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> CRAFTING_COMPONENT_3 = ITEMS.register("crafting_component_3",
            () -> new Item(new Item.Properties().tab(MtGroup.MT_GROUP)));



}
