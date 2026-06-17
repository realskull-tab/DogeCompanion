package net.mcreator.dogecompanion.procedures;

import net.neoforged.bus.api.Event;

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