package dev.f1r3k1ll3r.genesisrisingsun.init;

import dev.f1r3k1ll3r.genesisrisingsun.GenesisRisingSun;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = GenesisRisingSun.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB, GenesisRisingSun.MODID
    );

    public static final List<Supplier<? extends ItemLike>> GENESISRISINGSUN_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> GENESISRISINGSUN_TAB = TABS.register(
            "genesisrisingsun_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.GenesisRisingSun"))
                    .icon(ItemInit.GOLEMITE_INGOT.get()::getDefaultInstance)
                    .displayItems((displayParams, output) -> GENESISRISINGSUN_TAB_ITEMS.forEach(
                            itemLike -> output.accept(itemLike.get())
                    ))
                    .build()
            );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        GENESISRISINGSUN_TAB_ITEMS.add(itemLike);
        return itemLike;
    }

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ItemInit.EXAMPLE_BLOCK_ITEM);
        }
    }
}
