package com.hybridavenger69.mttm.block;

import com.hybridavenger69.lib.main.MtGroup;
import com.hybridavenger69.mttm.Mttm;
import com.hybridavenger69.mttm.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, Mttm.MOD_ID);

    //Ores
    public static final RegistryObject<Block> TECH_ORE = registerBlock("tech_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(10f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> EUCLASE_ORE = registerBlock("euclase_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(10f).requiresCorrectToolForDrops()));


    //Machines(Maybe)

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(MtGroup.MT_TAB)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}


