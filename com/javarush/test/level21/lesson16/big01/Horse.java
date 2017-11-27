package com.javarush.test.level21.lesson16.big01;

/**
 * Created by maxborovskoy on 22.12.2016.
 */
public class Horse
{
    private String name;
    private double speed, distance;

    public Horse(String name, double speed, double distance)
    {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName()
    {
        return name;
    }

    public double getSpeed()
    {
        return speed;
    }

    public double getDistance()
    {
        return distance;
    }

    public void setDistance(double distance)
    {
        this.distance = distance;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void move() {
        setDistance(getDistance() + getSpeed()*Math.random());
    }

    public void print() {
        int dots = (int) Math.round(getDistance());
        for(int i=dots; i > 0; i--) {
            System.out.print(".");
        }
        System.out.println(getName());
    }
}
