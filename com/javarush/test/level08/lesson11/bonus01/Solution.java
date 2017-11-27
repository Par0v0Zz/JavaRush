package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> Year = new ArrayList<>();
        Year.add("January");
        Year.add("February");
        Year.add("March");
        Year.add("April");
        Year.add("May");
        Year.add("June");
        Year.add("July");
        Year.add("August");
        Year.add("September");
        Year.add("October");
        Year.add("November");
        Year.add("December");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        for (int i=0; i<Year.size(); i++) {
            if(Year.get(i).equals(month)) System.out.println(month + " is " + (i+1) + " month");
        }
    }

}
