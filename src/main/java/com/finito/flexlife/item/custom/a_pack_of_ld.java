package com.finito.flexlife.item.custom;

import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class a_pack_of_ld extends Item {

    public int cigNum = 20;
    public int damageNum = 0;
    public a_pack_of_ld(Properties Properties) {

        super(Properties);
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
