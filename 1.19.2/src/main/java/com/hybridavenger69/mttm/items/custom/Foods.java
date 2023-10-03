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
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 400, 1), 1.0f)
            .alwaysEat()
            .build();

    public static final FoodProperties WATER_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .alwaysEat()
            .saturationMod(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 6000, 50), 5.0f)
            .build();

    public static final FoodProperties REGEN_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.1f)
            .alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1800, 4), 2.5f)
            .build();

    public static final FoodProperties ABSORP_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.1f)
            .alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 12000, 4), 2.5f)
            .build();

    public static final FoodProperties NIGHT_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.1f)
            .alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 12000, 4), 2.5f)
            .build();

    public static final FoodProperties DAMAGE_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.1f)
            .alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 4), 2.5f)
            .build();

    public static final FoodProperties DIG_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.1f)
            .alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 5000, 3), 2.5f)
            .build();

    public static final FoodProperties FIRE_APPLE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.1f)
            .alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 5000, 3), 2.5f)
            .build();




}

