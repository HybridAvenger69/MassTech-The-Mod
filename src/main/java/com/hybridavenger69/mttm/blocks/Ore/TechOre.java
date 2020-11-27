package com.hybridavenger69.mttm.blocks.Ore;



import com.hybridavenger69.mttm.blocks.BlockBase;

import net.minecraft.block.material.Material;

import net.minecraft.block.SoundType;


public class TechOre extends BlockBase {

	public TechOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}
}