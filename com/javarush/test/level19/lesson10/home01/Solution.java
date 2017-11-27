package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import com.javarush.test.level15.lesson12.home03.Tree;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        try
        {
            //BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            InputStreamReader insReader = new InputStreamReader(new FileInputStream(args[0]), "Cp1251");
            BufferedReader reader = new BufferedReader(insReader);
            TreeMap<String, Double> map = new TreeMap<>();
            String s;
            double x;
            while ((s = reader.readLine()) != null) {
                String[] elements = s.split(" ");
                if(map.containsKey(elements[0])) {
                    x = map.get(elements[0]);
                    x += Double.parseDouble(elements[1]);
                    map.put(elements[0],x);
                }
                else {
                    map.put(elements[0],Double.parseDouble(elements[1]));
                }
            }

            for (String key: map.keySet())
            {
                System.out.println(key + " " + map.get(key));
            }

            reader.close();


        } catch (Exception e) {}
    }
}
