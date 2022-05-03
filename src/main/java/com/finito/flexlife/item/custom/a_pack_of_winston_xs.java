package com.finito.flexlife.item.custom;

import com.finito.flexlife.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.apache.logging.log4j.core.config.builder.api.Component;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Objects;

public class a_pack_of_winston_xs extends Item {

    public int cigNum = 20;


    public a_pack_of_winston_xs(Properties pProperties) {
        super(pProperties);

    }


    @Override
    public InteractionResult useOn(UseOnContext pContext) {

        if (!pContext.getLevel().isClientSide) {
            if (cigNum < 0) {
                Objects.requireNonNull(pContext.getPlayer()).sendMessage(new TranslatableComponent("item.flexlife.a_pack_of_winston_not_enough_cigarettes"),
                        pContext.getPlayer().getUUID());
            }

            Smoke();

            if(cigNum <= 20)
            {
                int damage = 0;
                damage = damage + 1;
                pContext.getItemInHand().setDamageValue(20);
            }


        }



        return super.useOn(pContext);
    }


    private int Smoke()
    {
        cigNum = cigNum - 1;
        return cigNum;
    }



    private boolean HasCigarettes()
    {
        if(cigNum < 0)
        {
            return false;
        }
        else {
            return true;
        }
    }

}
