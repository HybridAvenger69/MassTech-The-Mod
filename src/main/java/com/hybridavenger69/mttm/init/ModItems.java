package com.hybridavenger69.mttm.init;

import java.util.ArrayList;
import java.util.List;

import com.hybridavenger69.mttm.items.ItemBase;
import com.hybridavenger69.mttm.items.KnifeBase;
import com.hybridavenger69.mttm.items.tools.TechAxe;
import com.hybridavenger69.mttm.items.tools.TechPick;
import com.hybridavenger69.mttm.items.tools.TechSpade;
import com.hybridavenger69.mttm.items.tools.TechSword;
import com.hybridavenger69.mttm.util.Reference;
import com.hybridavenger69.mttm.items.armor.ArmorBase;
import com.hybridavenger69.mttm.items.armor.ArmorFlight;
import com.hybridavenger69.mttm.items.food.AppleHealthBoost;
import com.hybridavenger69.mttm.items.food.FoodEffectBase;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{

	//Materials
	public static final ToolMaterial MATERIAL_TTECH = EnumHelper.addToolMaterial("material_tech", 2, 750, 8.0F, 3.0F, 8);
	public static final ToolMaterial MATERIAL_TGEM = EnumHelper.addToolMaterial("material_gem", 3, 1250, 9.5F, 3.5F, 10);
	
	//ArmorMaterials
	public static final ArmorMaterial ARMOR_MATERIAL_TTECH = EnumHelper.addArmorMaterial("armor_material_tech", Reference.MOD_ID + ":tech", 12, 
			new int[] {2, 5, 5, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_TGEM = EnumHelper.addArmorMaterial("armor_material_gem", Reference.MOD_ID + ":gem", 12, 
			new int[] {3, 6, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	public static final ArmorMaterial ARMOR_MATERIAL_FLIGHT = EnumHelper.addArmorMaterial("armor_material_flight", Reference.MOD_ID + ":flight", 125, 
			new int[] {5, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	
	//Items
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final ItemBase TECH_INGOT = new ItemBase("tech_ingot");
	public static final ItemBase TECH_GEM = new ItemBase("tech_gem");
	public static final ItemBase NETHER_INGOT = new ItemBase("nether_ingot");
	
	
	//Tools T1
	public static final TechSword TECH_SWORD = new TechSword("tech_sword", MATERIAL_TTECH);
	public static final TechSpade TECH_SHOVEL = new TechSpade("tech_shovel", MATERIAL_TTECH);
	public static final TechPick  TECH_PICK = new TechPick("tech_pick", MATERIAL_TTECH);
	public static final TechAxe  TECH_AXE = new TechAxe("tech_axe", MATERIAL_TTECH);
	
	//Tools T2
	public static final TechSword TECH_GEM_SWORD = new TechSword("tech_gem_sword", MATERIAL_TGEM);
	public static final TechSpade TECH_GEM_SHOVEL = new TechSpade("tech_gem_shovel", MATERIAL_TGEM);
	public static final TechPick TECH_GEM_PICK = new TechPick("tech_gem_pick", MATERIAL_TGEM);
	public static final TechAxe TECH_GEM_AXE = new TechAxe("tech_gem_axe", MATERIAL_TGEM);
	
	//Armor T1
	public static final Item TECH_HELMET = new ArmorBase ("tech_helmet", ARMOR_MATERIAL_TTECH, 1, EntityEquipmentSlot.HEAD);
	public static final Item TECH_CHESTPLATE = new ArmorBase("tech_chestplate", ARMOR_MATERIAL_TTECH, 1, EntityEquipmentSlot.CHEST);
	public static final Item TECH_LEGGINGS = new ArmorBase("tech_leggings", ARMOR_MATERIAL_TTECH, 2, EntityEquipmentSlot.LEGS);
	public static final Item TECH_BOOTS = new ArmorBase("tech_boots", ARMOR_MATERIAL_TTECH, 1, EntityEquipmentSlot.FEET);
	
	//Armor T2
	public static final Item GEM_HELMET = new ArmorBase ("gem_helmet", ARMOR_MATERIAL_TGEM, 1, EntityEquipmentSlot.HEAD);
	public static final Item GEM_CHESTPLATE = new ArmorBase ("gem_chestplate", ARMOR_MATERIAL_TGEM, 1, EntityEquipmentSlot.CHEST);
	public static final Item GEM_LEGGINGS = new ArmorBase ("gem_leggings", ARMOR_MATERIAL_TGEM, 2, EntityEquipmentSlot.LEGS);
	public static final Item GEM_BOOTS = new ArmorBase ("gem_boots", ARMOR_MATERIAL_TGEM, 1, EntityEquipmentSlot.FEET);
	
	//Armor T2
	public static final Item FLIGHT_GEM_HELMET = new ArmorFlight ("flight_gem_helmet", ARMOR_MATERIAL_FLIGHT, 1, EntityEquipmentSlot.HEAD);
	public static final Item FLIGHT_GEM_CHESTPLATE = new ArmorFlight ("flight_gem_chestplate", ARMOR_MATERIAL_FLIGHT, 1, EntityEquipmentSlot.CHEST);
	public static final Item FLIGHT_GEM_LEGGINGS = new ArmorFlight ("flight_gem_leggings", ARMOR_MATERIAL_FLIGHT, 2, EntityEquipmentSlot.LEGS);
	public static final Item FLIGHT_GEM_BOOTS = new ArmorFlight ("flight_gem_boots", ARMOR_MATERIAL_FLIGHT, 1, EntityEquipmentSlot.FEET);
	
	//Crafting Components
	public static final ItemBase CRAFTING_COMPONENT = new ItemBase("crafting_component");
	public static final ItemBase CRAFTING_COMPONENT_2 = new ItemBase("crafting_component_2");
	public static final ItemBase CRAFTING_COMPONENT_3 = new ItemBase("crafting_component_3");
	
	
	
	
	//Other
	public static final ItemBase TECH_DUST = new ItemBase("tech_dust");
	public static final ItemBase NETHER_INGOT_NUGGET = new ItemBase("nether_ingot_nugget");
	
	
	//Food
	public static final Item GOOD_APPLE =  new AppleHealthBoost("good_apple", 4, 2.4F, false, new PotionEffect(MobEffects.HEALTH_BOOST, (80*40), 1, false, true));
	
}
