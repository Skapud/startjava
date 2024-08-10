package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("male");
        wolf.setName("wolfy");
        wolf.setWeight(55);
        wolf.setAge(5);
        wolf.setColour("Grey");
        System.out.println("Пол - " + wolf.getGender());
        System.out.println("Имя - " + wolf.getName());
        System.out.println("Вес - " + wolf.getWeight());
        System.out.println("Возраст - " + wolf.getAge());
        System.out.println("Цвет - " + wolf.getColour());
        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}