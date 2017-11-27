package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        if ("-c".equals(args[0]))
        {
            try
            {
                BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
                String fileName = read.readLine();
                read.close();

                String price = args[2];
                String quantity = args[3];
                String productName = args[1];

                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                int maxID = 0;
                while (reader.ready())
                {
                    String s = reader.readLine();
                    if ("".equals(s) || s.length() <= 1) continue;
                    if ((int) (char) s.charAt(0) == 65279)
                        s = s.substring(1, 9).trim();
                    else
                        s = s.substring(0, 8).trim();
                    System.out.println(s);
                    int x = Integer.parseInt(s);
                    if (x > maxID) maxID = x;
                }
                read.close();

                StringBuilder sb = new StringBuilder();

                sb.append(maxID + 1);
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

                FileWriter writer = new FileWriter(fileName, true);
                BufferedWriter bufferWriter = new BufferedWriter(writer);
                bufferWriter.newLine();
                bufferWriter.write(sb.toString());
                bufferWriter.close();


            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
