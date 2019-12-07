package com.hybridavenger69.mttm.items.food;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AppleHealthBoost extends FoodBase
{

	PotionEffect effect;
	
	public AppleHealthBoost(String name, int amount, float saturation, boolean isAnimalFood, PotionEffect effect)
	{
		super(name, amount, saturation, isAnimalFood);
		setAlwaysEdible();
		
		this.effect = effect;
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
	{
		if(!worldIn.isRemote) {
			player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
		}
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
	
	@Override
	public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
		// TODO Auto-generated method stub
		tooltip.add(TextFormatting.BLUE + new TextComponentTranslation("tooltip.healthapple").getFormattedText());
		super.addInformation(stack, player, tooltip, advanced);
	}
}
