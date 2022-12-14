package com.hybridavenger69.mttm.items.registry;

import com.hybridavenger69.hybridlib.main.MtGroup;
import com.hybridavenger69.mttm.MTTM;

import com.hybridavenger69.mttm.items.custom.Icarus;
import com.hybridavenger69.mttm.items.tiers.ArmorTiers;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ArmorRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MTTM.MOD_ID);

    //Tech(Armor)
    public static final RegistryObject<Item> TECH_HELMET = ITEMS.register("tech_helmet",
            () -> new ArmorItem(ArmorTiers.TECH, EquipmentSlot.HEAD,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));
    public static final RegistryObject<Item> TECH_CHESTPLATE = ITEMS.register("tech_chestplate",
            () -> new ArmorItem(ArmorTiers.TECH, EquipmentSlot.CHEST,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));
    public static final RegistryObject<Item> TECH_LEGGINGS = ITEMS.register("tech_leggings",
            () -> new ArmorItem(ArmorTiers.TECH, EquipmentSlot.LEGS,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));
    public static final RegistryObject<Item> TECH_BOOTS = ITEMS.register("tech_boots",
            () -> new ArmorItem(ArmorTiers.TECH, EquipmentSlot.FEET,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    //EUCLASE
    public static final RegistryObject<Item> EUCLASE_HELMET = ITEMS.register("euclase_helmet",
            () -> new ArmorItem(ArmorTiers.EUCLASE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> EUCLASE_CHESTPLATE = ITEMS.register("euclase_chestplate",
            () -> new ArmorItem(ArmorTiers.EUCLASE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> EUCLASE_LEGGINGS = ITEMS.register("euclase_leggings",
            () -> new ArmorItem(ArmorTiers.EUCLASE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> EUCLASE_BOOTS = ITEMS.register("euclase_boots",
            () -> new ArmorItem(ArmorTiers.EUCLASE, EquipmentSlot.FEET,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    //ICARUS
    public static final RegistryObject<Item> ICARUS_HELMET = ITEMS.register("icarus_helmet",
            () -> new Icarus(ArmorTiers.ICARUS, EquipmentSlot.HEAD,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> ICARUS_CHESTPLATE = ITEMS.register("icarus_chestplate",
            () -> new Icarus(ArmorTiers.ICARUS, EquipmentSlot.CHEST,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> ICARUS_LEGGINGS = ITEMS.register("icarus_leggings",
            () -> new Icarus(ArmorTiers.ICARUS, EquipmentSlot.LEGS,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> ICARUS_BOOTS = ITEMS.register("icarus_boots",
            () -> new Icarus(ArmorTiers.ICARUS, EquipmentSlot.FEET,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

