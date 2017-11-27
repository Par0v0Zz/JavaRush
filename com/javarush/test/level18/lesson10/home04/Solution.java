package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1, fileName2;

        fileName1 = reader.readLine();
        fileName2 = reader.readLine();
        reader.close();

        RandomAccessFile out = new RandomAccessFile(fileName1, "rw");
        FileInputStream in = new FileInputStream(fileName2);

        byte[] buffer2 = new byte[in.available()];

        in.read(buffer2);

        out.seek(0);
        out.write(buffer2);
        in.close();
        out.close();

    }
}
