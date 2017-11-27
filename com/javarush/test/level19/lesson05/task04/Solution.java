package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(new FileReader(reader.readLine()));
            BufferedWriter out = new BufferedWriter(new FileWriter(reader.readLine()));
            reader.close();
            String str;

            while (in.ready()) {
                str = in.readLine();
                str = str.replace('.', '!');
                out.write(str);
                out.newLine();
            }

            in.close();
            out.close();

        }
        catch (Exception e) {}

    }
}
