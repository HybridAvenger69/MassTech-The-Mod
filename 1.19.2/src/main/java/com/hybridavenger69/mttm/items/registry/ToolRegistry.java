package com.hybridavenger69.mttm.items.registry;

import com.hybridavenger69.hybridlib.main.ModTiers;
import com.hybridavenger69.hybridlib.main.MtGroup;
import com.hybridavenger69.mttm.MTTM;


import net.minecraft.world.item.*;


import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ToolRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MTTM.MOD_ID);

    //Tech
    public static final RegistryObject<SwordItem> TECH_SWORD = ITEMS.register("tech_sword",
            () -> new SwordItem(ModTiers.ToolTiers.TECH, 5, 3.5f, props()));

    public static final RegistryObject<PickaxeItem> TECH_PICKAXE = ITEMS.register("tech_pickaxe",
            () -> new PickaxeItem(ModTiers.ToolTiers.TECH, 5, 3.5f, props()));

    public static final RegistryObject<ShovelItem> TECH_SHOVEL = ITEMS.register("tech_shovel",
            () -> new ShovelItem(ModTiers.ToolTiers.TECH, 5, 3.5f, props()));

    public static final RegistryObject<AxeItem> TECH_AXE = ITEMS.register("tech_axe",
            () -> new AxeItem(ModTiers.ToolTiers.TECH, 5, 3.5f, props()));


    //Euclase
    public static final RegistryObject<SwordItem> EUCLASE_SWORD = ITEMS.register("euclase_sword",
            () -> new SwordItem(ModTiers.ToolTiers.EUCLASE, 6, 5.5f, props()));

    public static final RegistryObject<PickaxeItem> EUCLASE_PICKAXE = ITEMS.register("euclase_pickaxe",
            () -> new PickaxeItem(ModTiers.ToolTiers.EUCLASE, 5, 3.5f, props()));
    public static final RegistryObject<ShovelItem> EUCLASE_SHOVEL = ITEMS.register("euclase_shovel",
            () -> new ShovelItem(ModTiers.ToolTiers.EUCLASE, 6, 5.5f, props()));
    public static final RegistryObject<AxeItem> EUCLASE_AXE = ITEMS.register("euclase_axe",
            () -> new AxeItem(ModTiers.ToolTiers.EUCLASE, 6, 5.5f, props()));

    //ICARUS TOOLS(Tier 1)
    public static final RegistryObject<SwordItem> ICARUS_SWORD = ITEMS.register("icarus_sword",
            () -> new SwordItem(ModTiers.ToolTiers.ICARUS, 7, 6.5f, props()));

    public static final RegistryObject<PickaxeItem> ICARUS_PICKAXE = ITEMS.register("icarus_pickaxe",
            () -> new PickaxeItem(ModTiers.ToolTiers.ICARUS, 5, 3.5f, props()));
    public static final RegistryObject<ShovelItem> ICARUS_SHOVEL = ITEMS.register("icarus_shovel",
            () -> new ShovelItem(ModTiers.ToolTiers.ICARUS, 7, 6.5f, props()));
    public static final RegistryObject<AxeItem> ICARUS_AXE = ITEMS.register("icarus_axe",
            () -> new AxeItem(ModTiers.ToolTiers.ICARUS, 7, 6.5f, props()));


    //ICARUS TOOLS(Tier 2)
    public static final RegistryObject<SwordItem> ICARUS2_SWORD = ITEMS.register("icarus2_sword",
            () -> new SwordItem(ModTiers.ToolTiers.ICARUS2, 7, 6.5f, props()));

    public static final RegistryObject<PickaxeItem> ICARUS2_PICKAXE = ITEMS.register("icarus2_pickaxe",
            () -> new PickaxeItem(ModTiers.ToolTiers.ICARUS2, 0, 3.5f, props()));
    public static final RegistryObject<ShovelItem> ICARUS2_SHOVEL = ITEMS.register("icarus2_shovel",
            () -> new ShovelItem(ModTiers.ToolTiers.ICARUS2, 7, 6.5f, props()));
    public static final RegistryObject<AxeItem> ICARUS2_AXE = ITEMS.register("icarus2_axe",
            () -> new AxeItem(ModTiers.ToolTiers.ICARUS2, 7, 6.5f, props()));


    //Weapons





    //Other Info

    private static Item.Properties props() {
        return new Item.Properties().tab(MtGroup.MT_GROUP);
    }
    //Tier INfo



}
