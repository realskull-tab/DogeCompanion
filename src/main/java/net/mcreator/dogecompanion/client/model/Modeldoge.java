package net.mcreator.dogecompanion.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeldoge extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("dogecompanion", "modeldoge"), "main");
	public final ModelPart left leg;
	public final ModelPart right leg;
	public final ModelPart torso;
	public final ModelPart head
	and nose;
	public final ModelPart ears;
	public final ModelPart tail;
	public final ModelPart back
	leg right;
	public final ModelPart back
	leg left;

	public Modeldoge(ModelPart root) {super(root);
		this.left leg = root.getChild("left leg");
		this.right leg = root.getChild("right leg");
		this.torso = root.getChild("torso");
		this.head and nose = root.getChild("head and nose");
		this.ears = root.getChild("ears");
		this.tail = root.getChild("tail");
		this.back leg right = root.getChild("back leg right");
		this.back leg left = root.getChild("back leg left");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition left leg = partdefinition.addOrReplaceChild("left leg", CubeListBuilder.create().texOffs(20, 0).addBox(-0.45F, -0.375F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.45F, 18.375F, -3.0F));
		PartDefinition right leg = partdefinition.addOrReplaceChild("right leg", CubeListBuilder.create().texOffs(8, 20).addBox(-0.65F, -0.475F, -0.55F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.65F, 18.475F, -2.45F));
		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(3.0F, 19.0F, 6.0F));
		PartDefinition cube_r1 = torso.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.3F, -2.5F, 1.425F, 0.0687F, 0.0247F));
		PartDefinition cube_r2 = torso.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -3.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.275F, -7.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition head and nose = partdefinition.addOrReplaceChild("head and nose", CubeListBuilder.create(), PartPose.offset(1.5F, 16.7F, -1.5F));
		PartDefinition cube_r3 = head and nose.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 10).addBox(-1.0F, -3.0F, -2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.025F, -2.5F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r4 = head and nose.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.125F, -0.925F, -5.15F, -0.2182F, 0.0F, 0.0F));
		PartDefinition ears = partdefinition.addOrReplaceChild("ears", CubeListBuilder.create().texOffs(24, 3).addBox(2.5F, -0.5F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(0.5F, -0.5F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 12.5F, -7.0F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.75F, 18.25F, 8.0F));
		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(20, 7).addBox(-1.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, 1.75F, -1.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 23).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, 0.5F, 0.5F, 0.829F, 0.0F, 0.0F));
		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(26, 6).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.325F, -1.8F, 0.225F, 0.7862F, -0.5351F, -0.4723F));
		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.65F, -2.375F, -0.525F, 0.8322F, -0.2602F, -0.3543F));
		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(22, 23).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.65F, -1.25F, 1.0F, 1.8031F, 0.3499F, 0.0362F));
		PartDefinition back leg right = partdefinition.addOrReplaceChild("back leg right", CubeListBuilder.create(), PartPose.offset(2.75F, 20.0F, 5.0F));
		PartDefinition cube_r10 = back leg right.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(16, 17).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, 1.45F, 0.575F, 1.4835F, 0.0F, 0.0F));
		PartDefinition back leg left = partdefinition.addOrReplaceChild("back leg left", CubeListBuilder.create().texOffs(12, 20).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 20.0F, 4.5F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}

}