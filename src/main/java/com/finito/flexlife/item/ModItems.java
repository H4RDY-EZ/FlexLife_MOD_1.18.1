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
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(20)));

    public static final RegistryObject<Item> SOBRANIE_PACK = ITEMS.register("a_pack_of_sobranie",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
