package com.hybridavenger69.mttm.items.registry;

import com.hybridavenger69.hlib.main.MtGroup;
import com.hybridavenger69.mttm.Mttm;
import com.hybridavenger69.mttm.items.custom.Icarus;
import com.hybridavenger69.mttm.items.tiers.ArmorTiers;
import com.hybridavenger69.mttm.items.tiers.ToolTiers;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mttm.MOD_ID);

    //Crafting Components
    public static final RegistryObject<Item> CRAFTING_COMPONENT = ITEMS.register("crafting_component",
            () -> new Item(new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> CRAFTING_COMPONENT_2 = ITEMS.register("crafting_component_2",
            () -> new Item(new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> CRAFTING_COMPONENT_3 = ITEMS.register("crafting_component_3",
            () -> new Item(new Item.Properties().tab(MtGroup.MT_GROUP)));


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

    //Tech
    public static final RegistryObject<Item> TECH_SWORD = ITEMS.register("tech_sword",
            () -> new SwordItem(ToolTiers.TECH, 0, 2f,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> TECH_PICK = ITEMS.register("tech_pick",
            () -> new PickaxeItem(ToolTiers.TECH, 0, 2f,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> TECH_AXE = ITEMS.register("tech_axe",
            () -> new AxeItem(ToolTiers.TECH, 0, 2f,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> TECH_SHOVEL = ITEMS.register("tech_shovel",
            () -> new ShovelItem(ToolTiers.TECH, 0, 2f,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    //Euclase
    public static final RegistryObject<Item> EUCLASE_SWORD = ITEMS.register("euclase_sword",
            () -> new SwordItem(ToolTiers.EUCLASE, 0, 4f,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> EUCLASE_PICK = ITEMS.register("euclase_pick",
            () -> new PickaxeItem(ToolTiers.EUCLASE, 0, 4f,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> EUCLASE_AXE = ITEMS.register("euclase_axe",
            () -> new AxeItem(ToolTiers.EUCLASE, 0, 4f,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> EUCLASE_SHOVEL = ITEMS.register("euclase_shovel",
            () -> new ShovelItem(ToolTiers.EUCLASE, 0, 4f,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
