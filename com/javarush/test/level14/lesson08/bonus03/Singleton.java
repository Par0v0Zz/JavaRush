package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by maxborovskoy on 12.09.2016.
 */
public class Singleton
{
    private static Singleton instance;

    private Singleton () {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
