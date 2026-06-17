package net.mcreator.dogecompanion.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BasicKibbleItem extends Item {
	public BasicKibbleItem(Item.Properties properties) {
		super(properties.stacksTo(16).food((new FoodProperties.Builder()).nutrition(5).saturationModifier(0.1f).build()));
	}
}