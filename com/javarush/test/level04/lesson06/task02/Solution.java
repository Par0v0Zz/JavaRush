package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int max1, max2, max;

        max1 = m > n ? m : n;
        max2 = a > b ? a : b;
        max = max1 > max2 ? max1 : max2;

        System.out.println(max);
    }
}
