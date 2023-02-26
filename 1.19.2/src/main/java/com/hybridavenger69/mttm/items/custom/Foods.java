package com.hybridavenger69.mttm.items.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

import java.util.Map;

public class Foods {
    public static final FoodProperties TOASTED_BREAD = new FoodProperties.Builder()
            .nutrition(6)
            .fast()
            .saturationMod(0.7f)
            .build();

    public static final FoodProperties BURGER = new FoodProperties.Builder()
            .nutrition(9)
            .fast()
            .saturationMod(1.0f)
            .build();

    public static final FoodProperties CHEESEBURGER = new FoodProperties.Builder()
            .nutrition(12)
            .fast()
            .saturationMod(1.4f)
            .build();

    public static final FoodProperties CHEESE = new FoodProperties.Builder()
            .nutrition(2)
            .fast()
            .saturationMod(0.4f)
            .build();

    public static final FoodProperties MILK = new FoodProperties.Builder()
            .nutrition(1)
            .fast()
            .saturationMod(0.2f)
            .build();

    public static final FoodProperties BAKED_APPLE = new FoodProperties.Builder()
            .nutrition(6)
            .fast()
            .saturationMod(0.8f)
            .build();

    public static final FoodProperties HEALTH_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 600, 3), 1.0f)
            .alwaysEat()
            .build();

    public static final FoodProperties WATER_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 600, 50), 5.0f)
            .build();





}

