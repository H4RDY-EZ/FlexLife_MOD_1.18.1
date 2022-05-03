package com.finito.flexlife.block.custom;

import com.finito.flexlife.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class TeaLeaves extends CropBlock {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;

    public TeaLeaves(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge()
    {
        return 3;
    }

    @Override
    protected ItemLike getBaseSeedId()
    {
        return ModItems.TEA_SEEDS.get();
    }

}
