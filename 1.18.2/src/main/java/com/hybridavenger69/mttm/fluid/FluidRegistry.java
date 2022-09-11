package com.hybridavenger69.mttm.fluid;

import com.hybridavenger69.mttm.Mttm;
import com.hybridavenger69.mttm.blocks.BlockRegistry;
import com.hybridavenger69.mttm.items.registry.ItemRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FluidRegistry {

    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, Mttm.MOD_ID);


    //Fluids
    public static final RegistryObject<FlowingFluid> CRYOTHEUM_FLUID
            = FLUIDS.register("cryotheum_fluid", () -> new ForgeFlowingFluid.Source(FluidRegistry.CRYOTHEUM_PROPERTIES));

    public static final RegistryObject<FlowingFluid> CRYOTHEUM_FLOWING
            = FLUIDS.register("cryotheum_flowing", () -> new ForgeFlowingFluid.Source(FluidRegistry.CRYOTHEUM_PROPERTIES));



    //Properties
    public static final ForgeFlowingFluid.Properties CRYOTHEUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> CRYOTHEUM_FLUID.get(), () -> CRYOTHEUM_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(10).luminosity(2).temperature(-50).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
            .color(0xbfD5D7DE)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> FluidRegistry.CRYOTHEUM_BLOCK.get()).bucket(() -> ItemRegistry.CRYOTHEUM_BUCKET.get());

    public static final RegistryObject<LiquidBlock> CRYOTHEUM_BLOCK = BlockRegistry.BLOCKS.register("cryotheum",
            () -> new LiquidBlock(() -> FluidRegistry.CRYOTHEUM_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));



    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
