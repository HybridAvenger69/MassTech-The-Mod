  package com.hybridavenger69.mttm.init;

import java.util.ArrayList;
import java.util.List;

import com.hybridavenger69.mttm.items.ItemBase;
import com.hybridavenger69.mttm.items.Armor.ArmorFlight;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;



public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>(); 
	
	//Tool And Armor stuff
	public static final ArmorMaterial ARMOR_MATERIAL_ICARUS = EnumHelper.addArmorMaterial("armor_material_icarus", "Reference.MOD_ID + \":icarus", 125, new int[] { 5, 7, 9, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	//Materials
	 
    
	//Crafting Components
	 public static final Item CRAFTING_COMPONENT = new ItemBase("crafting_component");
	 public static final Item CRAFTING_COMPONENT_2 = new ItemBase("crafting_component_2");
	 public static final Item CRAFTING_COMPONENT_3 = new ItemBase("crafting_component_3");
	 public static final Item FLIGHT_CORE = new ItemBase("flight_core");
	 
	 //Basic Items
	 public static final Item TECH_INGOT = new ItemBase("tech_ingot");
	 public static final Item TECH_DUST = new ItemBase("tech_dust");
	 
	
	 //Advanced Items
	 public static final Item NETHER_INGOT = new ItemBase("nether_ingot");
	 public static final Item EUCLASE_GEM = new ItemBase("euclase_gem");
	 
    //Basic Tools
	 
	 
	 
	//Advanced Tools
	 
	 
   
	 
   //Basic Armor
	
	 
	 
   //Advanced Armor
	 
	 
	 
   //Icarus Armor(No Flight)  	 
   public static final Item ICARUS_HELMET = new ArmorFlight("icarus_helmet", ARMOR_MATERIAL_ICARUS, 1, EntityEquipmentSlot.HEAD);
   public static final Item ICARUS_CHESTPLATE = new ArmorFlight("icarus_chestplate", ARMOR_MATERIAL_ICARUS, 1, EntityEquipmentSlot.CHEST);
   public static final Item ICARUS_LEGGINGS = new ArmorFlight("icarus_leggings", ARMOR_MATERIAL_ICARUS, 2, EntityEquipmentSlot.LEGS);
   public static final Item ICARUS_BOOTS = new ArmorFlight("icarus_boots", ARMOR_MATERIAL_ICARUS, 1, EntityEquipmentSlot.FEET);

		

	
}
