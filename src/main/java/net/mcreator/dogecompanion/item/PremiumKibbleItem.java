package net.mcreator.dogecompanion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;

import net.mcreator.dogecompanion.procedures.PremiumKibbleItemIsCraftedsmeltedProcedure;

public class PremiumKibbleItem extends Item {
	public PremiumKibbleItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(16).food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.3f).build()));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Player entity) {
		super.onCraftedBy(itemstack, entity);
		PremiumKibbleItemIsCraftedsmeltedProcedure.execute(entity);
	}
}