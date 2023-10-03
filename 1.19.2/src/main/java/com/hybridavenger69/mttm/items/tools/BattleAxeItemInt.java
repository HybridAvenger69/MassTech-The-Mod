package com.hybridavenger69.mttm.items.tools;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public interface BattleAxeItemInt {
    boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker);
}
