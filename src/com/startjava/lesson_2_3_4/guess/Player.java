package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] nums = new int[10];
    private int currentAttempt = 0;
    private int wins = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, currentAttempt);
    }

    public int getNumInput() {
        return nums[currentAttempt - 1];
    }

    public int getCurrentAttempt() {
        return currentAttempt;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getAttemptsLeft() {
        return nums.length - currentAttempt;
    }

    public boolean addNum(int num, int min, int max) {
        if (num >= min && num <= max) {
            nums[currentAttempt] = num;
            currentAttempt++;
            return true;
        }
        System.out.println("Число должно входить в интервал [" + min +
                ", " + max + "]. Попробуйте еще раз:");
        return false;
    }

    public void clearNums() {
        Arrays.fill(nums, 0, currentAttempt, 0);
        currentAttempt = 0;
    }
}