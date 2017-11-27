package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by maxborovskoy on 14.09.2016.
 */
public class Plane implements Flyable
{
    int passengers;

    @Override
    public void fly()
    {
    }

    public Plane(int passengers)
    {
        this.passengers = passengers;
    }
}
