package com.hybridavenger69.mttm;

import com.hybridavenger69.mttm.blocks.recipes.FusionFurnaceRecipes;
import com.hybridavenger69.mttm.init.FusionRecipes;
import com.hybridavenger69.mttm.init.ModItems;
import com.hybridavenger69.mttm.init.ModRecipes;
import com.hybridavenger69.mttm.proxy.CommonProxy;
import com.hybridavenger69.mttm.util.Reference;
import com.hybridavenger69.mttm.util.Handlers.GuiHandler;
import com.hybridavenger69.mttm.world.ModWorldGen;
import com.hybridavenger69.mttm.tabs.MttmTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{

	@Instance
	public static Main Instance;
	
	public static final CreativeTabs mttmtab = new MttmTab("mttmtab");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	
		
	}
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
	  ModRecipes.init();
	  NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
	  
	}
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
	
	
	
}
