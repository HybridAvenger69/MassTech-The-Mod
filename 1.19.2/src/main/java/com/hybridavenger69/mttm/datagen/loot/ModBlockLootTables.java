package com.hybridavenger69.mttm.datagen.loot;

import com.hybridavenger69.hybridlib.main.ItemRegistry;
import com.hybridavenger69.mttm.blocks.BlockRegistry;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {


    @Override
    protected void addTables(){
        this.add(BlockRegistry.DEEPSLATE_EUCLASE_ORE.get(),
                (block) -> createOreDrop(BlockRegistry.DEEPSLATE_EUCLASE_ORE.get(), ItemRegistry.EUCLASE_GEM.get()));

        this.add(BlockRegistry.EUCLASE_BLOCK.get(),
                (block) -> createOreDrop(BlockRegistry.EUCLASE_ORE.get(), ItemRegistry.EUCLASE_GEM.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}