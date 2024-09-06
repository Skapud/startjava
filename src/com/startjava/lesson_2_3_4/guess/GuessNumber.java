package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static final int MIN = 1;
    private static final int MAX = 100;
    private int guessedNum;
    private static final Player[] PLAYERS = new Player[3];
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(String playerName1, String playerName2, String playerName3) {
        PLAYERS[0] = new Player(playerName1);
        PLAYERS[1] = new Player(playerName2);
        PLAYERS[2] = new Player(playerName3);
    }

    public void start() {
        drawLots();
        for (int i = 1; i <= 3; i++) {
            Random random = new Random();
            guessedNum = random.nextInt(MAX - MIN + 1) + MIN;
            System.out.println("Раунд " + i + ". Игра началась! У каждого игрока по 10 попыток.");
            Player currentPlayer = PLAYERS[0];
            do {
                if (!areAttemptsLeft(currentPlayer)) break;
                System.out.println("Игрок " + currentPlayer.getName() +
                        ", введите число от 1 до 100:");
                enterNum(currentPlayer);
                if (isGuessed(currentPlayer)) {
                    currentPlayer.setWins(currentPlayer.getWins() + 1);
                    System.out.println(currentPlayer.getName() + " угадал число " + guessedNum +
                            " с " + currentPlayer.getCurrentAttempt() + "-й попытки");
                    break;
                }
                currentPlayer = switchPlayer(currentPlayer);
            } while (true);
            for (Player player : PLAYERS) {
                print(player.getNums());
                player.clearNums();
            }
        }
    }

    public void drawLots() {
        Random random = new Random();
        for (int i = PLAYERS.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Player swap = PLAYERS[i];
            PLAYERS[i] = PLAYERS[j];
            PLAYERS[j] = swap;
        }
    }

    public boolean areAttemptsLeft(Player currentPlayer) {
        if (currentPlayer.getAttemptsLeft() == 0) {
            System.out.println("У игроков закончились попытки !");
            return false;
        } else {
            return true;
        }
    }

    public void enterNum(Player currentPlayer) {
        do {
            int enteredNum = scanner.nextInt();
            scanner.nextLine();
            if (currentPlayer.addNum(enteredNum, MIN, MAX)) break;
        } while (true);
    }

    public boolean isGuessed(Player currentPlayer) {
        if (currentPlayer.getNumInput() == guessedNum) {
            System.out.println("Победил " + currentPlayer.getName());
            return true;
        }
        System.out.println(currentPlayer.getNumInput() + " " +
                (currentPlayer.getNumInput() > guessedNum ? "больше" : "меньше") +
                " того, что загадал компьютер");
        return false;
    }

    public void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public Player switchPlayer(Player currentPlayer) {
        if (currentPlayer == PLAYERS[2]) {
            return PLAYERS[0];
        }
        for (int i = 0; i < PLAYERS.length - 1; i++) {
            if (PLAYERS[i] == currentPlayer) {
                return PLAYERS[i + 1];
            }
        }
        return currentPlayer;
    }

    public void printResult() {
        int[] wins = {PLAYERS[0].getWins(), PLAYERS[1].getWins(), PLAYERS[2].getWins()};
        if (wins[0] == 0 && wins[1] == 0 && wins[2] == 0) {
            System.out.println("Общий проигрыш, у каждого игрока по 0 выигранных раундов");
            return;
        }
        int max = wins[0];
        for (int i = 1; i < wins.length; i++) {
            if (max < wins[i]) {
                max = wins[i];
            }
        }
        int maxCount = 0;
        int[] winners = new int[3];
        for (int i = 0; i < wins.length; i++) {
            if (max == wins[i]) {
                winners[maxCount] = i;
                maxCount++;
            }
        }
        if (maxCount == 1) {
            System.out.println("Победил игрок " + PLAYERS[winners[0]].getName());
        } else if (maxCount == 2) {
            System.out.println("Ничья между " + PLAYERS[winners[0]].getName() +
                    " и " + PLAYERS[winners[1]].getName());
        } else {
            System.out.println("Общая ничья, у каждого игрока по 1 победе");
        }
    }
}