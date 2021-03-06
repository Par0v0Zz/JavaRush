package com.javarush.test.level19.lesson10.bonus02;

/* Свой FileWriter
Реализовать логику FileConsoleWriter
Должен наследоваться от FileWriter
При записи данных в файл, должен дублировать эти данные на консоль
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter extends FileWriter {

    public FileConsoleWriter(String fileName) throws IOException
    {
        super(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException
    {
        super(fileName, append);
    }

    public FileConsoleWriter(File file) throws IOException
    {
        super(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException
    {
        super(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd)
    {
        super(fd);
    }

    @Override
    public void write(int c) throws IOException
    {
        String num = "" + ((char) c);
        write(num, 0, num.length());
    }

    @Override
    public void write(char[] cbuf) throws IOException
    {
        String str = "";
        for (char c : cbuf)
        {
            str+=c;
        }
        write(str, 0, str.length());
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException
    {
        String str = "";
        for (char c : cbuf)
        {
            str+=c;
        }
        write(str, off, len);
    }

    @Override
    public void write(String str) throws IOException
    {
        write(str, 0, str.length());
    }

    @Override
    public void write(String str, int off, int len) throws IOException
    {
        System.out.print(str.substring(off, off + len));
        super.write(str, off, len);
    }

}
