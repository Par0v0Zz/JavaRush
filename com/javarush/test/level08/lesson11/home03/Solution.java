package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Петр");
        map.put("Петров", "Иван");
        map.put("Сидоров", "Павел");
        map.put("Павлов", "Сидор");
        map.put("Аврамов", "Вася");
        map.put("Васин", "Пупок");
        map.put("Васин", "Женя");
        map.put("Коркин", "Пупок");
        map.put("Аврамов", "Аврам");
        map.put("Ким", "Чен");

        return map;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
