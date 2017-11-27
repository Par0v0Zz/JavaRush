package com.javarush.test.level17.lesson10.bonus02;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    public static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args)
    {
        try
        {

            if (args[0].equals("-c"))
            {
                Create(args);
            }
            else if (args[0].equals("-u"))
            {
                Update(args);
            }
            else if (args[0].equals("-d"))
            {
                Delete(args);
            }
            else if (args[0].equals("-i"))
            {
                Info(args);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String Convert(Sex sex)
    {
        if (sex == Sex.MALE)
        {
            return "м";
        } else
        {
            return "ж";
        }
    }

    public static synchronized void Create (String[] args) throws Exception {

        if ((args.length-1) % 3 !=0) throw new Exception();

        for (int i=1; i<args.length-1; i+=3)
        {
            Person person;
            if (args[i+1].equals("м"))
                person = Person.createMale(args[i], format.parse(args[i+2]));
            else
                person = Person.createFemale(args[i], format.parse(args[i+2]));
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
        }
    }

    public static synchronized void Update (String[] args) throws Exception {

        if ((args.length-1) % 4 !=0) throw new Exception();

        for (int i=1; i<args.length-1; i+=4)
        {
            int id = Integer.parseInt(args[i]);
            Person person = allPeople.get(id);
            person.setName(args[i+1]);
            if (args[i+2].equals("м"))
                person.setSex(Sex.MALE);
            else
                person.setSex(Sex.FEMALE);
            person.setBirthDay(format.parse(args[i+3]));
            allPeople.set(id, person);
        }
    }

    public static synchronized void Delete (String[] args) throws Exception {

        if (args.length == 1) throw new Exception();

        for (int i=1; i<args.length; i++)
        {
            int id = Integer.parseInt(args[i]);
            Person person = allPeople.get(id);
            person.setName(null);
            person.setSex(null);
            person.setBirthDay(null);
        }
    }

    public static synchronized void Info (String[] args) throws Exception {

        if (args.length == 1) throw new Exception();

        for (int i=1; i<args.length; i++)
        {
            Person person = allPeople.get(Integer.parseInt(args[i]));
            SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            System.out.println(person.getName() + " " + Convert(person.getSex()) + " " + format.format(person.getBirthDay()));
        }
    }


}
