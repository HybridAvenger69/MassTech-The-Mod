package com.hybridavenger69.mttm.configs;

import net.minecraftforge.common.ForgeConfigSpec;

public class MTCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> TECH_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> TECH_ORE_VEIN_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> EUCLASE_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> EUCLASE_ORE_VEIN_SIZE;

    static {
        BUILDER.push("Configs for MassTech: The Mod");

        TECH_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many Tech Ore Veins spawn per chunk!")
                .define("Veins Per Chunk", 7);
        TECH_ORE_VEIN_SIZE = BUILDER.comment("How many Tech Ore Blocks spawn in one Vein!")
                .defineInRange("Vein Size", 9, 4, 20);

        EUCLASE_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many Euclase Ore Veins spawn per chunk!")
                .define("Veins Per Chunk", 7);
        EUCLASE_ORE_VEIN_SIZE = BUILDER.comment("How many Euclase Ore Blocks spawn in one Vein!")
                .defineInRange("Vein Size", 9, 4, 20);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}

