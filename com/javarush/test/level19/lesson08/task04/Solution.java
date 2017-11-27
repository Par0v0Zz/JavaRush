package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleOut = System.out;

        ByteArrayOutputStream newOut = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(newOut);
        System.setOut(stream);

        testString.printSomething();

        String string = newOut.toString();
        String result = "";
        int sum=0;
        String[] array = string.split(" ");
        if (array[1].equals("+")) sum = Integer.parseInt(array[0]) + Integer.parseInt(array[2]);
        if (array[1].equals("-")) sum = Integer.parseInt(array[0]) - Integer.parseInt(array[2]);
        if (array[1].equals("*")) sum = Integer.parseInt(array[0]) * Integer.parseInt(array[2]);

        for(int i=0; i<array.length-1; i++) {
            result += array[i] + " ";
        }
        result += sum;

        System.setOut(consoleOut);
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

