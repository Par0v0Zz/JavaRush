package com.javarush.test.level03.lesson05.task03;

/* Конвертер времени
Добавьте метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
*/

public class Solution
{

    public static int convertToSeconds(int hour)
    {
        hour=hour*3600;
        return hour;
    }

    public static void main(String[] args)
    {
        convertToSeconds(5);
        System.out.println(convertToSeconds(5));
        convertToSeconds(87);
        System.out.println(convertToSeconds(87));

    }
}