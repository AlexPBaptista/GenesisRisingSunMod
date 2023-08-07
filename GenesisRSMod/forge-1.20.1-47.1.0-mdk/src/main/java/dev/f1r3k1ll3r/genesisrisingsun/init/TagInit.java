package dev.f1r3k1ll3r.genesisrisingsun.init;

import dev.f1r3k1ll3r.genesisrisingsun.GenesisRisingSun;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagInit {
    public static final TagKey<Block> NEEDS_GOLD_TOOL = tag("needs_gold_tool");
    public static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(GenesisRisingSun.MODID, name));
    }
}
