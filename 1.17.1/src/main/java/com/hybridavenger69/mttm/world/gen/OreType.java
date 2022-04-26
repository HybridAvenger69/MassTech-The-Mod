package com.hybridavenger69.mttm.world.gen;

import com.hybridavenger69.mttm.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {
    TECH_ORE(Lazy.of(ModBlocks.TECH_ORE), 8, 40, 55, 6),
    EUCLASE_ORE(Lazy.of(ModBlocks.EUCLASE_ORE), 4, 10, 35, 5);

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int veinsPerChunk;

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight, int veinsPerChunk) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinsPerChunk = veinsPerChunk;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getVeinsPerChunk() {
        return veinsPerChunk;
    }

    public static OreType get(Block block) {
        for (OreType ore : values()) {
            if(block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}