package com.javarush.test.level14.lesson08.home09;

/**
 * Created by maxborovskoy on 09.09.2016.
 */
public class Hrivna extends Money
{
    @Override
    public String getCurrencyName()
    {
        return "HRN";
    }

    public Hrivna(double amount)
    {
        super(amount);
    }
}
