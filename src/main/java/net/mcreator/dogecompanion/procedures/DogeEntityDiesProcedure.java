package net.mcreator.dogecompanion.procedures;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

public class DogeEntityDiesProcedure {
	public static void execute(DamageSource damagesource) {
		if (damagesource == null)
			return;
		if ((damagesource.getEntity()) instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
			AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("dogecompanion:you_killedthedoge"));
			if (_adv != null) {
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
	}
}