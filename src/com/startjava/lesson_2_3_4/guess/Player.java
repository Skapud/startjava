package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int num;
    private int[] nums = new int[10];
    private int attemptsLeft = 10;
    private int count = 0;

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

    public int[] getNums() {
        return Arrays.copyOf(nums, count);
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    public int getCount() {
        return count;
    }

    public void addNum(int num) {
        nums[count] = num;
        count++;
    }

    public void clearNums() {
        Arrays.fill(nums, 0, count, 0);
        count = 0;
        attemptsLeft = 10;
    }

    public void attemptsDecrease() {
        if (attemptsLeft > 0) {
            attemptsLeft--;
        }
    }
}