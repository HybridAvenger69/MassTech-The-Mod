package com.hybridavenger69.mttm.items.registry;

import com.hybridavenger69.hybridlib.HybridIDS;
import com.hybridavenger69.hybridlib.HybridLib;
import com.hybridavenger69.hybridlib.main.ModTiers;
import com.hybridavenger69.hybridlib.main.MtGroup;
import com.hybridavenger69.mttm.MTTM;
import com.hybridavenger69.mttm.items.tools.HammerItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HammerRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HybridIDS.MTTM_MODID);

   //MTTM HAMMERS
    public static final RegistryObject<Item> TECH_HAMMER = ITEMS.register("tech_hammer",
            () -> new HammerItem(ModTiers.MTTMTiers.TECH, 7, 6.5f, props()));

    public static final RegistryObject<Item> EUCLASE_HAMMER = ITEMS.register("euclase_hammer",
            () -> new HammerItem(ModTiers.MTTMTiers.EUCLASE, 7, 6.5f, props()));

    public static final RegistryObject<Item> ICARUS_HAMMER = ITEMS.register("icarus_hammer",
            () -> new HammerItem(ModTiers.MTTMTiers.ICARUS, 7,6.5f, props()));

    public static final RegistryObject<Item> ICARUS2_HAMMER = ITEMS.register("icarus2_hammer",
            () -> new HammerItem(ModTiers.MTTMTiers.ICARUS2,7,6.5f, props()));


    private static Item.Properties props() {
        return new Item.Properties().tab(MtGroup.MT_GROUP);
    }

}
