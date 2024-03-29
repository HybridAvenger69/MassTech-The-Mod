package com.hybridavenger69.mttm.items.registry;

import com.hybridavenger69.hybridlib.HybridIDS;
import com.hybridavenger69.hybridlib.HybridLib;
import com.hybridavenger69.hybridlib.main.ModTiers;
import com.hybridavenger69.hybridlib.main.MtGroup;
import com.hybridavenger69.mttm.MTTM;
import com.hybridavenger69.mttm.items.tools.GreatAxeItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GreatAxeRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HybridIDS.MTTM_MODID);


    public static final RegistryObject<Item> TECH_GREATAXE = ITEMS.register("tech_greataxe",
            () -> new GreatAxeItem(ModTiers.MTTMTiers.TECH, 7, 6.5f, props()));

    public static final RegistryObject<Item> EUCLASE_GREATAXE = ITEMS.register("euclase_greataxe",
            () -> new GreatAxeItem(ModTiers.MTTMTiers.EUCLASE,7, 6.5f, props()));

    public static final RegistryObject<Item> ICARUS_GREATAXE = ITEMS.register("icarus_greataxe",
            () -> new GreatAxeItem(ModTiers.MTTMTiers.ICARUS,7,6.5f, props()));

    public static final RegistryObject<Item> ICARUS2_GREATAXE = ITEMS.register("icarus2_greataxe",
            () -> new GreatAxeItem(ModTiers.MTTMTiers.ICARUS2, 7, 6.5f, props()));



    private static Item.Properties props() {
        return new Item.Properties().tab(MtGroup.MT_GROUP);
    }

}