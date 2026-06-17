package net.mcreator.dogecompanion.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.animation.AnimationDefinition;

import net.mcreator.dogecompanion.entity.DogeEntity;
import net.mcreator.dogecompanion.client.model.animations.doge3withanimationsAnimation;
import net.mcreator.dogecompanion.client.model.Modeldoge;

import java.util.Map;

public class DogeRenderer extends MobRenderer<DogeEntity, LivingEntityRenderState, Modeldoge> {
	private DogeEntity entity = null;
	private final ResourceLocation entityTexture = ResourceLocation.parse("dogecompanion:textures/entities/texture.png");

	public DogeRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modeldoge.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DogeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modeldoge {
		private DogeEntity entity = null;
		private final KeyframeAnimation keyframeAnimation0;
		private final KeyframeAnimation keyframeAnimation1;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = safeBake(doge3withanimationsAnimation.WALK_RAGEBAIT);
			this.keyframeAnimation1 = safeBake(doge3withanimationsAnimation.WALK_RAGEBAIT);
		}

		private KeyframeAnimation safeBake(AnimationDefinition source) {
			try {
				return source.bake(root);
			} catch (IllegalArgumentException e) {
				return new AnimationDefinition(0, false, Map.of()).bake(root);
			}
		}

		public void setEntity(DogeEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.keyframeAnimation0.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			this.keyframeAnimation1.apply(entity.animationState1, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}