package com.hybridavenger69.mttm.items.registry;

import com.hybridavenger69.hybridlib.main.ItemRegistry;
import com.hybridavenger69.hybridlib.main.MtGroup;
import com.hybridavenger69.mttm.MTTM;


import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

import net.minecraftforge.common.ForgeTier;


import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ToolRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MTTM.MOD_ID);

    //Tech
    public static final RegistryObject<SwordItem> TECH_SWORD = ITEMS.register("tech_sword",
            () -> new SwordItem(ToolTiers.TECH, 5, 3.5f, props()));

    public static final RegistryObject<PickaxeItem> TECH_PICKAXE = ITEMS.register("tech_pickaxe",
            () -> new PickaxeItem(ToolTiers.TECH, 5, 3.5f, props()));

    public static final RegistryObject<ShovelItem> TECH_SHOVEL = ITEMS.register("tech_shovel",
            () -> new ShovelItem(ToolTiers.TECH, 5, 3.5f, props()));

    public static final RegistryObject<AxeItem> TECH_AXE = ITEMS.register("tech_axe",
            () -> new AxeItem(ToolTiers.TECH, 5, 3.5f, props()));


    //Euclase
    public static final RegistryObject<SwordItem> EUCLASE_SWORD = ITEMS.register("euclase_sword",
            () -> new SwordItem(ToolTiers.EUCLASE, 6, 5.5f, props()));

    public static final RegistryObject<PickaxeItem> EUCLASE_PICKAXE = ITEMS.register("euclase_pickaxe",
            () -> new PickaxeItem(ToolTiers.EUCLASE, 5, 3.5f, props()));
    public static final RegistryObject<ShovelItem> EUCLASE_SHOVEL = ITEMS.register("euclase_shovel",
            () -> new ShovelItem(ToolTiers.EUCLASE, 6, 5.5f, props()));
    public static final RegistryObject<AxeItem> EUCLASE_AXE = ITEMS.register("euclase_axe",
            () -> new AxeItem(ToolTiers.EUCLASE, 6, 5.5f, props()));

    //ICARUS TOOLS(Tier 1)
    public static final RegistryObject<SwordItem> ICARUS_SWORD = ITEMS.register("icarus_sword",
            () -> new SwordItem(ToolTiers.ICARUS, 7, 6.5f, props()));

    public static final RegistryObject<PickaxeItem> ICARUS_PICKAXE = ITEMS.register("icarus_pickaxe",
            () -> new PickaxeItem(ToolTiers.ICARUS, 5, 3.5f, props()));
    public static final RegistryObject<ShovelItem> ICARUS_SHOVEL = ITEMS.register("icarus_shovel",
            () -> new ShovelItem(ToolTiers.ICARUS, 7, 6.5f, props()));
    public static final RegistryObject<AxeItem> ICARUS_AXE = ITEMS.register("icarus_axe",
            () -> new AxeItem(ToolTiers.ICARUS, 7, 6.5f, props()));


    //ICARUS TOOLS(Tier 2)
    public static final RegistryObject<SwordItem> ICARUS2_SWORD = ITEMS.register("icarus2_sword",
            () -> new SwordItem(ToolTiers.ICARUS2, 7, 6.5f, props()));

    public static final RegistryObject<PickaxeItem> ICARUS2_PICKAXE = ITEMS.register("icarus2_pickaxe",
            () -> new PickaxeItem(ToolTiers.ICARUS2, 0, 3.5f, props()));
    public static final RegistryObject<ShovelItem> ICARUS2_SHOVEL = ITEMS.register("icarus2_shovel",
            () -> new ShovelItem(ToolTiers.ICARUS2, 7, 6.5f, props()));
    public static final RegistryObject<AxeItem> ICARUS2_AXE = ITEMS.register("icarus2_axe",
            () -> new AxeItem(ToolTiers.ICARUS2, 7, 6.5f, props()));
  


    //Other Info

    private static Item.Properties props() {
        return new Item.Properties().tab(MtGroup.MT_GROUP);
    }
    //Tier INfo

    public static class ToolTiers {
        public static final Tier TECH = new ForgeTier(
                2,
                450,
                4.5f,
                3,
                350,
                Tags.Blocks.NEEDS_GOLD_TOOL,
                () -> Ingredient.of(ItemRegistry.TECH_INGOT.get()));

        public static final Tier EUCLASE = new ForgeTier(
                3,
                900,
                9f,
                5,
                700,
                Tags.Blocks.NEEDS_GOLD_TOOL,
                () -> Ingredient.of(ItemRegistry.EUCLASE_GEM.get()));

        public static final Tier ICARUS = new ForgeTier(
                4,
                1800,
                13f,
                8,
                1400,

                Tags.Blocks.NEEDS_GOLD_TOOL,
                () -> Ingredient.of(ItemRegistry.NETHER_INGOT.get()));

        public static final Tier ICARUS2 = new ForgeTier(
                4,
                25000,
                18f,
                10,
                2800,
                Tags.Blocks.NEEDS_GOLD_TOOL,
                () -> Ingredient.of(OtherRegistry.DOUBLE_NETHERITE_INGOT.get()));
    }
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
