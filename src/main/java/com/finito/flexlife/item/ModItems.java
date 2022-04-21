package com.finito.flexlife.item;

import com.finito.flexlife.FlexLife;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FlexLife.MOD_ID);

    public static final RegistryObject<Item> SOBRANIE = ITEMS.register("sobranie",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_ITEMS).stacksTo(20)));

    public static final RegistryObject<Item> SOBRANIE_PACK = ITEMS.register("a_pack_of_sobranie",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));
    // NEW ITEMS
    // NEW ITEMS
    // NEW ITEMS
    // NEW ITEMS
    // NEW ITEMS

    public static final RegistryObject<Item> TOBACCO = ITEMS.register("tobacco",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    public static final RegistryObject<Item> LIGHTER = ITEMS.register("lighter",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    public static final RegistryObject<Item> PAPYRUS = ITEMS.register("papyrus",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    public static final RegistryObject<Item> WINSTON = ITEMS.register("winston",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    public static final RegistryObject<Item> CAPSULE = ITEMS.register("capsule",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    public static final RegistryObject<Item> LD = ITEMS.register("ld",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    public static final RegistryObject<Item> MARLBORO = ITEMS.register("marlboro",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    public static final RegistryObject<Item> PRIMA = ITEMS.register("prima",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    public static final RegistryObject<Item> GAS_SPRAY = ITEMS.register("gas_spray",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
