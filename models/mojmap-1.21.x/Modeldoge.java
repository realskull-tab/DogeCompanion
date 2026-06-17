// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldoge<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "doge"), "main");
	private final ModelPart leftLeg;
	private final ModelPart rightLeg;
	private final ModelPart torso;
	private final ModelPart headAndNose;
	private final ModelPart ears;
	private final ModelPart tail;
	private final ModelPart backLegRight;
	private final ModelPart backLegLeft;

	public Modeldoge(ModelPart root) {
		this.leftLeg = root.getChild("left leg");
		this.rightLeg = root.getChild("right leg");
		this.torso = root.getChild("torso");
		this.headAndNose = root.getChild("head and nose");
		this.ears = root.getChild("ears");
		this.tail = root.getChild("tail");
		this.backLegRight = root.getChild("back leg right");
		this.backLegLeft = root.getChild("back leg left");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leftLeg = partdefinition.addOrReplaceChild("left leg", CubeListBuilder.create().texOffs(20, 0)
				.addBox(-0.45F, -0.375F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.45F, 18.375F, -3.0F));

		PartDefinition rightLeg = partdefinition.addOrReplaceChild("right leg", CubeListBuilder.create().texOffs(8, 20)
				.addBox(-0.65F, -0.475F, -0.55F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.65F, 18.475F, -2.45F));

		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create(),
				PartPose.offset(3.0F, 19.0F, 6.0F));

		PartDefinition cube_r1 = torso.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -0.3F, -2.5F, 1.425F, 0.0687F, 0.0247F));

		PartDefinition cube_r2 = torso.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -3.0F, 5.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.275F, -7.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition headAndNose = partdefinition.addOrReplaceChild("head and nose", CubeListBuilder.create(),
				PartPose.offset(1.5F, 16.7F, -1.5F));

		PartDefinition cube_r3 = headAndNose.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(16, 10).addBox(-1.0F, -3.0F, -2.0F, 4.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -0.025F, -2.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r4 = headAndNose.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.125F, -0.925F, -5.15F, -0.2182F, 0.0F, 0.0F));

		PartDefinition ears = partdefinition.addOrReplaceChild("ears",
				CubeListBuilder.create().texOffs(24, 3)
						.addBox(2.5F, -0.5F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(0.5F, -0.5F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 12.5F, -7.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(0.75F, 18.25F, 8.0F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(20, 7).addBox(-1.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.25F, 1.75F, -1.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tail
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(16, 23).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.75F, 0.5F, 0.5F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(26, 6).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.325F, -1.8F, 0.225F, 0.7862F, -0.5351F, -0.4723F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.65F, -2.375F, -0.525F, 0.8322F, -0.2602F, -0.3543F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(22, 23).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.65F, -1.25F, 1.0F, 1.8031F, 0.3499F, 0.0362F));

		PartDefinition backLegRight = partdefinition.addOrReplaceChild("back leg right", CubeListBuilder.create(),
				PartPose.offset(2.75F, 20.0F, 5.0F));

		PartDefinition cube_r10 = backLegRight.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(16, 17).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.55F, 1.45F, 0.575F, 1.4835F, 0.0F, 0.0F));

		PartDefinition backLegLeft = partdefinition.addOrReplaceChild("back leg left", CubeListBuilder.create()
				.texOffs(12, 20).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 20.0F, 4.5F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		headAndNose.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ears.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		backLegRight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		backLegLeft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}