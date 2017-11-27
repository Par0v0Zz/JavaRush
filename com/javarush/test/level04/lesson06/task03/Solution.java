package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];

        for (int i = 0; i<3;i++) {
            arr[i] = Integer. parseInt(reader.readLine());
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        for (int i = 0; i<3;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
