package dev.f1r3k1ll3r.genesisrisingsun.init;

import dev.f1r3k1ll3r.genesisrisingsun.GenesisRisingSun;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
            ForgeRegistries.BLOCKS, GenesisRisingSun.MODID
    );

    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.ANVIL)
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(5.0f, 17f)
                    .instrument(NoteBlockInstrument.HARP)
                    .lightLevel(state -> 10)
                    .requiresCorrectToolForDrops()
            ));
}
