package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int FirstNum = Integer.parseInt(reader.readLine());
        int SecondNum = Integer.parseInt(reader.readLine());

        while (SecondNum !=0) {
            int tmp = FirstNum%SecondNum;
            FirstNum = SecondNum;
            SecondNum = tmp;
        }
        System.out.println(FirstNum);
    }
}
