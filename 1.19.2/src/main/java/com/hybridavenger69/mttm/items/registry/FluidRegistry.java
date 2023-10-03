package com.hybridavenger69.mttm.items.registry;

import com.hybridavenger69.hybridlib.main.MtGroup;
import com.hybridavenger69.mttm.MTTM;
import com.hybridavenger69.mttm.items.registry.container.FluidRegistryContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidRegistry {

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, MTTM.MOD_ID);
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, MTTM.MOD_ID);


    public static final FluidRegistryContainer CRYO_FLUID = new FluidRegistryContainer(
            "cryo_fluid",
            FluidType.Properties.create()
                    .canSwim(false)
                    .canDrown(true)
                    .canPushEntity(true)
                    .supportsBoating(false)
                    .canConvertToSource(false)
                    .temperature(-40),
            () -> FluidRegistryContainer.createExtension(
                    new FluidRegistryContainer.ClientExtensions(
                            MTTM.MOD_ID,
                            "cryo_fluid"
                    ).tint(0xDDDCDA)
                            .fogColor(1.0f, 0.2f, 0.5f)
            ),
            BlockBehaviour.Properties.copy(Blocks.WATER),
            new Item.Properties()
                    .tab(MtGroup.MT_GROUP)
                    .stacksTo(1)
    );
}
