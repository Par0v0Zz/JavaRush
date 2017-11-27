package com.javarush.test.level14.lesson08.home09;

/**
 * Created by maxborovskoy on 09.09.2016.
 */
public class USD extends Money
{
    @Override
    public String getCurrencyName()
    {
        return "USD";
    }

    public USD(double amount)
    {
        super(amount);
    }
}
