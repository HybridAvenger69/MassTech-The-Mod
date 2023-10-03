package com.hybridavenger69.mttm.items.registry;

import com.hybridavenger69.hybridlib.main.ModTiers;
import com.hybridavenger69.hybridlib.main.MtGroup;
import com.hybridavenger69.mttm.MTTM;

import com.hybridavenger69.mttm.items.custom.Icarus;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ArmorRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MTTM.MOD_ID);

    //Tech(Armor)

    public static final RegistryObject<ArmorItem> TECH_HELMET = ITEMS.register("tech_helmet",
            () -> new ArmorItem(ModTiers.ArmorTiers.TECH, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> TECH_CHESTPLATE = ITEMS.register("tech_chestplate",
            () -> new ArmorItem(ModTiers.ArmorTiers.TECH, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> TECH_LEGGINGS = ITEMS.register("tech_leggings",
            () -> new ArmorItem(ModTiers.ArmorTiers.TECH, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> TECH_BOOTS = ITEMS.register("tech_boots",
            () -> new ArmorItem(ModTiers.ArmorTiers.TECH, EquipmentSlot.FEET, props()));

    //EUCLASE
    public static final RegistryObject<ArmorItem> EUCLASE_HELMET = ITEMS.register("euclase_helmet",
            () -> new ArmorItem(ModTiers.ArmorTiers.EUCLASE, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> EUCLASE_CHESTPLATE = ITEMS.register("euclase_chestplate",
            () -> new ArmorItem(ModTiers.ArmorTiers.EUCLASE, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> EUCLASE_LEGGINGS = ITEMS.register("euclase_leggings",
            () -> new ArmorItem(ModTiers.ArmorTiers.EUCLASE, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> EUCLASE_BOOTS = ITEMS.register("euclase_boots",
            () -> new ArmorItem(ModTiers.ArmorTiers.EUCLASE, EquipmentSlot.FEET, props()));


    //ICARUS
    public static final RegistryObject<ArmorItem> ICARUS_HELMET = ITEMS.register("icarus_helmet",
            () -> new Icarus(ModTiers.ArmorTiers.ICARUS, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> ICARUS_CHESTPLATE = ITEMS.register("icarus_chestplate",
            () -> new Icarus(ModTiers.ArmorTiers.ICARUS, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> ICARUS_LEGGINGS = ITEMS.register("icarus_leggings",
            () -> new Icarus(ModTiers.ArmorTiers.ICARUS, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> ICARUS_BOOTS = ITEMS.register("icarus_boots",
            () -> new Icarus(ModTiers.ArmorTiers.ICARUS, EquipmentSlot.FEET, props()));


    private static Item.Properties props() {
        return new Item.Properties().tab(MtGroup.MT_GROUP);
    }



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

