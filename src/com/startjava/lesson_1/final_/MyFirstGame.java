package com.startjava.lesson_1.final_;

public class MyFirstGame {
    public static void main(String[] args) {
        int guessedNum = 50;
        int playerNum = 100;
        while (playerNum != guessedNum) {
            if (guessedNum > playerNum) {
                System.out.println(playerNum + " меньше того, что загадал компьютер");
                playerNum++;
            } else {
                System.out.println(playerNum + " больше того, что загадал компьютер");
                playerNum--;
            }
        } 
        System.out.println("Вы победили");
    }
}