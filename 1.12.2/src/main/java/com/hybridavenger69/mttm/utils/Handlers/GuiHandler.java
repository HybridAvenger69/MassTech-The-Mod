package com.hybridavenger69.mttm.utils.Handlers;

import javax.annotation.Nullable;

import com.hybridavenger69.mttm.blocks.Machines.FusionFurnace.ContainerFusionFurnace;
import com.hybridavenger69.mttm.blocks.Machines.FusionFurnace.GuiFusionFurnace;
import com.hybridavenger69.mttm.blocks.Machines.FusionFurnace.TileEntityFusionFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == ConfigHandler.FUSION_FURNACE_GUI) return new ContainerFusionFurnace(player.inventory, (TileEntityFusionFurnace)world.getTileEntity(new BlockPos(x, y, z)));
      
        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == ConfigHandler.FUSION_FURNACE_GUI) return new GuiFusionFurnace(player.inventory, (TileEntityFusionFurnace)world.getTileEntity(new BlockPos(x, y, z)));
      
        return null;
    }
}

