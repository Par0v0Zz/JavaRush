package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String FileName = read.readLine();
        ArrayList<Integer> NumList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(FileName));
        String num;
        while ((num = reader.readLine()) != null)
        {
            int data = Integer.parseInt(num);
            if(data%2 == 0)
            {
                NumList.add(data);
            }
        }

        Collections.sort(NumList);

        for(int SortedNums : NumList) {
            System.out.println(SortedNums);
        }
    }
}
