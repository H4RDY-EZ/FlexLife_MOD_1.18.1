package com.finito.flexlife.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.finito.flexlife.FlexLife.MOD_ID;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }

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
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.FLEX_TAB_FOODS).food(ModFoods.JAGUAR)));

    public static final RegistryObject<Item> GOVODKA = ITEMS.register("govodka",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.FLEX_TAB_FOODS).food(ModFoods.GOVODKA)));

    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    public static final RegistryObject<Item> PITA = ITEMS.register("pita",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    public static final RegistryObject<Item> CAPSULED_LD = ITEMS.register("capsuled_ld",
            () -> new Item(new Item.Properties().stacksTo(20).tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    public static final RegistryObject<Item> CAPSULED_SOBRANIE = ITEMS.register("capsuled_sobranie",
            () -> new Item(new Item.Properties().stacksTo(20).tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    public static final RegistryObject<Item> CAPSULED_WINSTON = ITEMS.register("capsuled_winston",
            () -> new Item(new Item.Properties().stacksTo(20).tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    public static final RegistryObject<Item> SOBRANIE_PACK_CAPSULED = ITEMS.register("capsuled_sobranie_pack",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    public static final RegistryObject<Item> KETCHUP = ITEMS.register("ketchup",
            () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    // New Items
    // New Items
    // New Items

    public static final RegistryObject<Item> PACK = ITEMS.register("pack",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    public static final RegistryObject<Item> LD_PACK = ITEMS.register("ld_pack",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    public static final RegistryObject<Item> WINSTON_PACK = ITEMS.register("winston_pack",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));

    public static final RegistryObject<Item> A_PART_OF_PACK = ITEMS.register("part_of_pack",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FLEX_TAB_ITEMS)));



}