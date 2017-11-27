package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            ArrayList<Character> alphabet = new ArrayList<>();
            char ch;
            long count=0;

            for (int i=0; i<26; i++) {
                alphabet.add((char) ('a' + i));
            }

            while (reader.ready()) {
                if (alphabet.contains((char)reader.read())) count++;
            }

            System.out.println(count);
            reader.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
