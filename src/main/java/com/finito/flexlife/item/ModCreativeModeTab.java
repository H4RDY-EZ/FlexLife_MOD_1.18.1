package com.finito.flexlife.item;

import com.finito.flexlife.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FLEX_TAB_ITEMS = new CreativeModeTab("flextabitems")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.SOBRANIE.get());
        }

    };

    public static final CreativeModeTab FLEX_TAB_BLOCKS = new CreativeModeTab("flextabblocks")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModBlocks.SOBRANIE_BLOCK.get());
        }

    };
}
