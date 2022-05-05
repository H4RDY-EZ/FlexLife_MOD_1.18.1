package com.finito.flexlife.util;

import com.finito.flexlife.FlexLife;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {

    public static class Blocks{
        public static final Tags.IOptionalNamedTag<Block> X = null;

        private static Tags.IOptionalNamedTag<Block> tag(String name)
        {
            return BlockTags.createOptional(new ResourceLocation(FlexLife.MOD_ID, name));
        }


        private static Tags.IOptionalNamedTag<Block> forgeTag(String name)
        {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
    }

    public static class Items {

        private static Tags.IOptionalNamedTag<Item> tag(String name)
        {
            return ItemTags.createOptional(new ResourceLocation(FlexLife.MOD_ID, name));
        }


        private static Tags.IOptionalNamedTag<Item> forgeTag(String name)
        {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }



    }
}
