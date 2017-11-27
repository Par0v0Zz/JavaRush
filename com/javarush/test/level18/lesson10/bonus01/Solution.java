package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Solution {
    public static void main(String[] args) {

        if(args[0].equals("-e")){
            Encrypt(args);
        }

        if(args[0].equals("-d")){
            Decrypt(args);
        }

    }

    public static void Encrypt(String[] args) {
        try
        {
            String fileName = args[1];
            String fileOutputName = args[2];
            int data;

            FileInputStream reader = new FileInputStream(fileName);
            FileOutputStream writer = new FileOutputStream(fileOutputName);

            while (reader.available()>0) {
                data = reader.read();
                data+=3;
                writer.write(data);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Decrypt(String[] args) {
        try
        {
            String fileName = args[1];
            String fileOutputName = args[2];
            int data;

            FileInputStream reader = new FileInputStream(fileName);
            FileOutputStream writer = new FileOutputStream(fileOutputName);

            while (reader.available()>0) {
                data = reader.read();
                data-=3;
                writer.write(data);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
