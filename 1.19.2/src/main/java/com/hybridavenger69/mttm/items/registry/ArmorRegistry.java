package com.hybridavenger69.mttm.items.registry;

import com.hybridavenger69.hybridlib.main.ItemRegistry;
import com.hybridavenger69.hybridlib.main.MtGroup;
import com.hybridavenger69.mttm.MTTM;

import com.hybridavenger69.mttm.items.material.ModArmorMaterial;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ArmorRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MTTM.MOD_ID);

    //Tech(Armor)

    public static final RegistryObject<ArmorItem> TECH_HELMET = ITEMS.register("tech_helmet",
            () -> new ArmorItem(ArmorTiers.TECH, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> TECH_CHESTPLATE = ITEMS.register("tech_chestplate",
            () -> new ArmorItem(ArmorTiers.TECH, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> TECH_LEGGINGS = ITEMS.register("tech_leggings",
            () -> new ArmorItem(ArmorTiers.TECH, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> TECH_BOOTS = ITEMS.register("tech_boots",
            () -> new ArmorItem(ArmorTiers.TECH, EquipmentSlot.FEET, props()));

    //EUCLASE
    public static final RegistryObject<ArmorItem> EUCLASE_HELMET = ITEMS.register("euclase_helmet",
            () -> new ArmorItem(ArmorTiers.EUCLASE, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> EUCLASE_CHESTPLATE = ITEMS.register("euclase_chestplate",
            () -> new ArmorItem(ArmorTiers.EUCLASE, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> EUCLASE_LEGGINGS = ITEMS.register("euclase_leggings",
            () -> new ArmorItem(ArmorTiers.EUCLASE, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> EUCLASE_BOOTS = ITEMS.register("euclase_boots",
            () -> new ArmorItem(ArmorTiers.EUCLASE, EquipmentSlot.FEET, props()));


    //ICARUS
    public static final RegistryObject<ArmorItem> ICARUS_HELMET = ITEMS.register("icarus_helmet",
            () -> new ArmorItem(ArmorTiers.ICARUS, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> ICARUS_CHESTPLATE = ITEMS.register("icarus_chestplate",
            () -> new ArmorItem(ArmorTiers.ICARUS, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> ICARUS_LEGGINGS = ITEMS.register("icarus_leggings",
            () -> new ArmorItem(ArmorTiers.ICARUS, EquipmentSlot.LEGS, props()));
    public static final RegistryObject<ArmorItem> ICARUS_BOOTS = ITEMS.register("icarus_boots",
            () -> new ArmorItem(ArmorTiers.ICARUS, EquipmentSlot.FEET, props()));


    private static Item.Properties props() {
        return new Item.Properties().tab(MtGroup.MT_GROUP);
    }

    public static class ArmorTiers {
        public static final ArmorMaterial TECH = new ModArmorMaterial(
                "tech",
                500,
                new int[] { 20, 40, 50, 10 },
                300,
                SoundEvents.ARMOR_EQUIP_DIAMOND,
                0.0f,
                0.0f,
                () -> Ingredient.of(ItemRegistry.TECH_INGOT.get()));

        public static final ArmorMaterial EUCLASE = new ModArmorMaterial(
                "euclase",
                1000,
                new int[] { 30, 50, 60, 20 },
                600,
                SoundEvents.ARMOR_EQUIP_DIAMOND,
                0.0f,
                0.0f,
                () -> Ingredient.of(ItemRegistry.EUCLASE_GEM.get()));

        public static final ArmorMaterial ICARUS = new ModArmorMaterial(
                "icarus",
                1500,
                new int[] { 40, 60, 70, 30 },
                1200,
                SoundEvents.ARMOR_EQUIP_DIAMOND,
                0.0f,
                0.0f,
                () -> Ingredient.of(ItemRegistry.NETHER_INGOT.get()));
    }




}

