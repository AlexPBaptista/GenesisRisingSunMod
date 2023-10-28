package dev.f1r3k1ll3r.genesisrisingsun.client.model;
// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.f1r3k1ll3r.genesisrisingsun.GenesisRisingSun;
import dev.f1r3k1ll3r.genesisrisingsun.init.entity.PortalGuardian;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class PortalGuardianModel<T extends PortalGuardian> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(GenesisRisingSun.MODID, "portal_guardian"),
			"main"
	);
	private final ModelPart PortalGuardian;

	public PortalGuardianModel(ModelPart root) {
		this.PortalGuardian = root.getChild("PortalGuardian");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition PortalGuardian = partdefinition.addOrReplaceChild("PortalGuardian", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 0.0F));

		PartDefinition Torso = PortalGuardian.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(7, 6).addBox(-3.3352F, -7.111F, -2.2929F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.6648F, -5.889F, -0.7071F));

		PartDefinition Spine1_r1 = Torso.addOrReplaceChild("Spine1_r1", CubeListBuilder.create().texOffs(4, 0).addBox(-3.0F, -8.0F, -2.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3352F, -6.111F, -0.2929F, 0.0F, 0.0F, 0.1745F));

		PartDefinition RibsRight = Torso.addOrReplaceChild("RibsRight", CubeListBuilder.create(), PartPose.offset(-1.3352F, -4.0651F, -2.2929F));

		PartDefinition Ribs1 = RibsRight.addOrReplaceChild("Ribs1", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0459F, 0.0F));

		PartDefinition Bones11_r1 = Ribs1.addOrReplaceChild("Bones11_r1", CubeListBuilder.create().texOffs(28, 18).addBox(-0.8287F, -1.0459F, -1.489F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8287F, 0.0459F, -1.511F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Bones1_r1 = Ribs1.addOrReplaceChild("Bones1_r1", CubeListBuilder.create().texOffs(28, 28).addBox(-1.0952F, -1.0F, -1.6974F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0952F, 0.0F, -1.3026F, 0.0F, -0.7854F, 0.0F));

		PartDefinition Ribs3 = RibsRight.addOrReplaceChild("Ribs3", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition Bones31_r1 = Ribs3.addOrReplaceChild("Bones31_r1", CubeListBuilder.create().texOffs(6, 29).addBox(-0.8287F, -1.0459F, -1.489F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8287F, 0.0F, -1.511F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Bones3_r1 = Ribs3.addOrReplaceChild("Bones3_r1", CubeListBuilder.create().texOffs(3, 29).addBox(-1.3881F, -1.0F, -2.4045F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3881F, -0.0459F, -0.5955F, 0.0F, -0.7854F, 0.0F));

		PartDefinition Ribs5 = RibsRight.addOrReplaceChild("Ribs5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Bones51_r1 = Ribs5.addOrReplaceChild("Bones51_r1", CubeListBuilder.create().texOffs(30, 31).addBox(-0.8287F, -1.0459F, -1.489F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8287F, 0.0F, -1.511F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Bones5_r1 = Ribs5.addOrReplaceChild("Bones5_r1", CubeListBuilder.create().texOffs(26, 28).addBox(-1.3997F, -1.0F, -1.8441F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3997F, -0.0459F, -1.1559F, 0.0F, -0.7854F, 0.0F));

		PartDefinition RibsLeft = Torso.addOrReplaceChild("RibsLeft", CubeListBuilder.create(), PartPose.offset(-1.3352F, -4.0651F, 1.7071F));

		PartDefinition Ribs2 = RibsLeft.addOrReplaceChild("Ribs2", CubeListBuilder.create(), PartPose.offset(-1.0F, -5.8678F, 0.0F));

		PartDefinition Bones21_r1 = Ribs2.addOrReplaceChild("Bones21_r1", CubeListBuilder.create().texOffs(29, 29).addBox(-1.0418F, -1.1781F, -3.5117F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0418F, 0.0F, 2.5117F, 0.0F, -0.7854F, 0.0F));

		PartDefinition Bones2_r1 = Ribs2.addOrReplaceChild("Bones2_r1", CubeListBuilder.create().texOffs(28, 29).addBox(-1.0964F, -1.0F, -2.6452F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0964F, -0.1781F, 1.6452F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Ribs4 = RibsLeft.addOrReplaceChild("Ribs4", CubeListBuilder.create(), PartPose.offset(-1.0F, -2.8678F, 0.0F));

		PartDefinition Bones41_r1 = Ribs4.addOrReplaceChild("Bones41_r1", CubeListBuilder.create().texOffs(29, 29).addBox(-1.0418F, -1.1781F, -3.5117F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0418F, 0.0F, 2.5117F, 0.0F, -0.7854F, 0.0F));

		PartDefinition Bones4_r1 = Ribs4.addOrReplaceChild("Bones4_r1", CubeListBuilder.create().texOffs(15, 29).addBox(-1.3893F, -1.0F, -2.9381F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3893F, -0.1781F, 0.9381F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Ribs6 = RibsLeft.addOrReplaceChild("Ribs6", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.1322F, 0.0F));

		PartDefinition Bones61_r1 = Ribs6.addOrReplaceChild("Bones61_r1", CubeListBuilder.create().texOffs(17, 16).mirror().addBox(-1.0418F, -1.1781F, -3.5117F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0418F, 0.0F, 2.5117F, 0.0F, -0.7854F, 0.0F));

		PartDefinition Bones6_r1 = Ribs6.addOrReplaceChild("Bones6_r1", CubeListBuilder.create().texOffs(6, 5).mirror().addBox(-1.3893F, -1.0F, -1.9381F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3893F, -0.1781F, 0.9381F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Conection = Torso.addOrReplaceChild("Conection", CubeListBuilder.create().texOffs(25, 13).addBox(-0.9132F, -0.4924F, -7.0F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.3498F, -11.8748F, -0.2929F));

		PartDefinition RightArm = Conection.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(0.5588F, -1.0722F, 8.5F));

		PartDefinition RightShoulder_r1 = RightArm.addOrReplaceChild("RightShoulder_r1", CubeListBuilder.create().texOffs(14, 0).addBox(-1.6734F, -2.5112F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1292F, -0.6529F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition RightUpperarm = RightArm.addOrReplaceChild("RightUpperarm", CubeListBuilder.create(), PartPose.offset(-1.6485F, 3.1524F, -0.0086F));

		PartDefinition RightUpperarm_r1 = RightUpperarm.addOrReplaceChild("RightUpperarm_r1", CubeListBuilder.create().texOffs(19, 26).addBox(-1.8957F, -4.3165F, -2.4914F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition RightLowerarm = RightUpperarm.addOrReplaceChild("RightLowerarm", CubeListBuilder.create(), PartPose.offset(-0.4681F, 6.5014F, 2.0086F));

		PartDefinition RightHand_r1 = RightLowerarm.addOrReplaceChild("RightHand_r1", CubeListBuilder.create().texOffs(0, 25).addBox(-2.9285F, -3.1224F, -3.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5009F, 8.3045F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition RightLowerarm_r1 = RightLowerarm.addOrReplaceChild("RightLowerarm_r1", CubeListBuilder.create().texOffs(20, 27).addBox(-1.9267F, -5.5134F, -3.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4991F, 3.6955F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition LeftArm = Conection.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(0.5588F, -1.0722F, -7.5F));

		PartDefinition LeftShoulder_r1 = LeftArm.addOrReplaceChild("LeftShoulder_r1", CubeListBuilder.create().texOffs(3, 13).addBox(-1.5442F, -3.1641F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition LeftUpperArm = LeftArm.addOrReplaceChild("LeftUpperArm", CubeListBuilder.create(), PartPose.offset(-1.6263F, 3.0695F, 0.0237F));

		PartDefinition LeftUpperarm_r1 = LeftUpperArm.addOrReplaceChild("LeftUpperarm_r1", CubeListBuilder.create().texOffs(16, 25).mirror().addBox(-1.9179F, -4.2335F, -0.5237F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition LeftLowerArm = LeftUpperArm.addOrReplaceChild("LeftLowerArm", CubeListBuilder.create(), PartPose.offset(-0.4903F, 6.5843F, -2.0237F));

		PartDefinition LeftLowerarm_r1 = LeftLowerArm.addOrReplaceChild("LeftLowerarm_r1", CubeListBuilder.create().texOffs(6, 2).addBox(-1.3894F, -4.67F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(26, 10).addBox(-1.3894F, 3.33F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9618F, 2.8521F, 1.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition PortalGuardianArmor = Torso.addOrReplaceChild("PortalGuardianArmor", CubeListBuilder.create(), PartPose.offset(-0.3352F, -12.111F, -0.2929F));

		PartDefinition Head = PortalGuardianArmor.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(16, 29).addBox(5.0F, -9.0F, -5.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 25).addBox(-1.0F, -15.0F, 4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(24, 27).mirror().addBox(-1.0F, -15.0F, -8.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 12).mirror().addBox(-4.0F, -9.0F, 4.0F, 9.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(31, 16).addBox(-3.0F, -10.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(25, 14).addBox(-4.0F, -9.0F, -5.0F, 9.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 33).mirror().addBox(6.0F, -12.0F, -1.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(18, 29).addBox(5.0F, -4.0F, -5.0F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 31).addBox(-4.0F, -9.0F, -4.0F, 1.0F, 9.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 9).addBox(-3.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(33, 33).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, -3.5F, -3.5F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 31).addBox(3.0F, 2.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(32, 22).addBox(3.0F, 2.0F, 7.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -4.0F, -6.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(30, 32).addBox(-1.0F, -2.0862F, -0.2005F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -7.9138F, -5.7995F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 28).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, -3.5F, 3.5F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(8, 8).addBox(-1.0F, -1.647F, -1.2275F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -8.353F, 5.2275F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Hip = PortalGuardian.addOrReplaceChild("Hip", CubeListBuilder.create().texOffs(6, 4).addBox(-2.0F, -1.5F, -4.0F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -3.5F, -1.0F));

		PartDefinition RightLeg = Hip.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(1.5F, 1.5F, 3.5F));

		PartDefinition RightUpperLeg_r1 = RightLeg.addOrReplaceChild("RightUpperLeg_r1", CubeListBuilder.create().texOffs(7, 27).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition RightLowerLeg = RightLeg.addOrReplaceChild("RightLowerLeg", CubeListBuilder.create().texOffs(3, 27).mirror().addBox(-1.5F, 0.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, 7.0F, 0.0F));

		PartDefinition LeftLeg = Hip.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(1.5F, 1.5F, -3.5F));

		PartDefinition LeftUpperLeg_r1 = LeftLeg.addOrReplaceChild("LeftUpperLeg_r1", CubeListBuilder.create().texOffs(19, 27).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition LeftLowerLeg = LeftLeg.addOrReplaceChild("LeftLowerLeg", CubeListBuilder.create().texOffs(22, 27).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 7.0F, 0.0F));

		PartDefinition Hitbox = Hip.addOrReplaceChild("Hitbox", CubeListBuilder.create().texOffs(0, 23).addBox(-2.0F, -30.0F, -11.0F, 11.0F, 46.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(
			T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch
	) {

	}

	@Override
	public void renderToBuffer(
			PoseStack poseStack,
			VertexConsumer vertexConsumer,
			int packedLight,
			int packedOverlay,
			float red,
			float green,
			float blue,
			float alpha
	) {
		PortalGuardian.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}