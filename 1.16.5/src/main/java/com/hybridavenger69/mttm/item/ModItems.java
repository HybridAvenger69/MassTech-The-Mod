package com.hybridavenger69.mttm.item;

import com.hybridavenger69.lib.main.MtGroup;
import com.hybridavenger69.mttm.Mttm;
import com.hybridavenger69.mttm.item.custom.ModArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mttm.MOD_ID);

    //Crafting Materials
    ///public static final RegistryObject<Item> TECH_INGOT = ITEMS.register("tech_ingot",
     ///       () -> new Item(new Item.Properties().group(MtGroup.MT_GROUP)));

   /// public static final RegistryObject<Item> EUCLASE_GEM = ITEMS.register("euclase_gem",
    ///        () -> new Item(new Item.Properties().group(MtGroup.MT_GROUP)));


    //Crafting components
    public static final RegistryObject<Item> CRAFTING_COMPONENT = ITEMS.register("crafting_component",
            () -> new Item(new Item.Properties().group(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> CRAFTING_COMPONENT_2 = ITEMS.register("crafting_component_2",
            () -> new Item(new Item.Properties().group(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> CRAFTING_COMPONENT_3 = ITEMS.register("crafting_component_3",
            () -> new Item(new Item.Properties().group(MtGroup.MT_GROUP)));

    //Tools(tech)
    public static final RegistryObject<Item> TECH_SWORD= ITEMS.register("tech_sword",
            () -> new SwordItem(ModItemTier.TECH, 0, 2f, new Item.Properties().group(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> TECH_PICK= ITEMS.register("tech_pick",
            () -> new PickaxeItem(ModItemTier.TECH, 0, 2f, new Item.Properties().group(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> TECH_AXE= ITEMS.register("tech_axe",
            () -> new AxeItem(ModItemTier.TECH, 0, 2f, new Item.Properties().group(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> TECH_SHOVEL= ITEMS.register("tech_shovel",
            () -> new ShovelItem(ModItemTier.TECH, 0, 2f, new Item.Properties().group(MtGroup.MT_GROUP)));

    //Armor(Tech)
    public static final RegistryObject<Item> TECH_HELMET = ITEMS.register("tech_helmet",
            () -> new ArmorItem(ModArmorMaterial.TECH, EquipmentSlotType.HEAD,
                    new Item.Properties().group(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> TECH_CHESTPLATE= ITEMS.register("tech_chestplate",
            () -> new ArmorItem(ModArmorMaterial.TECH, EquipmentSlotType.CHEST,
                    new Item.Properties().group(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> TECH_LEGGINGS = ITEMS.register("tech_leggings",
            () -> new ArmorItem(ModArmorMaterial.TECH, EquipmentSlotType.LEGS,
                    new Item.Properties().group(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> TECH_BOOTS = ITEMS.register("tech_boots",
            () -> new ArmorItem(ModArmorMaterial.TECH, EquipmentSlotType.FEET,
                    new Item.Properties().group(MtGroup.MT_GROUP)));

    //Tools(Euclase)
    public static final RegistryObject<Item> EUCLASE_SWORD= ITEMS.register("euclase_sword",
            () -> new SwordItem(ModItemTier.EUCLASE, 0, 4f, new Item.Properties().group(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> EUCLASE_PICK= ITEMS.register("euclase_pick",
            () -> new PickaxeItem(ModItemTier.EUCLASE, 0, 4f, new Item.Properties().group(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> EUCLASE_AXE= ITEMS.register("euclase_axe",
            () -> new AxeItem(ModItemTier.EUCLASE, 0, 4f, new Item.Properties().group(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> EUCLASE_SHOVEL= ITEMS.register("euclase_shovel",
            () -> new ShovelItem(ModItemTier.EUCLASE, 0, 4f, new Item.Properties().group(MtGroup.MT_GROUP)));

    //Armor(Euclase)
    public static final RegistryObject<Item> EUCLASE_HELMET = ITEMS.register("euclase_helmet",
            () -> new ArmorItem(ModArmorMaterial.EUCLASE, EquipmentSlotType.HEAD,
                    new Item.Properties().group(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> EUCLASE_CHESTPLATE= ITEMS.register("euclase_chestplate",
            () -> new ArmorItem(ModArmorMaterial.EUCLASE, EquipmentSlotType.CHEST,
                    new Item.Properties().group(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> EUCLASE_LEGGINGS = ITEMS.register("euclase_leggings",
            () -> new ArmorItem(ModArmorMaterial.EUCLASE, EquipmentSlotType.LEGS,
                    new Item.Properties().group(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> EUCLASE_BOOTS = ITEMS.register("euclase_boots",
            () -> new ArmorItem(ModArmorMaterial.EUCLASE, EquipmentSlotType.FEET,
                    new Item.Properties().group(MtGroup.MT_GROUP)));

    //Armor(ICarus)
    public static final RegistryObject<Item> ICARUS_HELMET = ITEMS.register("icarus_helmet",
            () -> new ModArmorItem(ModArmorMaterial.ICARUS, EquipmentSlotType.HEAD,
                    new Item.Properties().group(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> ICARUS_CHESTPLATE= ITEMS.register("icarus_chestplate",
            () -> new ModArmorItem(ModArmorMaterial.ICARUS, EquipmentSlotType.CHEST,
                    new Item.Properties().group(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> ICARUS_LEGGINGS = ITEMS.register("icarus_leggings",
            () -> new ModArmorItem(ModArmorMaterial.ICARUS, EquipmentSlotType.LEGS,
                    new Item.Properties().group(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> ICARUS_BOOTS = ITEMS.register("icarus_boots",
            () -> new ModArmorItem(ModArmorMaterial.ICARUS, EquipmentSlotType.FEET,
                    new Item.Properties().group(MtGroup.MT_GROUP)));


    public static void register(IEventBus eventbus){

        ITEMS.register(eventbus);
    }
}
