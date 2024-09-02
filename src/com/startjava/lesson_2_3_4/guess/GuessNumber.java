package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private int min = 1;
    private int max = 100;
    private int guessedNum;
    private Player player1;
    private Player player2;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(String playerName1, String playerName2) {
        this.player1 = new Player(playerName1);
        this.player2 = new Player(playerName2);
    }

    public void start() {
        guessedNum = min + (int) (Math.random() * (max - min + 1));
        System.out.println("Игра началась! У каждого игрока по 10 попыток.");
        Player currentPlayer = player1;
        do {
            System.out.println("Игрок " + currentPlayer.getName() + 
                    ", введите число от 1 до 100:");
            enterNum(currentPlayer);
            currentPlayer.attemptsDecrease();
            if (isGuessed(currentPlayer)) {
                System.out.println(currentPlayer.getName() + " угадал число " + guessedNum +
                        " с " + currentPlayer.getCount() + "-й попытки");
                break;
            }
            if (currentPlayer.getAttemptsLeft() == 0) {
                System.out.println("У " + currentPlayer.getName() + " закончились попытки !");
                break;
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        } while (true);
        print(player1.getNums());
        print(player2.getNums());
        player1.clearNums();
        player2.clearNums();
    }

    public void enterNum(Player currentPlayer) {
        do {
            int enteredNum = scanner.nextInt();
            if (enteredNum >= min && enteredNum <= max) {
                currentPlayer.setNum(enteredNum);
                currentPlayer.addNum(enteredNum);
                break;
            }
            System.out.println("Введено число в незаданном диапазоне, повторите ввод:");
            scanner.nextLine();
        } while (true);
    }

    public boolean isGuessed(Player currentPlayer) {
        if (currentPlayer.getNum() == guessedNum) {
            System.out.println("Победил " + currentPlayer.getName());
            return true;
        }
        System.out.println(currentPlayer.getNum() + " " + 
                (currentPlayer.getNum() > guessedNum ? "больше" : "меньше") + 
                " того, что загадал компьютер");
        return false;
    }

    public void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}