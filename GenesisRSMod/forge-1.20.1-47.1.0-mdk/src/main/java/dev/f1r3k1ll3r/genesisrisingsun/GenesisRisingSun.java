package dev.f1r3k1ll3r.genesisrisingsun;

import dev.f1r3k1ll3r.genesisrisingsun.init.BlockInit;
import dev.f1r3k1ll3r.genesisrisingsun.init.CreativeTabInit;
import dev.f1r3k1ll3r.genesisrisingsun.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GenesisRisingSun.MODID)
public class GenesisRisingSun {
    public static final String MODID = "genesisrisingsun";

    public GenesisRisingSun() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);

    }
}
