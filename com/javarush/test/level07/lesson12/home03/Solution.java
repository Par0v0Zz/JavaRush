package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        maximum = array[0];
        minimum = array[19];

        System.out.print(maximum + " ");
        System.out.println(minimum);

        //System.out.print(maximum + " " + minimum);
    }

    public static void sort(int[] array)
    {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
    }



}
