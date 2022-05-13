package com.hybridavenger69.mttm.world;

import com.hybridavenger69.mttm.Mttm;
import com.hybridavenger69.mttm.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Mttm.MOD_ID)
public class WorldEvents {
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);


    }
}

