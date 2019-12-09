package com.hybridavenger69.mttm.util.Handlers;

import com.hybridavenger69.mttm.blocks.tileentities.TileEntityFusionFurnace;
import com.hybridavenger69.mttm.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityFusionFurnace.class, new ResourceLocation(Reference.MOD_ID + ":fusion_furnace"));
		}
}
