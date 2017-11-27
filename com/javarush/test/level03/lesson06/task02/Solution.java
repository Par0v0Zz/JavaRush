package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        int[] numbers =
                {1,2,3,4,5,6,7,8,9,10};
        for(int i=1; i<11; i++)
        {
            for (int item : numbers)
            {
                System.out.print(item * i + " ");
            }
            System.out.println();
        }
    }
}