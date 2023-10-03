package com.hybridavenger69.mttm.items.registry;

import com.hybridavenger69.hybridlib.main.ModTiers;
import com.hybridavenger69.hybridlib.main.MtGroup;
import com.hybridavenger69.mttm.MTTM;
import com.hybridavenger69.mttm.items.tools.BattleAxeItem;
import com.hybridavenger69.mttm.items.tools.ExcavatorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class WeaponRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MTTM.MOD_ID);



    //BattleAxes
    public static final RegistryObject<Item> TECH_BATTLEAXE = ITEMS.register("tech_battleaxe",
            () -> new SwordItem(ModTiers.WeaponTiers.TECH, 8, -2.7f, props()));

    public static final RegistryObject<Item> EUCLASE_BATTLEAXE = ITEMS.register("euclase_battleaxe",
            () -> new SwordItem(ModTiers.WeaponTiers.EUCLASE, 9, -2.5f, props()));

    public static final RegistryObject<Item> ICARUS_BATTLEAXE = ITEMS.register("icarus_battleaxe",
            () -> new SwordItem(ModTiers.WeaponTiers.ICARUS,10, -2.3f, props()));

    public static final RegistryObject<Item> ICARUS2_BATTLEAXE = ITEMS.register("icarus2_battleaxe",
            () -> new BattleAxeItem(ModTiers.WeaponTiers.ICARUS2, 11, -2.1f, props()));

    //BattleHammers



    private static Item.Properties props() {
        return new Item.Properties().tab(MtGroup.MT_GROUP);
    }
}
