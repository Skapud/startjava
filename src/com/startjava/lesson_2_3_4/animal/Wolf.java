package com.startjava.lesson_2_3_4.animal;

public class Wolf {
    private String gender;
    private String name;
    private int weight;
    private int age;
    private String colour;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            throw new IllegalArgumentException("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void move() {
        System.out.println("moving");
    }

    public void sit() {
        System.out.println("sitting");
    }

    public void run() {
        System.out.println("running");
    }

    public void howl() {
        System.out.println("howling");
    }

    public void hunt() {
        System.out.println("hunting");
    }
}