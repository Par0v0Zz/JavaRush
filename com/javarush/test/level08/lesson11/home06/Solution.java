package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human granddad1 = new Human("rr", true, 78);
        Human granddad2 = new Human("ff", true, 80);
        Human grandma1 = new Human("gg", false, 78);
        Human grandma2 = new Human("hh", false, 80);
        Human dad = new Human("gggg", true, 45);
        Human mom = new Human("ggddff", false, 40);
        Human son1 = new Human("gggg", true, 16);
        Human son2 = new Human("gggg", true, 17);
        Human daughter = new Human("gggg", false, 15);

        granddad1.children.add(dad);
        grandma1.children.add(dad);

        granddad2.children.add(mom);
        grandma2.children.add(mom);

        dad.children.add(son1);
        dad.children.add(son2);
        dad.children.add(daughter);

        mom.children.add(son1);
        mom.children.add(son2);
        mom.children.add(daughter);

        System.out.println(granddad1);
        System.out.println(granddad2);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(dad);
        System.out.println(mom);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
