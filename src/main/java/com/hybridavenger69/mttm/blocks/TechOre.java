package com.hybridavenger69.mttm.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TechOre extends BlockBase 
{

	public TechOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 1);
		
	}

	
	
}
