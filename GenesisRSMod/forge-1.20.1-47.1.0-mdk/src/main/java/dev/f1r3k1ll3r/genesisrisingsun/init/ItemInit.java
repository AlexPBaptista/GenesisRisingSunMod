package dev.f1r3k1ll3r.genesisrisingsun.init;

import dev.f1r3k1ll3r.genesisrisingsun.GenesisRisingSun;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/*
    Onde tem estas duas /, ou uma / e * são comentários para me organizar e conseguir te explicar o código tb
    Ent, eu vou comentar o código que estiver abaixo, ou seja, vai ter o comentário e depois o código em si
 */

// Aqui crio uma classe para inicializar (Init) os Items do mod
public class ItemInit {
    // Aqui basicamente é o identificador do mod
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, GenesisRisingSun.MODID
    );

    // Items

    /*
    Aqui crio o item Burger, ou dizendo em linguagem /give @p genesisrisingsun:burger
    Identifico que é uma comida (Item.Properties().food) e depois dou as propriedades da comida
    Dou-lhe um valor de nutrição (barra de fome visivel) é de [0-20], saturação (barra que dá pra ver com o AppleSkin)
     */
    public static final RegistryObject<Item> BURGER = ITEMS.register("burger",
            () -> new Item(
                    new Item.Properties().food( new FoodProperties.Builder()
                                    .nutrition(14)
                                    .saturationMod(1f)
                                    .build()
                            ))
    );

    /*
    Aqui crio o item Golemite Ingot, ou dizendo em linguagem /give @p genesisrisingsun:golemite_ingot
    Aqui ele n tem propriedade nenhuma
     */
    public static final RegistryObject<Item> GOLEMITE_INGOT = ITEMS.register("golemite_ingot",
            () -> new Item(
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> GOLEMITE_NUGGET = ITEMS.register("golemite_nugget",
            () -> new Item(
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> PORK_BEEF = ITEMS.register("pork_beef",
            () -> new Item(
                    new Item.Properties().food( new FoodProperties.Builder()
                            .nutrition(10)
                            .saturationMod(0.2f)
                            .build()
                    )
            ));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(
                    new Item.Properties().food( new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationMod(0.1f)
                            .build()
                    )
            ));
    public static final RegistryObject<Item> WITHER_SHARD = ITEMS.register("wither_shard",
            () -> new Item(
                    new Item.Properties()
                            .rarity(Rarity.EPIC)
            ));

    // BlockItem

    public static final RegistryObject<BlockItem> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block",
            () -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(),
                    new Item.Properties()
                            .rarity(Rarity.UNCOMMON)
            ));
}
