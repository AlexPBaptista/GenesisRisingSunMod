package dev.f1r3k1ll3r.genesisrisingsun.client.renderer;

import dev.f1r3k1ll3r.genesisrisingsun.GenesisRisingSun;
import dev.f1r3k1ll3r.genesisrisingsun.client.model.PortalGuardianModel;
import dev.f1r3k1ll3r.genesisrisingsun.init.entity.PortalGuardian;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class PortalGuardianRenderer extends MobRenderer<PortalGuardian, PortalGuardianModel<PortalGuardian>> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(GenesisRisingSun.MODID,
            "textures/entity/portal_guardian.png"
    );

    public PortalGuardianRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new PortalGuardianModel<>(ctx.bakeLayer(PortalGuardianModel.LAYER_LOCATION)), 2.4f);
    }

    @Override
    public ResourceLocation getTextureLocation(PortalGuardian entity) {
        return TEXTURE;
    }
}
