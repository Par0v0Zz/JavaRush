package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        if ("-u".equals(args[0]))
        {
            try
            {
                BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
                String fileName = read.readLine();
                read.close();

                String price = args[3];
                String quantity = args[4];
                String productName = args[2];
                int id = Integer.parseInt(args[1]);

                Charset charset = Charset.forName("UTF-8");
                Path path = FileSystems.getDefault().getPath(fileName);
                List<String> list;
                list = Files.readAllLines(path, charset);
                int index=0;
                String tmp;

                for (String x : list)
                {
                    if ("".equals(x) || x.length() <= 1) continue;
                    tmp = x;
                    if ((int) (char) x.charAt(0) == 65279)
                        x = x.substring(1, 9).trim();
                    else
                        x = x.substring(0, 8).trim();
                    int y = Integer.parseInt(x);
                    if (y == id) {
                        index = list.indexOf(tmp);
                    }
                }
                String newString = SoberiStroku(price, quantity, productName, id);
                list.add(index, newString);
                list.remove(++index);

                read.close();

                FileWriter writer = new FileWriter(fileName);
                BufferedWriter bufferWriter = new BufferedWriter(writer);
                for (String x : list)
                {
                    bufferWriter.write(x);
                    bufferWriter.newLine();
                }
                bufferWriter.close();


            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        if ("-d".equals(args[0])) {
            try
            {
                BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
                String fileName = read.readLine();
                read.close();

                int id = Integer.parseInt(args[1]);

                Charset charset = Charset.forName("UTF-8");
                Path path = FileSystems.getDefault().getPath(fileName);
                List<String> list;
                list = Files.readAllLines(path, charset);
                int index=0;
                String tmp;

                for (String x : list)
                {
                    if ("".equals(x) || x.length() <= 1) continue;
                    tmp = x;
                    if ((int) (char) x.charAt(0) == 65279)
                        x = x.substring(1, 9).trim();
                    else
                        x = x.substring(0, 8).trim();
                    int y = Integer.parseInt(x);
                    if (y == id) {
                        index = list.indexOf(tmp);
                    }
                }
                list.remove(index);

                read.close();

                FileWriter writer = new FileWriter(fileName);
                BufferedWriter bufferWriter = new BufferedWriter(writer);
                for (String x : list)
                {
                    bufferWriter.write(x);
                    bufferWriter.newLine();
                }
                bufferWriter.close();


            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    private static String SoberiStroku (String price, String quantity, String productName, int id) {
        StringBuilder sb = new StringBuilder();

        sb.append(id);
        if (sb.length() < 8)
        {
            int x = 8 - sb.length();
            for (int i = x; i > 0; i--)
            {
                sb.append(" ");
            }
        }

        if (productName.length() > 30) productName = productName.substring(0, 30);
        sb.append(productName);
        if (sb.length() < 38)
        {
            int x = 38 - sb.length();
            for (int i = x; i > 0; i--)
            {
                sb.append(" ");
            }
        }
        if (price.length() > 8) price = price.substring(0, 8);
        sb.append(price);
        if (sb.length() < 46)
        {
            int x = 46 - sb.length();
            for (int i = x; i > 0; i--)
            {
                sb.append(" ");
            }
        }
        if (quantity.length() > 4) quantity = quantity.substring(0, 4);
        sb.append(quantity);
        if (sb.length() < 50)
        {
            int x = 50 - sb.length();
            for (int i = x; i > 0; i--)
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
