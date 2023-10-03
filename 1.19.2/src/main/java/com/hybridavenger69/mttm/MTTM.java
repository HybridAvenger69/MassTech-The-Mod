package com.hybridavenger69.mttm;


import com.hybridavenger69.mttm.blocks.BlockRegistry;
import com.hybridavenger69.mttm.items.registry.*;
import com.hybridavenger69.mttm.world.feature.ModConfiguredFeatures;
import com.hybridavenger69.mttm.world.feature.ModPlacedFeatures;
import com.mojang.logging.LogUtils;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;




// The value here should match an entry in the META-INF/mods.toml file
@Mod(MTTM.MOD_ID)
public class MTTM {

    public static final String MOD_ID = "mttm";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public MTTM() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.register(this);

        ///MtConfig.loadConfig(MtConfig.CONFIG, FMLPaths.CONFIGDIR.get().resolve("mttm_config.toml"));

        ArmorRegistry.ITEMS.register(modEventBus);
        BlockRegistry.BLOCKS.register(modEventBus);
        FoodRegistry.ITEMS.register(modEventBus);
        ItemRegistry.ITEMS.register(modEventBus);
        OtherRegistry.ITEMS.register(modEventBus);
        FluidRegistry.FLUID_TYPES.register(modEventBus);
        FluidRegistry.FLUIDS.register(modEventBus);

        //ArmorRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ToolRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        HammerRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ExcavatorRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        GreatAxeRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        WeaponRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());



        ModConfiguredFeatures.CONFIGURED_FEATURES.register(modEventBus);
        ModPlacedFeatures.PLACED_FEATURES.register(modEventBus);


        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}

