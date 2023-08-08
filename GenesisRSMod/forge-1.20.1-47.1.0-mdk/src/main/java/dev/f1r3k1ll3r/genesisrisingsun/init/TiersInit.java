package dev.f1r3k1ll3r.genesisrisingsun.init;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TiersInit {
    public static final ForgeTier SIMPLE = new ForgeTier(
            4,
            2000,
            1.5f,
            4,
            20,
            TagInit.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ItemInit.GOLEMITE_INGOT::get)
    );
}
