package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final int NUMBER_OF_PLAYERS = 3;
    private int guessedNum;
    private Player[] players = new Player[NUMBER_OF_PLAYERS];
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(String[] playerNames) {
        for (int i = 0; i < playerNames.length; i++) {
            players[i] = new Player(playerNames[i]);
        }
    }

    public void start() {
        for (Player player : players) {
            player.setWin(0);
        }
        drawLots();
        for (int i = 1; i <= 3; i++) {
            Random random = new Random();
            guessedNum = random.nextInt(MAX - MIN + 1) + MIN;
            System.out.println("Раунд " + i + ". Игра началась! У каждого игрока по 10 попыток.");
            Player currentPlayer = players[0];
            do {
                if (!areAttemptsLeft(currentPlayer)) break;
                System.out.println("Игрок " + currentPlayer.getName() +
                        ", введите число от 1 до 100:");
                enterNum(currentPlayer);
                if (isGuessed(currentPlayer)) {
                    currentPlayer.setWin(currentPlayer.getWins() + 1);
                    System.out.println(currentPlayer.getName() + " угадал число " + guessedNum +
                            " с " + currentPlayer.getCurrentAttempt() + "-й попытки");
                    break;
                }
                currentPlayer = switchPlayer(currentPlayer);
            } while (true);
            for (Player player : players) {
                print(player.getNums());
                player.clear();
            }
        }
        printResult();
    }

    private void drawLots() {
        Random random = new Random();
        for (int i = players.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Player swap = players[i];
            players[i] = players[j];
            players[j] = swap;
        }
    }

    private boolean areAttemptsLeft(Player currentPlayer) {
        if (currentPlayer.getAttemptsLeft() == 0) {
            System.out.println("У игроков закончились попытки !");
            return false;
        }
        return true;
    }

    private void enterNum(Player currentPlayer) {
        do {
            int enteredNum = scanner.nextInt();
            scanner.nextLine();
            if (currentPlayer.addNum(enteredNum, MIN, MAX)) break;
            System.out.println("Число должно входить в интервал [" + MIN +
                    ", " + MAX + "]. Попробуйте еще раз:");
        } while (true);
    }

    private boolean isGuessed(Player currentPlayer) {
        if (currentPlayer.getNum() == guessedNum) {
            System.out.println("Победил " + currentPlayer.getName());
            return true;
        }
        System.out.println(currentPlayer.getNum() + " " +
                (currentPlayer.getNum() > guessedNum ? "больше" : "меньше") +
                " того, что загадал компьютер");
        return false;
    }

    private void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private Player switchPlayer(Player currentPlayer) {
        if (currentPlayer == players[2]) {
            return players[0];
        }
        for (int i = 0; i < players.length - 1; i++) {
            if (players[i] == currentPlayer) {
                return players[i + 1];
            }
        }
        return currentPlayer;
    }

    private void printResult() {
        int len = players.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (players[j].getWins() < players[j + 1].getWins()) {
                    Player swap = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = swap;
                }
            }
        }
        if (players[0].getWins() == 0) {
            System.out.println("Общий проигрыш, у каждого игрока по 0 выигранных раундов");
        } else if (players[0].getWins() == players[2].getWins()) {
            System.out.println("Общая ничья, у каждого игрока по 1 выигранному раунду");
        } else if (players[0].getWins() > 1) {
            System.out.println("Победил игрок " + players[0].getName() +
                    " с " + players[0].getWins() + " выигранными раундами");
        } else {
            System.out.println("Ничья между " + players[0].getName() + " и " + players[1].getName());
        }
    }
}