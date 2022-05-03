package com.finito.flexlife.item.custom;

import com.finito.flexlife.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.core.config.builder.api.Component;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Objects;

public class a_pack_of_winston_xs extends Item {

    public int cigNum = 20;
    public int damageNum = 0;


    public a_pack_of_winston_xs(Properties pProperties) {
        super(pProperties);

    }



    @Override
    public InteractionResultHolder<ItemStack> use(Level Level, Player Player, InteractionHand UsedHand) {

        if(!Level.isClientSide())
        {
            if(cigNum < 0)
            {
                Player.sendMessage(new TranslatableComponent("item.flexlife.a_pack_of_winston_not_enough_cigarettes"),
                        Player.getUUID());


            }
            Smoke();
            InteractionHand flex;
            flex = Player.getUsedItemHand();
            ItemStack stack;
            stack = Player.getItemInHand(flex);
            setDamage(stack, damageNum);

            if(!HasCigarettes())
            {
                Player.setItemInHand(flex, ItemStack.EMPTY);
                cigNum = 20;
                damageNum = 0;
            }
        }




        return super.use(Level, Player, UsedHand);
    }


    private int Smoke()
    {
        cigNum = cigNum - 1;
        damageNum = damageNum + 1;


        return cigNum;
    }


    private boolean HasCigarettes()
    {
        if(cigNum == 0)
        {
            return false;
        }
        else {
            return true;
        }
    }


}
