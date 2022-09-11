package com.hybridavenger69.mttm.blocks;

import com.hybridavenger69.hlib.main.MtGroup;
import com.hybridavenger69.mttm.Mttm;
import com.hybridavenger69.mttm.items.registry.ItemRegistry;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, Mttm.MOD_ID);

    // Tech Ores
    public static final RegistryObject<Block> TECH_ORE = registerBlock("tech_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength((2.0F))));



    public static final RegistryObject<Block> DEEPSLATE_TECH_ORE = registerBlock("deepslate_tech_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f)));



    //Euclase Ores
    public static final RegistryObject<Block> EUCLASE_ORE = registerBlock("euclase_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(4.5f)));

    public static final RegistryObject<Block> DEEPSLATE_EUCLASE_ORE = registerBlock("deepslate_euclase_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(4.5f)));

    //furnaces



    //Blocks
    public static final RegistryObject<Block> TECH_BLOCK = registerBlock("tech_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0f)));

    public static final RegistryObject<Block> EUCLASE_BLOCK = registerBlock("euclase_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0f)));

    public static final RegistryObject<Block> NETHER_INGOT_BLOCK = registerBlock("nether_ingot_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).requiresCorrectToolForDrops().strength(4.0f)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(MtGroup.MT_GROUP)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}


