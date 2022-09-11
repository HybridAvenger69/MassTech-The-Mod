package com.hybridavenger69.mttm.items.tiers;

import com.hybridavenger69.hlib.main.ItemRegistry;
import com.hybridavenger69.mttm.Mttm;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ArmorTiers implements ArmorMaterial {
    TECH("tech", 50, new int[]{2, 5, 6, 2}, 7, SoundEvents.ARMOR_EQUIP_IRON,
            4.0F, 0.2F, () -> {
        return Ingredient.of(ItemRegistry.TECH_INGOT.get());
    }),

    EUCLASE("euclase", 100, new int[]{4, 7, 9, 4}, 13, SoundEvents.ARMOR_EQUIP_DIAMOND,
            4.0F, 0.2F, () -> {
        return Ingredient.of(ItemRegistry.EUCLASE_GEM.get());
    }),

    ICARUS("icarus", 150, new int[]{5, 8, 10, 5}, 16, SoundEvents.ARMOR_EQUIP_NETHERITE,
            4.0F, 0.2F, () -> {
        return Ingredient.of(ItemRegistry.NETHER_INGOT.get());
    });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ArmorTiers(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_,
                      SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return Mttm.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}