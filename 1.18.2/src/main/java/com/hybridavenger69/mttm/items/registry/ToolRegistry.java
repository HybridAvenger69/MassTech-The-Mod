package com.hybridavenger69.mttm.items.registry;

import com.hybridavenger69.hlib.main.MtGroup;
import com.hybridavenger69.mttm.Mttm;
import com.hybridavenger69.mttm.items.tiers.ToolTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ToolRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mttm.MOD_ID);

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

    //ICARUS TOOLS(Tier 1)
    public static final RegistryObject<Item> ICARUS_SWORD = ITEMS.register("icarus_sword",
            () -> new SwordItem(ToolTiers.ICARUS, 0, 6f,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> ICARUS_PICK = ITEMS.register("icarus_pick",
            () -> new PickaxeItem(ToolTiers.ICARUS, 0, 6f,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> ICARUS_SHOVEL = ITEMS.register("icarus_shovel",
            () -> new ShovelItem(ToolTiers.ICARUS, 0, 6f,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> ICARUS_AXE = ITEMS.register("icarus_axe",
            () -> new AxeItem(ToolTiers.ICARUS, 0, 6f,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    //ICARUS TOOLS(Tier 2)
    public static final RegistryObject<Item> ICARUS2_SWORD = ITEMS.register("icarus2_sword",
            () -> new SwordItem(ToolTiers.ICARUS2, 0, 6f,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> ICARUS2_PICK = ITEMS.register("icarus2_pick",
            () -> new PickaxeItem(ToolTiers.ICARUS2, 0, 6f,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> ICARUS2_SHOVEL = ITEMS.register("icarus2_shovel",
            () -> new ShovelItem(ToolTiers.ICARUS2, 0, 6f,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));

    public static final RegistryObject<Item> ICARUS2_AXE = ITEMS.register("icarus2_axe",
            () -> new AxeItem(ToolTiers.ICARUS2, 0, 6f,
                    new Item.Properties().tab(MtGroup.MT_GROUP)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
