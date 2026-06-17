package net.mcreator.dogecompanion.client.renderer;

public class DogeRenderer extends MobRenderer<DogeEntity, LivingEntityRenderState, Modeldoge> {
	private DogeEntity entity = null;
	private final ResourceLocation entityTexture = ResourceLocation.parse("dogecompanion:textures/entities/texture.png");

	public DogeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldoge(context.bakeLayer(Modeldoge.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DogeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}