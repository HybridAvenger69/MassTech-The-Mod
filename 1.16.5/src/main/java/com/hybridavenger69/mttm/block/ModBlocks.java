package com.hybridavenger69.mttm.block;

import com.hybridavenger69.mttm.Mttm;
import com.hybridavenger69.mttm.item.ModItemGroup;
import com.hybridavenger69.mttm.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, Mttm.MOD_ID);

    //Ores
    public static final RegistryObject<Block> EUCLASE_ORE = registerBlock("euclase_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(5f)));

    public static final RegistryObject<Block> TECH_ORE = registerBlock("tech_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(3f)));

    //Blocks(3x3)
    public static final RegistryObject<Block> EUCLASE_BLOCK= registerBlock("euclase_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON).harvestLevel(0).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(2f)));

    public static final RegistryObject<Block> TECH_BLOCK = registerBlock("tech_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON).harvestLevel(0).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(2f)));



    //Machines(Maybe)

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.MTTM_GROUP)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}


