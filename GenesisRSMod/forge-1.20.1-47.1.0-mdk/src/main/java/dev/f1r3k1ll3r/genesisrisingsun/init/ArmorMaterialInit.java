package dev.f1r3k1ll3r.genesisrisingsun.init;

import dev.f1r3k1ll3r.genesisrisingsun.init.tiers.ModArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialInit {
    public static final ModArmorMaterial GOLEMITE = new ModArmorMaterial(
            new int[] {500, 1200, 800, 400},
            new int[] {11, 16,15,13},
            20,
            SoundEvents.IRON_GOLEM_STEP,
            () -> Ingredient.of(ItemInit.GOLEMITE_INGOT::get),
            "golemite",
            0.45f,
            0.25f
    );
}
