package com.hybridavenger69.mttm.items.tools.weapons;

import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import java.util.UUID;

public class BattleHammerItem extends SwordItem {

    private static final UUID KNOCKBACK_UUID = UUID.randomUUID();

    public BattleHammerItem(Tier tier, int attackDamage, float attackSpeed, Item.Properties properties) {
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
