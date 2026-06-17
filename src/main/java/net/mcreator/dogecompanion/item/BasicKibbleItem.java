package net.mcreator.dogecompanion.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;

import net.mcreator.dogecompanion.procedures.BasicKibbleItemIsCraftedsmeltedProcedure;

public class BasicKibbleItem extends Item {
	public BasicKibbleItem(Item.Properties properties) {
		super(properties.stacksTo(16).food((new FoodProperties.Builder()).nutrition(5).saturationModifier(0.1f).build()));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Player entity) {
		super.onCraftedBy(itemstack, entity);
		BasicKibbleItemIsCraftedsmeltedProcedure.execute(entity);
	}
}