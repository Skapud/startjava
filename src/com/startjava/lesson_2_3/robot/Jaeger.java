package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String status;
    private String origin;
    private double height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;
    private String powerMove;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String status, String origin, double height,
                float weight, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.status = status;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setPowerMove(String powerMove) {
        this.powerMove = powerMove;
    }

    void move() {
        System.out.println(modelName + " is Moving");
    }

    void powerMove() {
        System.out.println("Doing his powermove - " + powerMove);
    }

    public void displayInfo() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Mark: " + mark);
        System.out.println("Status: " + status);
        System.out.println("Origin: " + origin);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Speed: " + speed);
        System.out.println("Strength: " + strength);
        System.out.println("Armor: " + armor);
    }
}