package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by maxborovskoy on 13.09.2016.
 */
public abstract class DrinkMaker
{
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();

    protected void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}
