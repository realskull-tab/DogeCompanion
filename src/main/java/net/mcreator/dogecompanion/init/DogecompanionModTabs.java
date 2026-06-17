/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dogecompanion.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.dogecompanion.DogecompanionMod;

public class DogecompanionModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DogecompanionMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SUCH_TAB = REGISTRY.register("such_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dogecompanion.such_tab")).icon(() -> new ItemStack(Items.COOKED_COD)).displayItems((parameters, tabData) -> {
				tabData.accept(DogecompanionModItems.BASIC_KIBBLE.get());
				tabData.accept(DogecompanionModItems.PREMIUM_KIBBLE.get());
			}).build());
}