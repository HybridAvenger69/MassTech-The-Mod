package com.hybridavenger69.mttm.blocks;

import com.hybridavenger69.hybridlib.main.MtGroup;
import com.hybridavenger69.mttm.MTTM;
import com.hybridavenger69.mttm.items.registry.ItemRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MTTM.MOD_ID);

    //Ores

   //OverWorld
    public static final RegistryObject<Block> DEEPSLATE_EUCLASE_ORE = register("deepslate_euclase_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()),
            new Item.Properties().tab(MtGroup.MT_GROUP));

    public static final RegistryObject<Block> EUCLASE_ORE = register("euclase_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()),
            new Item.Properties().tab(MtGroup.MT_GROUP));
    public static final RegistryObject<Block> DEEPSLATE_TECH_ORE = register("deepslate_tech_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()),
            new Item.Properties().tab(MtGroup.MT_GROUP));

    public static final RegistryObject<Block> TECH_ORE = register("tech_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()),
            new Item.Properties().tab(MtGroup.MT_GROUP));


    //Nether Ores(WIP)


    //End Ores(WIP)

    //Blocks

    public static final RegistryObject<Block> TECH_BLOCK = registerBlock("tech_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), MtGroup.MT_GROUP);

    public static final RegistryObject<Block> EUCLASE_BLOCK = registerBlock("euclase_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), MtGroup.MT_GROUP);

    public static final RegistryObject<Block> NETHER_INGOT_BLOCK = registerBlock("nether_ingot_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), MtGroup.MT_GROUP);




     public static class Tags {
         public static final TagKey<Block> NEEDS_TECH_TOOL = create("mineable/needs_tech_tool");

         private static TagKey<Block> create(String location) {
             return BlockTags.create(new ResourceLocation(MTTM.MOD_ID, location));


         }

     }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}