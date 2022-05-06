package com.finito.flexlife.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier AURUS_STAGEONE = new ForgeTier(2,723, 3.0f,
                    0f,22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.AURUS_INGOT.get()));

    public static final ForgeTier AURUS_STAGETWO = new ForgeTier(2, 1378, 4.5f,
            2f, 23, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.EMPOWERED_AURUS_INGOT.get()));

    public static final ForgeTier AURUS_LASTSTAGE = new ForgeTier(3, 2048, 6.0f,
            2.5f, 25, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.FURIOUS_AURUS_INGOT.get()));
}
