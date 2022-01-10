package com.hybridavenger69.mttm.blocks.Machines.FusionFurnace;

import java.util.Map;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.hybridavenger69.mttm.init.ModItems;


import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class FusionFurnaceRecipes {
    private static final FusionFurnaceRecipes INSTANCE = new FusionFurnaceRecipes();
    private final Table<ItemStack, ItemStack, ItemStack> mergerList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

    public static FusionFurnaceRecipes getInstance() {
        return INSTANCE;
    }

    private FusionFurnaceRecipes() {
        addFusionFurnaceRecipe(new ItemStack(Items.IRON_INGOT, 2), new ItemStack(Items.NETHER_STAR, 1), new ItemStack(ModItems.NETHER_INGOT, 2), 2.0F);
   
    }


    public void addFusionFurnaceRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) {
        if(getFusionFurnaceResult(input1, input2) != ItemStack.EMPTY) return;
        this.mergerList.put(input1, input2, result);
        this.experienceList.put(result, Float.valueOf(experience));
    }

    public ItemStack getFusionFurnaceResult(ItemStack input1, ItemStack input2) {
        for(Map.Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.mergerList.columnMap().entrySet()) {
            if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) {
                for(Map.Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) {
                    if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) {
                        return (ItemStack)ent.getValue();
                    }
                }
            }
        }
        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() {
        return this.mergerList;
    }

    public float getFusionFurnaceExperience(ItemStack stack) {
        for (Map.Entry<ItemStack, Float> entry : this.experienceList.entrySet()) {
            if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) {
                return ((Float)entry.getValue()).floatValue();
            }
        }
        return 0.0F;
    }
}
