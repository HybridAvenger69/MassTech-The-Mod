package com.hybridavenger69.mttm.items.tools;

import com.google.common.collect.Multimap;

import com.hybridavenger69.mttm.items.tools.util.ToolEnergy;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.item.*;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

import org.jetbrains.annotations.Nullable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;


import java.util.UUID;

public class BattleAxeItem extends SwordItem {

    // Create a unique UUID for the attribute modifier
    private static final UUID KNOCKBACK_UUID = UUID.randomUUID();

    public BattleAxeItem(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }

    // Override the onLeftClickEntity method to apply the Knockback attribute to the entity being attacked
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.knockback(1.0F, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
        return super.hurtEnemy(stack, target, attacker);
    }

    // Override the getAttributeModifiers method to add the Knockback attribute modifier


    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        Multimap<Attribute, AttributeModifier> map = super.getAttributeModifiers(slot, null);

        if (slot == EquipmentSlot.MAINHAND) {
            map.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(KNOCKBACK_UUID, "Knockback", 20, AttributeModifier.Operation.ADDITION));
        }

        return map;
    }



}