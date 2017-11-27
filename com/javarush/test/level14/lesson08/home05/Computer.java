package com.javarush.test.level14.lesson08.home05;

/**
 * Created by maxborovskoy on 09.09.2016.
 */
public class Computer
{
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer()
    {
        this.monitor = new Monitor();
        this.mouse = new Mouse();
        this.keyboard = new Keyboard();
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }
}
