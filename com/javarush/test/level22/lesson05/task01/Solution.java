package com.javarush.test.level22.lesson05.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static String getPartOfString(String string) throws Exception {

        String[] words = string.split(" ");
        if (string.isEmpty() || words.length<5) throw new TooShortStringException();
        string = "";
        for(int i=1; i<5; i++) {
            string+=words[i] + " ";
        }
        string = string.trim();

        return string;
    }

    public static void main (String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        System.out.println(getPartOfString(str));
    }



    public static class TooShortStringException extends RuntimeException{
    }
}
