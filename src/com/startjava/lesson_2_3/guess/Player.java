package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class Player {
    private String name;
    private int num;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}