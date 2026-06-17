/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dogecompanion.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.dogecompanion.item.BasicKibbleItem;
import net.mcreator.dogecompanion.DogecompanionMod;

import java.util.function.Function;

public class DogecompanionModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(DogecompanionMod.MODID);
	public static final DeferredItem<Item> BASIC_KIBBLE;
	static {
		BASIC_KIBBLE = register("basic_kibble", BasicKibbleItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}