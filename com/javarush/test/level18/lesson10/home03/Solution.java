package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream in1 = new FileInputStream(fileName2);
        FileInputStream in2 = new FileInputStream(fileName3);
        FileOutputStream out = new FileOutputStream(fileName1);

        byte[] buff1 = new byte[in1.available()];
        byte[] buff2 = new byte[in2.available()];

        int count1 = in1.read(buff1);
        int count2 = in2.read(buff2);

        out.write(buff1, 0, count1);
        out.write(buff2, 0, count2);

        reader.close();
        in1.close();
        in2.close();
        out.close();
    }
}
