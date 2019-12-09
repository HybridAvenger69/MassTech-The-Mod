package com.hybridavenger69.mttm.init;

import java.util.ArrayList;
import java.util.List;

import com.hybridavenger69.mttm.blocks.BlockBase;
import com.hybridavenger69.mttm.blocks.TechBlock;
import com.hybridavenger69.mttm.blocks.TechGemBlock;
import com.hybridavenger69.mttm.blocks.TechGemOre;
import com.hybridavenger69.mttm.blocks.TechOre;
import com.hybridavenger69.mttm.blocks.machines.BlockFusionFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
			
			
	        //Blocks
	        public static final Block TECH_BLOCK = new TechBlock("tech_block", Material.IRON);
			public static final Block NETHER_STAR_BLOCK = new BlockBase("nether_star_block", Material.AIR);
			public static final Block TECH_GEM_BLOCK = new TechGemBlock("tech_gem_block", Material.IRON);
			
			//Ore
			public static final Block TECH_ORE = new TechOre("tech_ore", Material.ROCK);
			public static final Block TECH_GEM_ORE = new TechGemOre("tech_gem_ore", Material.ROCK);
			
			//Machines
			public static final BlockFusionFurnace FUSION_FURNACE =  new BlockFusionFurnace("fusion_furnace");
	
}
