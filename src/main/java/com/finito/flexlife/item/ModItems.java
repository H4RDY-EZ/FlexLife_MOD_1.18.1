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


    public static final RegistryObject<Item> KULQABI = ITEMS.register("kulqabi",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    // NEW ITEMS
    // NEW ITEMS
    // NEW ITEMS


    public static final RegistryObject<Item> BAKI = ITEMS.register("baki",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    public static final RegistryObject<Item> REDBIZON = ITEMS.register("redbizon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_FOODS).food(ModFoods.REDBIZON)));

    public static final RegistryObject<Item> BLUEBIZON = ITEMS.register("bluebizon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_FOODS).food(ModFoods.BLUEBIZON)));

    public static final RegistryObject<Item> TWOAZNDONER = ITEMS.register("twoazndoner",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_FOODS).food(ModFoods.TWOAZNDONER)));

    public static final RegistryObject<Item> THREEAZNDONER = ITEMS.register("threeazndoner",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_FOODS).food(ModFoods.THREEAZNDONER)));

    public static final RegistryObject<Item> FOURAZNDONER = ITEMS.register("fourazndoner",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_FOODS).food(ModFoods.FOURAZNDONER)));

    public static final RegistryObject<Item> SHAURMANUM1 = ITEMS.register("shaurmanum1",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_FOODS).food(ModFoods.SHAURMANUM1)));

    public static final RegistryObject<Item> AVTOSHDONER = ITEMS.register("avtoshdoner",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_FOODS).food(ModFoods.AVTOSHDONER)));

    public static final RegistryObject<Item> KOVSERDONER = ITEMS.register("kovserdoner",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_FOODS).food(ModFoods.KOVSERDONER)));

    public static final RegistryObject<Item> BASDIRMA = ITEMS.register("basdirma",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_FOODS).food(ModFoods.BASDIRMA)));

    public static final RegistryObject<Item> JAGUAR = ITEMS.register("jaguar",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_FOODS).food(ModFoods.JAGUAR)));

    public static final RegistryObject<Item> GOVODKA = ITEMS.register("govodka",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_FOODS).food(ModFoods.GOVODKA)));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
