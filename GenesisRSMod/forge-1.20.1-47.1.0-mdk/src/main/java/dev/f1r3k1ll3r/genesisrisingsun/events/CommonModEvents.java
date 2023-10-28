package dev.f1r3k1ll3r.genesisrisingsun.events;

import dev.f1r3k1ll3r.genesisrisingsun.GenesisRisingSun;
import dev.f1r3k1ll3r.genesisrisingsun.init.EntityInit;
import dev.f1r3k1ll3r.genesisrisingsun.init.entity.PortalGuardian;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GenesisRisingSun.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)

public class CommonModEvents {
    @SubscribeEvent
    public static void entityAttributs(EntityAttributeCreationEvent event) {
        event.put(EntityInit.PORTAL_GUARDIAN.get(), PortalGuardian.createMonsterAttributes().build());
    }
    @SubscribeEvent
    public static void registerSpawnPlacements(SpawnPlacementRegisterEvent event) {
        event.register(
                EntityInit.PORTAL_GUARDIAN.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                PortalGuardian::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );
    }
}
