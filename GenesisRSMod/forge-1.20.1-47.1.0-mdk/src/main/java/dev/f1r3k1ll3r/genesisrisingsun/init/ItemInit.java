package dev.f1r3k1ll3r.genesisrisingsun.init;

import dev.f1r3k1ll3r.genesisrisingsun.GenesisRisingSun;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static dev.f1r3k1ll3r.genesisrisingsun.init.CreativeTabInit.addToTab;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, GenesisRisingSun.MODID
    );

    // Items

    public static final RegistryObject<Item> BURGER = ITEMS.register("burger",
            () -> new Item(
                    new Item.Properties().food( new FoodProperties.Builder()
                                    .nutrition(14)
                                    .saturationMod(1f)
                                    .build()
                            ))
    );

    public static final RegistryObject<Item> GOLEMITE_INGOT = addToTab(ITEMS.register(
            "golemite_ingot",
            () -> new Item(
                    new Item.Properties()
            )));
    public static final RegistryObject<Item> GOLEMITE_NUGGET = addToTab(ITEMS.register(
            "golemite_nugget",
            () -> new Item(
                    new Item.Properties()
            )));
    public static final RegistryObject<Item> PORK_BEEF = addToTab(ITEMS.register(
            "pork_beef",
            () -> new Item(
                    new Item.Properties().food( new FoodProperties.Builder()
                            .nutrition(10)
                            .saturationMod(0.2f)
                            .build()
                    )
            )));
    public static final RegistryObject<Item> TOMATO = addToTab(ITEMS.register(
            "tomato",
            () -> new Item(
                    new Item.Properties().food( new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationMod(0.1f)
                            .build()
                    )
            )));
    public static final RegistryObject<Item> WITHER_SHARD = addToTab(ITEMS.register(
            "wither_shard",
            () -> new Item(
                    new Item.Properties()
            )));

    // BlockItem

    public static final RegistryObject<BlockItem> EXAMPLE_BLOCK_ITEM = addToTab(ITEMS.register(
            "example_block",
            () -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(),
                    new Item.Properties()
            )));

    public static final RegistryObject<SwordItem> 
}
