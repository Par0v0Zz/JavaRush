package com.javarush.test.level14.lesson06.home01;

/**
 * Created by maxborovskoy on 06.09.2016.
 */
public class RussianHen extends Hen  implements Country
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 70;
    }

    @Override
    String getDescription()
    {
        return (super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
