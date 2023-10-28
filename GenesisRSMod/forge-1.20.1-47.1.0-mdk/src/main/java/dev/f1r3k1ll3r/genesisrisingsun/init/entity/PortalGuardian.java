package dev.f1r3k1ll3r.genesisrisingsun.init.entity;

import dev.f1r3k1ll3r.genesisrisingsun.init.EntityInit;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomFlyingGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;

public class PortalGuardian extends Monster {

    public PortalGuardian(EntityType<PortalGuardian> type, Level level) {
        super(type, level);
    }

    public PortalGuardian(Level level, double x, double y, double z) {
        this(EntityInit.PORTAL_GUARDIAN.get(), level);
        setPos(x, y, z);
    }

    public PortalGuardian(Level level, BlockPos position) {
        this(level, position.getX(), position.getY(), position.getZ());
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(
                0, new FloatGoal(this)
        );
        this.goalSelector.addGoal(
                1, new NearestAttackableTargetGoal<>(this , Player.class,true)
        );
        this.goalSelector.addGoal(
                2, new WaterAvoidingRandomFlyingGoal(this , 1.0D)
        );
    }

    public static AttributeSupplier.Builder createPortalGuardianAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 500.0D)
                .add(Attributes.ARMOR, 20D)
                .add(Attributes.ATTACK_DAMAGE, 13D);
    }

    public static boolean canSpawn(
            EntityType<PortalGuardian> entityType,
            ServerLevelAccessor level,
            MobSpawnType spawnType,
            BlockPos position,
            RandomSource random
    ) {
        return Monster.checkMonsterSpawnRules(entityType, level, spawnType, position, random) &&
                level.getLevelData().isRaining() ;
    }
}
