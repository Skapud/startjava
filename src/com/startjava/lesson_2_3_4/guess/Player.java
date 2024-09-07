package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private static final int MAX_ATTEMPTS = 10;
    private String name;
    private int[] nums = new int[MAX_ATTEMPTS];
    private int currentAttempt;
    private int wins;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, currentAttempt);
    }

    public int getNum() {
        return nums[currentAttempt - 1];
    }

    public boolean addNum(int num, int min, int max) {
        if (num >= min && num <= max) {
            nums[currentAttempt] = num;
            currentAttempt++;
            return true;
        }
        return false;
    }

    public int getCurrentAttempt() {
        return currentAttempt;
    }

    public int getWins() {
        return wins;
    }

    public void setWin(int wins) {
        this.wins = wins;
    }

    public int getAttemptsLeft() {
        return nums.length - currentAttempt;
    }

    public void clear() {
        Arrays.fill(nums, 0, currentAttempt, 0);
        currentAttempt = 0;
    }
}