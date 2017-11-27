package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();

            String[] words = read(fileName).split("\\W");
            int count=0;
            for(String x : words) {
                if(x.equals("world")) count++;
            }
            System.out.println(count);



        }
        catch (Exception e) {}
    }

    public static String read(String filename) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while((s = in.readLine())!= null)
            sb.append(s + ",");
        in.close();
        return sb.toString();
    }
}
