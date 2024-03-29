package com.hybridavenger69.mttm;

import com.hybridavenger69.mttm.blocks.BlockRegistry;
import com.hybridavenger69.mttm.fluid.FluidRegistry;
import com.hybridavenger69.mttm.items.registry.ArmorRegistry;
import com.hybridavenger69.mttm.items.registry.ItemRegistry;
import com.hybridavenger69.mttm.items.registry.ToolRegistry;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ItemFrameRenderer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Mttm.MOD_ID)
public class Mttm
{

    public static final String MOD_ID = "mttm";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public Mttm()
    {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Mod Registers
        ItemRegistry.register(eventBus);
        BlockRegistry.register(eventBus);
        ArmorRegistry.register(eventBus);
        ToolRegistry.register(eventBus);
        FluidRegistry.register(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void clientSetup(final FMLClientSetupEvent event){
        ItemBlockRenderTypes.setRenderLayer(FluidRegistry.CRYOTHEUM_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidRegistry.CRYOTHEUM_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidRegistry.CRYOTHEUM_FLOWING.get(), RenderType.translucent());
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // Some example code to dispatch IMC to another mod
        InterModComms.sendTo("mttm", "helloworld", () -> { LOGGER.info("Hello world from HybridAvenger69"); return "Hello world";});
    }



    private void processIMC(final InterModProcessEvent event)
    {
        // Some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.messageSupplier().get()).
                collect(Collectors.toList()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from HybridAvenger69");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent)
        {
            // Register a new block here
            LOGGER.info("HELLO from HybridAvenger69");
        }
    }
}
