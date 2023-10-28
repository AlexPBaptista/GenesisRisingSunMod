package dev.f1r3k1ll3r.genesisrisingsun.events;

import dev.f1r3k1ll3r.genesisrisingsun.GenesisRisingSun;
import dev.f1r3k1ll3r.genesisrisingsun.client.model.PortalGuardianModel;
import dev.f1r3k1ll3r.genesisrisingsun.client.renderer.PortalGuardianRenderer;
import dev.f1r3k1ll3r.genesisrisingsun.init.EntityInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GenesisRisingSun.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.PORTAL_GUARDIAN.get(), PortalGuardianRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(PortalGuardianModel.LAYER_LOCATION, PortalGuardianModel::createBodyLayer);
    }
}
