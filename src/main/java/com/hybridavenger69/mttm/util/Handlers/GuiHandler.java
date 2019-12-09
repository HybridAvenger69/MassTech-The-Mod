package com.hybridavenger69.mttm.util.Handlers;

import com.hybridavenger69.mttm.blocks.containers.ContainerFusionFurnace;
import com.hybridavenger69.mttm.blocks.guis.GuiFusionFurnace;
import com.hybridavenger69.mttm.blocks.tileentities.TileEntityFusionFurnace;
import com.hybridavenger69.mttm.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_FUSION_FURNACE) return new ContainerFusionFurnace(player.inventory, (TileEntityFusionFurnace)world.getTileEntity(new BlockPos(x,y,z)));
				return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_FUSION_FURNACE) return new GuiFusionFurnace(player.inventory, (TileEntityFusionFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
}