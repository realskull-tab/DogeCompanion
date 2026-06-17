package net.mcreator.dogecompanion.item;

public class BasicKibbleItem extends Item {
	public BasicKibbleItem(Item.Properties properties) {
		super(properties.stacksTo(16).food((new FoodProperties.Builder()).nutrition(5).saturationModifier(0.1f).build()));
	}
}