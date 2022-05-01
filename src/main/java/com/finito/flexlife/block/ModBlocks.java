package com.finito.flexlife.block;

import com.finito.flexlife.FlexLife;
import com.finito.flexlife.block.custom.TobaccoLeaves;
import com.finito.flexlife.item.ModCreativeModeTab;
import com.finito.flexlife.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FlexLife.MOD_ID);


    public static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                          CreativeModeTab tab)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block)
    {
        return BLOCKS.register(name, block);
    }

    // ITEMS BELOW
    // ITEMS BELOW
    // ITEMS BELOW

    public static final RegistryObject<Block> SOBRANIE_BLOCK = registerBlock("sobranie_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.FLEX_TAB_BLOCKS);

    public static final RegistryObject<Block> WINSTON_BLOCK = registerBlock("winston_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.FLEX_TAB_BLOCKS);

    public static final RegistryObject<Block> LD_BLOCK = registerBlock("ld_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.FLEX_TAB_BLOCKS);

    public static final RegistryObject<Block> TOBACCO_PLANT = registerBlockWithoutBlockItem("tobacco_plant",
            () -> new TobaccoLeaves(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> TEA_PLANT = registerBlockWithoutBlockItem("tea_plant",
            () -> new TobaccoLeaves(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));


    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }

}
