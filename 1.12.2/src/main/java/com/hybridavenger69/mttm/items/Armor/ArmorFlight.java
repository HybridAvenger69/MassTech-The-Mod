package com.hybridavenger69.mttm.items.Armor;

import java.util.List;

import com.hybridavenger69.mttm.Main;
import com.hybridavenger69.mttm.init.ModItems;
import com.hybridavenger69.mttm.utils.Handlers.ArmorHandler;
import com.hybridavenger69.mttm.utils.Interfaces.IHasModel;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class ArmorFlight extends ItemArmor implements IHasModel {

    public ArmorFlight(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn) {
        super(material, renderIndex, equipmentSlotIn);
        this.setMaxStackSize(1);
        setUnlocalizedName(name);
		setRegistryName(name);
        this.setCreativeTab(Main.mttmtab);
        
        ModItems.ITEMS.add(this);
    }

   

	/**
     * Return whether this item is repairable in an anvil.
     */
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = new ItemStack(ModItems.NETHER_INGOT);
        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
        ItemStack chest = entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
        ItemStack feet = entity.getItemStackFromSlot(EntityEquipmentSlot.FEET);
        ItemStack head = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        ItemStack legs = entity.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
        if (((!head.isEmpty()) && (head.getItem() == ModItems.ICARUS_HELMET) &&
            (!chest.isEmpty()) && (chest.getItem() == ModItems.ICARUS_CHESTPLATE) &&
            (!legs.isEmpty()) && (legs.getItem() == ModItems.ICARUS_LEGGINGS) &&
            (!feet.isEmpty()) && (feet.getItem() == ModItems.ICARUS_BOOTS)) ||
            (entity.capabilities.isCreativeMode) || (entity.isSpectator())) {
            if (ArmorHandler.icarus_armor && ArmorHandler.icarus_resistance) {
                entity.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 180, ArmorHandler.icarus_resistance_lvl, false, false));
            }
            if (ArmorHandler.icarus_armor && ArmorHandler.icarus_fire) {
                entity.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 180, ArmorHandler.icarus_fire_lvl, false, false));
            }
            if (ArmorHandler.icarus_armor && ArmorHandler.icarus_strength) {
                entity.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 180, ArmorHandler.icarus_strength_lvl, false, false));
            }
            if (ArmorHandler.icarus_armor && ArmorHandler.icarus_fly) {
                entity.capabilities.allowFlying = true;
            }
        } else {
            entity.capabilities.allowFlying = false;
            entity.capabilities.isFlying = false;
        }
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if (ArmorHandler.icarus_armor && ArmorHandler.icarus_fly) {
            tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.icarus_1").getFormattedText());
        }
        if (ArmorHandler.icarus_armor && ArmorHandler.icarus_strength) {
            tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.icarus_2").getFormattedText());
        }
        if (ArmorHandler.icarus_armor && ArmorHandler.icarus_fire) {
            tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.icarus_3").getFormattedText());
        }
        if (ArmorHandler.icarus_armor && ArmorHandler.icarus_resistance) {
            tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.icarus_4").getFormattedText());
        }
    }

    @Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
