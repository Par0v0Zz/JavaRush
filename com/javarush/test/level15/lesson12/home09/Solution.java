package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String URLlink = reader.readLine();

        String parameters = URLlink.substring(URLlink.indexOf("?")+1);

        String[] list = parameters.split("&");
        String value;

        for (String x: list)
        {
            if(x.contains("="))
            {
                System.out.print(x.substring(0, x.indexOf("=")) + " ");
            }
            else
                System.out.print(x + " ");
        }
        System.out.println();

        for(String x: list)
        {
            if (x.contains("obj=") && x.indexOf("=")==3) {
                value = x.substring(x.indexOf("=")+1);
                try
                {alert(Double.valueOf(value));}
                catch (NumberFormatException e)
                {alert(value);}
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
