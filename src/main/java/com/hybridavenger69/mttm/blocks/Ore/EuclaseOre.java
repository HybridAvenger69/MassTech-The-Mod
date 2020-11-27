package com.hybridavenger69.mttm.blocks.Ore;

import java.util.Random;

import com.hybridavenger69.mttm.blocks.BlockBase;
import com.hybridavenger69.mttm.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class EuclaseOre extends BlockBase {

	public EuclaseOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.EUCLASE_GEM;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		int max = 2;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}
