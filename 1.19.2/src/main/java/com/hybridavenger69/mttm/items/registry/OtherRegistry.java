package com.hybridavenger69.mttm.items.registry;

import com.hybridavenger69.hybridlib.main.MtGroup;
import com.hybridavenger69.mttm.MTTM;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class OtherRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MTTM.MOD_ID);

    //Netherite Tiers




    private static Item.Properties props() {
        return new Item.Properties().tab(MtGroup.MT_GROUP);
    }


}
