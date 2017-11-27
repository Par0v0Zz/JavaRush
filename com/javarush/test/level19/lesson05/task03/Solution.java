package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            reader.close();

            BufferedReader in = new BufferedReader(new FileReader(fileName1));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));
            String s;
            String[] str;

            while((s = in.readLine())!= null) {
                System.out.println(s);
                str = s.split(" ");
                for (String x: str)
                {
                    try {
                        int a = Integer.parseInt(x);
                        writer.write(a+" ");
                    }
                    catch (Exception e) {}

                }
            }
            in.close();
            writer.close();


        }
        catch (Exception e) {}
    }

}
