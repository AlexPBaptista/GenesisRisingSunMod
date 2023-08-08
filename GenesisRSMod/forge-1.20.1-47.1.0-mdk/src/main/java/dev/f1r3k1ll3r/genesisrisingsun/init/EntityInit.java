package dev.f1r3k1ll3r.genesisrisingsun.init;

import dev.f1r3k1ll3r.genesisrisingsun.GenesisRisingSun;
import dev.f1r3k1ll3r.genesisrisingsun.init.entity.PortalGuardian;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(
            ForgeRegistries.ENTITY_TYPES, GenesisRisingSun.MODID
    );
    public static final RegistryObject<EntityType<PortalGuardian>> PORTAL_GUARDIAN = ENTITIES.register(
            "example_entity",
            () -> EntityType.Builder.<PortalGuardian>of(PortalGuardian::new, MobCategory.MONSTER)
                    .fireImmune()
                    .sized(0.7f, 2.4f)
                    .immuneTo(Blocks.WITHER_ROSE)
                    .clientTrackingRange(8)
                    .build(new ResourceLocation(GenesisRisingSun.MODID, "portal_guardian").toString())
    );
}
