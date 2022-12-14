package com.hybridavenger69.mttm.blocks;

import com.hybridavenger69.hybridlib.main.MtGroup;
import com.hybridavenger69.mttm.MTTM;
import com.hybridavenger69.mttm.items.registry.ItemRegistry;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MTTM.MOD_ID);

    //Ores
    public static final RegistryObject<Block> DEEPSLATE_EUCLASE_ORE = registerBlock("deepslate_euclase_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), MtGroup.MT_GROUP);

    public static final RegistryObject<Block> EUCLASE_ORE = registerBlock("euclase_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), MtGroup.MT_GROUP);
    public static final RegistryObject<Block> DEEPSLATE_TECH_ORE = registerBlock("deepslate_tech_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), MtGroup.MT_GROUP);

    public static final RegistryObject<Block> TECH_ORE = registerBlock("tech_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), MtGroup.MT_GROUP);

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

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}