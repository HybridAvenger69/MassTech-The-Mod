package com.hybridavenger69.mttm.items.tools;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.item.*;

import net.minecraft.world.entity.LivingEntity;

public class BattleAxeItem extends AxeItem implements BattleAxeItemInt {


    public BattleAxeItem(Tier p_40521_, float p_40522_, float p_40523_, Properties p_40524_) {
        super(p_40521_, p_40522_, p_40523_, p_40524_);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // Apply damage to the primary target
        target.hurt(DamageSource.GENERIC, 8);

        // Apply damage to nearby entities within a radius of 3 blocks
        double radius = 3.0D;
        target.level.getEntitiesOfClass(LivingEntity.class,
                target.getBoundingBox().expandTowards(radius, radius, radius), (livingEntity) -> livingEntity != attacker && livingEntity != target).forEach(entity -> entity.hurt(DamageSource.GENERIC, 6));

        return super.hurtEnemy(stack, target, attacker);
    }


}