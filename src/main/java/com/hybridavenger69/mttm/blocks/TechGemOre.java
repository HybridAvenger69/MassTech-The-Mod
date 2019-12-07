package com.hybridavenger69.mttm.blocks;

import java.util.Random;

import com.hybridavenger69.mttm.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class TechGemOre extends BlockBase {
	
	public TechGemOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(7.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}
	
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.TECH_GEM;
	}
	
	
	public int quantityDropped(Random rand) {
		int max = 4;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}
