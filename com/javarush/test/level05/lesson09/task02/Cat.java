package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String name, color, address;
    private int age, weight;

    public Cat (String name)
    {
        this.name = name;
        this.weight = 8;
        this.address = null;
        this.age = 10;
        this.color = "White";
    }

    public Cat (String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.address = null;
        this.age = age;
        this.color = "White";
    }

    public Cat (String name, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = 8;
        this.address = null;
        this.color = "White";
    }

    public Cat(int weight, String color)
    {
        this.name = null;
        this.weight = weight;
        this.color = color;
        this.address = null;
        this.age = 10;
    }

    public Cat (int weight, String color, String address)
    {
        this.name = null;
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 10;
    }

}
