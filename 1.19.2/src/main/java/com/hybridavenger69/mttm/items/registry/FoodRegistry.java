package com.hybridavenger69.mttm.items.registry;


import com.hybridavenger69.hybridlib.HybridIDS;
import com.hybridavenger69.hybridlib.HybridLib;
import com.hybridavenger69.mttm.MTTM;
import com.hybridavenger69.mttm.items.apples.*;
import com.hybridavenger69.mttm.items.custom.Foods;
import com.hybridavenger69.mttm.utils.MtFood;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FoodRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HybridIDS.MTTM_MODID);

    public static final RegistryObject<Item> WHEAT_FLOUR = ITEMS.register("wheat_flour",
            () -> new Item(new Item.Properties().tab(MtFood.MT_FOOD)));

    public static final RegistryObject<Item> TOASTED_BREAD = ITEMS.register("toasted_bread",
            () -> new Item(new Item.Properties().tab(MtFood.MT_FOOD).food(Foods.TOASTED_BREAD)));

    public static final RegistryObject<Item> BURGER = ITEMS.register("burger",
            () -> new Item(new Item.Properties().tab(MtFood.MT_FOOD).food(Foods.BURGER)));

    public static final RegistryObject<Item> CHEESEBURGER = ITEMS.register("cheeseburger",
            () -> new Item(new Item.Properties().tab(MtFood.MT_FOOD).food(Foods.CHEESEBURGER)));

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().tab(MtFood.MT_FOOD).food(Foods.CHEESE)));

    public static final RegistryObject<Item> MILKBOTTLE = ITEMS.register("milkbottle",
            () -> new Item(new Item.Properties().tab(MtFood.MT_FOOD).food(Foods.MILK)));

    public static final RegistryObject<Item> BAKED_APPLE = ITEMS.register("baked_apple",
            () -> new Item(new Item.Properties().tab(MtFood.MT_FOOD).food(Foods.BAKED_APPLE)));

     public static final RegistryObject<Item> HEALTH_APPLE = ITEMS.register("health_apple",
           () -> new Health(new Item.Properties().tab(MtFood.MT_FOOD).stacksTo(16).food(Foods.HEALTH_APPLE)));

     public static final RegistryObject<Item> WATER_APPLE = ITEMS.register("water_apple",
             () -> new Water(new Item.Properties().tab(MtFood.MT_FOOD).stacksTo(16).food(Foods.WATER_APPLE)));

     public static final RegistryObject<Item> REGEN_APPLE = ITEMS.register("regen_apple",
             () -> new Regeneration(new Item.Properties().tab(MtFood.MT_FOOD).stacksTo(16).food(Foods.REGEN_APPLE)));

     public static final RegistryObject<Item> ABSORP_APPLE = ITEMS.register("absorp_apple",
             () -> new Absorp(new Item.Properties().tab(MtFood.MT_FOOD).stacksTo(16).food(Foods.ABSORP_APPLE)));

     public static final RegistryObject<Item> NIGHT_APPLE = ITEMS.register("night_apple",
             () -> new Night(new Item.Properties().tab(MtFood.MT_FOOD).stacksTo(16).food(Foods.NIGHT_APPLE)));

     public static final RegistryObject<Item> DAMAGE_APPLE = ITEMS.register("damage_apple",
             () -> new Damage(new Item.Properties().tab(MtFood.MT_FOOD).stacksTo(16).food(Foods.DAMAGE_APPLE)));

     public static final RegistryObject<Item> DIG_APPLE = ITEMS.register("dig_apple",
             () -> new Dig(new Item.Properties().tab(MtFood.MT_FOOD).stacksTo(16).food(Foods.DIG_APPLE)));







}
