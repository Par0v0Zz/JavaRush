package com.javarush.test.level14.lesson06.home01;

/**
 * Created by maxborovskoy on 06.09.2016.
 */
public class BelarusianHen extends Hen implements Country
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 20;
    }

    @Override
    String getDescription()
    {
        return (super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
