package com.javarush.test.level04.lesson10.task05;

import java.io.*;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        int count = 10;
        int m=1;

        while (count!=0)
        {
            int num = 1;
            int count2 =10;
            while (count2 != 0)
            {
                System.out.print(num*m + " ");
                num++;
                count2--;
            }
            m++;
            System.out.println("");
            count--;
        }

    }
}
