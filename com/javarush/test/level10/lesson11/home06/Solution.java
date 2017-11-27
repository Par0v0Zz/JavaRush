package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        int age, height, weight;
        String name, surname;
        boolean sex;

        public Human(int age)
        {
            this.age = age;
        }

        public Human(int age, int height, int weight)
        {
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(int age, int weight, String name)
        {
            this.age = age;
            this.weight = weight;
            this.name = name;
        }

        public Human(int age, int height, int weight, String name, String surname, boolean sex)
        {
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.name = name;
            this.surname = surname;
            this.sex = sex;
        }

        public Human(int age, int height, String surname, boolean sex)
        {
            this.age = age;
            this.height = height;
            this.surname = surname;
            this.sex = sex;
        }

        public Human(int age, String surname, boolean sex)
        {
            this.age = age;
            this.surname = surname;
            this.sex = sex;
        }

        public Human(int age, boolean sex)
        {
            this.age = age;
            this.sex = sex;
        }

        public Human(int age, String name)
        {
            this.age = age;
            this.name = name;
        }

        public Human(String name, String surname)
        {
            this.name = name;
            this.surname = surname;
        }

        public Human(int age, int height, int weight, String surname, boolean sex)
        {
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.surname = surname;
            this.sex = sex;
        }
    }
}
