package com.javarush.test.level07.lesson04.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        int[] array = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static int max(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        return arr[19];
    }
}
