package com.hybridavenger69.mttm.init;

import java.util.ArrayList;
import java.util.List;

import com.hybridavenger69.mttm.blocks.BlockBase;
import com.hybridavenger69.mttm.blocks.Machines.FusionFurnace.BlockFusionFurnace;
import com.hybridavenger69.mttm.blocks.Ore.EuclaseOre;
import com.hybridavenger69.mttm.blocks.Ore.TechOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
			
			
	        //Blocks
	        public static final Block TECH_BLOCK = new BlockBase("tech_block", Material.IRON);
	        public static final Block EUCLASE_BLOCK = new BlockBase("euclase_block", Material.IRON);
	        public static final Block NETHER_STAR_BLOCK = new BlockBase("nether_star_block", Material.IRON);
			
			//Ore
		   public static final Block TECH_ORE = new TechOre("tech_ore", Material.ROCK);
		   public static final Block EUCLASE_ORE = new EuclaseOre("euclase_ore", Material.ROCK);
			
			//Machines
	       public static final Block FUSION_FURNACE = new BlockFusionFurnace("fusion_furnace");
}