package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int data, mindata;
        String filename = reader.readLine();

        FileInputStream readdata = new FileInputStream(filename);
        mindata = readdata.read();
        while (readdata.available() > 0)
        {
            if ((data = readdata.read()) < mindata) mindata = data;
        }
        System.out.println(mindata);

        reader.close();
        readdata.close();
    }
}
