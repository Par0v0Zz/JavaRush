package com.javarush.test.level14.lesson06.home01;

/**
 * Created by maxborovskoy on 06.09.2016.
 */
public class MoldovanHen extends Hen implements Country
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 30;
    }

    @Override
    String getDescription()
    {
        return (super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
