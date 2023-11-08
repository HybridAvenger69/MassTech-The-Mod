package com.hybridavenger69.mttm.items.tools;

import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import org.jetbrains.annotations.Nullable;

public interface BattleAxeItemI {
    Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot);

    @Nullable ICapabilityProvider initCapabilities(ItemStack stack, CompoundNBT nbt);
}
