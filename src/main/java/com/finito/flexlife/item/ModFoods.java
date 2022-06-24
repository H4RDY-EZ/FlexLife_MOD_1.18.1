package com.finito.flexlife.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;

public class ModFoods {

    public static final FoodProperties REDBIZON = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).alwaysEat().effect(new MobEffectInstance(MobEffects.BLINDNESS,600, 0), 1f).build();
    public static final FoodProperties BLUEBIZON = (new FoodProperties.Builder()).alwaysEat().nutrition(2).saturationMod(0.2f).effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 1f).build();
    public static final FoodProperties TWOAZNDONER = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6f).build();
    public static final FoodProperties THREEAZNDONER = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.8f).build();
    public static final FoodProperties FOURAZNDONER = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8f).build();
    public static final FoodProperties SHAURMANUM1 = (new FoodProperties.Builder()).nutrition(12).saturationMod(1f).build();
    public static final FoodProperties AVTOSHDONER = (new FoodProperties.Builder()).nutrition(16).saturationMod(1.2f).build();
    public static final FoodProperties KOVSERDONER = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.5f).build();
    public static final FoodProperties BASDIRMA = (new FoodProperties.Builder()).nutrition(10).saturationMod(1f).build();
    public static final FoodProperties GOVODKA = (new FoodProperties.Builder()).nutrition(1).saturationMod(0f).effect(new MobEffectInstance(MobEffects.CONFUSION,300, 0),1f).build();
    public static final FoodProperties JAGUAR = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1f).effect(new MobEffectInstance(MobEffects.CONFUSION,160, 0),1f).build();

    public static final FoodProperties TURK_BREAD = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.4f).build();

    public static final FoodProperties TOMATO = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.1f).build();

    public static final FoodProperties CUCUMBER = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.1f).build();

    public static final FoodProperties SALAD = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1f).build();


    public static final FoodProperties CRUSHED_CHICKED = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1f).build();

    public static final FoodProperties CRUSHED_BEEF = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1f).build();

    public static final FoodProperties CRUSHED_PORK = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1f).build();

    // New Food
    // New Food
    // New Food LD





}
