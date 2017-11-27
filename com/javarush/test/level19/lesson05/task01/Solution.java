package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String fileName1 = read.readLine();
            String fileName2 = read.readLine();
            read.close();


        FileReader reader = new FileReader(fileName1);
        FileWriter writer = new FileWriter(fileName2);

        while (reader.ready())
        {
            reader.skip(1);
            int data = reader.read();
            writer.write(data);
        }

        reader.close();
        writer.close();

        }
        catch (IOException e) {}
    }
}
