package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by maxborovskoy on 22.12.2016.
 */
public class Hippodrome
{
    private static ArrayList<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    public static void main(String[] args) {
        game = new Hippodrome();
        Horse horse1 = new Horse ("Ветер", 3, 0);
        Horse horse2 = new Horse ("Скоростной", 3, 0);
        Horse horse3 = new Horse ("Пегас", 3, 0);
        Hippodrome.horses.add(horse1);
        Hippodrome.horses.add(horse2);
        Hippodrome.horses.add(horse3);

        game.run();

        game.printWinner();

    }

    public void run() {
        try
        {
            for (int i = 0; i < 100; i++)
            {
                move();
                print();
                Thread.sleep(200);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void move() {
        for (Horse x: getHorses())
        {
            x.move();
        }
    }

    public void print() {
        for (Horse x: getHorses())
        {
            x.print();
        }
        System.out.println();
        System.out.println();
    }

    public Horse getWinner() {
        Horse winner = horses.get(0);
        double winDistance = horses.get(0).getDistance();
        for (Horse x: horses)
        {
            if (x.getDistance() > winDistance) {
                winDistance = x.getDistance();
                winner = x;
            }
        }

        return winner;
    }

    public void printWinner () {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

}
