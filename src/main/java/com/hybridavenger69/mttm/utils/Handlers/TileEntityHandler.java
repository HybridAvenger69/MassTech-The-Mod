package com.hybridavenger69.mttm.utils.Handlers;

import com.hybridavenger69.mttm.blocks.Machines.FusionFurnace.TileEntityFusionFurnace;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {
    public static void registerTileEntities() {
        GameRegistry.registerTileEntity(TileEntityFusionFurnace.class, new ResourceLocation("mttm", "TileEntityFusionFurnace"));
    }
}