package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> files = new ArrayList<>();
        String data;

            while (!(data = reader.readLine()).equals("end"))
            {
                files.add(data);
            }
            reader.close();

            Collections.sort(files, new Comparator<String>()
            {
                @Override
                public int compare(String o1, String o2)
                {
                    int s1 = Integer.parseInt(o1.substring((o1.toLowerCase().lastIndexOf("t")+1), o1.length()));
                    int s2 = Integer.parseInt(o2.substring((o2.toLowerCase().lastIndexOf("t")+1), o2.length()));

                    return s1 > s2 ? 1 : -1;
                }
            });

            data = files.get(0);
            String path = data.substring(0, data.lastIndexOf("."));
            FileOutputStream out = new FileOutputStream(path);
            System.out.println(path + " " + data);

            for(String file : files) {
                FileInputStream in = new FileInputStream(file);
                byte[] buf = new byte[in.available()];
                in.read(buf);
                out.write(buf);
                in.close();
            }
            out.close();
    }
}
