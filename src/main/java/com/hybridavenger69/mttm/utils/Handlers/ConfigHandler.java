package com.hybridavenger69.mttm.utils.Handlers;


import java.io.File;

import com.hybridavenger69.mttm.MTTM;
import com.hybridavenger69.mttm.utils.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler {
    public static Configuration config;

    public static int FUSION_FURNACE_GUI = 0;
    

    public static int FUSION_FURNACE_SPEED = 350;
    

    
    public static void init(File file) {
        config = new Configuration(file);

        String category;

        category = "IDs";
        config.addCustomCategoryComment(category, "Set ID's for each entity and gui");
        FUSION_FURNACE_GUI = config.getInt("Alloy Merger GUI ID", category, 0, 0, 999, "ID for the Alloy Merger GUI");
        

        
        category = "Machines";
        config.addCustomCategoryComment(category, "Tweak the speed of all the machines added by Little Additions");
        FUSION_FURNACE_SPEED = config.getInt("Alloy Merger processing speed", category, 350, 10, 700, "Change the processing speed of the Alloy Merger. Vanilla furnace speed is 200.");
        
        config.save();
    }

    public static void registerConfig(FMLPreInitializationEvent event) {
        MTTM.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
        MTTM.config.mkdirs();
        init(new File(MTTM.config.getPath(), Reference.MOD_ID + ".cfg"));
    }
}
