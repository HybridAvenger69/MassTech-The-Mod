package com.hybridavenger69.mttm.items.armor;

import java.util.List;

import com.hybridavenger69.mttm.Main;
import com.hybridavenger69.mttm.init.ModItems;
import com.hybridavenger69.mttm.util.IHasModel;
import com.hybridavenger69.mttm.util.Handlers.ArmorHandler;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class ArmorFlight extends ItemArmor implements IHasModel  {
	
	public ArmorFlight(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.mttmtab);
		
		ModItems.ITEMS.add(this);
	}
	
	/**
	 * Return whether item is repairable in an anvil
	 */
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		ItemStack mat = new ItemStack(ModItems.TECH_GEM);
		return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
	}

	
	@Override
	public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
        ItemStack chest = entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
        ItemStack feet = entity.getItemStackFromSlot(EntityEquipmentSlot.FEET);
        ItemStack head = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        ItemStack legs = entity.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
        if (((!head.isEmpty()) && (head.getItem() == ModItems.FLIGHT_GEM_HELMET) &&
            (!chest.isEmpty()) && (chest.getItem() == ModItems.FLIGHT_GEM_CHESTPLATE) &&
            (!legs.isEmpty()) && (legs.getItem() == ModItems.FLIGHT_GEM_LEGGINGS) &&
            (!feet.isEmpty()) && (feet.getItem() == ModItems.FLIGHT_GEM_BOOTS)) ||
            (entity.capabilities.isCreativeMode) || (entity.isSpectator())) {
            if (ArmorHandler.flight_gem_armor && ArmorHandler.dragon_resistance) {
                entity.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 180, ArmorHandler.dragon_resistance_lvl, false, false));
            }
            if (ArmorHandler.flight_gem_armor && ArmorHandler.dragon_fire) {
                entity.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 180, ArmorHandler.dragon_fire_lvl, false, false));
            }
            if (ArmorHandler.flight_gem_armor && ArmorHandler.dragon_strength) {
                entity.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 90, ArmorHandler.dragon_strength_lvl, false, false));
            }
            if (ArmorHandler.flight_gem_armor && ArmorHandler.dragon_fly) {
                entity.capabilities.allowFlying = true;
            }
        } else {
            entity.capabilities.allowFlying = false;
            entity.capabilities.isFlying = false;
		}
	}
	
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if (ArmorHandler.flight_gem_armor && ArmorHandler.dragon_fly) {
            tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.flightarmor_1").getFormattedText());
        }
        if (ArmorHandler.flight_gem_armor && ArmorHandler.dragon_strength) {
            tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.flightarmor_2").getFormattedText());
        }
        if (ArmorHandler.flight_gem_armor && ArmorHandler.dragon_fire) {
            tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.flightarmor_3").getFormattedText());
        }
        if (ArmorHandler.flight_gem_armor && ArmorHandler.dragon_resistance) {
            tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.flightarmor_4").getFormattedText());
        }
    }

	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	

}
