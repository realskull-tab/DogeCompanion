/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dogecompanion.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.dogecompanion.client.model.Modeldoge;

@EventBusSubscriber(Dist.CLIENT)
public class DogecompanionModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeldoge.LAYER_LOCATION, Modeldoge::createBodyLayer);
	}
}