package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        int counter=0;

        arr[0]=Integer. parseInt(reader.readLine());

        for (int i = 1; i<3;i++) {
            arr[i] = Integer. parseInt(reader.readLine());
            if (arr[i] != arr[0]) counter++;
        }
        if(counter == 2) System.out.println("1");
        else
            if(counter == 1 && arr[0] == arr[1]) System.out.println("3");
            else System.out.println("2");

    }
}
