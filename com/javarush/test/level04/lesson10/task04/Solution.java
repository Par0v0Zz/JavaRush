package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int count=10;


        while (count!=0) {
            int count2=10;
            while(count2!=0) {
                System.out.print("S");
                count2--;
            }
            System.out.println("");
            count--;
        }

    }
}
