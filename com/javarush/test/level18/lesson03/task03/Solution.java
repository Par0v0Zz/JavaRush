package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        Map<Integer, Integer> repeats = new HashMap<>();
        int data, element, max=0;

        FileInputStream readdata = new FileInputStream(filename);
        while (readdata.available() > 0)
        {
            data = readdata.read();
            if(!(repeats.containsKey(data))) {
                repeats.put(data,1);
            }
            else {
                element = repeats.get(data);
                element++;
                repeats.put(data, element);
                if(element>max) max=element;
            }
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = repeats.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<Integer, Integer> pair = iterator.next();
            int key = pair.getKey();            //ключ
            int value = pair.getValue();        //значение
            if (value==max)
            {
                System.out.print(key + " ");
            }
        }

        reader.close();
        readdata.close();

        
    }
}
