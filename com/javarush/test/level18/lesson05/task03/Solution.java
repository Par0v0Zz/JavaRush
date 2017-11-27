package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            String fileName3 = reader.readLine();
            int length;
            reader.close();

            FileInputStream inputStream = new FileInputStream(fileName1);
            FileOutputStream outputStream2 = new FileOutputStream(fileName2);
            FileOutputStream outputStream3 = new FileOutputStream(fileName3);

            byte[] buffer2 = new byte[inputStream.available()/2 + inputStream.available()%2];
            byte[] buffer3 = new byte[inputStream.available()/2];

            outputStream2.write(buffer2, 0, inputStream.read(buffer2));
            outputStream3.write(buffer3, 0, inputStream.read(buffer3));

            inputStream.close();
            outputStream2.close();
            outputStream3.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
