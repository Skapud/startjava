package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static final String YES = "yes";
    private static final String NO = "no";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] playerNames = inputNames(scanner);
        GuessNumber game = new GuessNumber(playerNames);
        System.out.println(playerNames[0] + " vs " + playerNames[1] + " vs " + playerNames[2]);
        String answer = YES;
        do {
            if (answer.equals(YES)) {
                game.start();
                System.out.println("Хотите продолжить игру? [yes / no]:");
            } else {
                System.out.println("Введите корректный ответ [yes / no]:");
            }
            answer = scanner.nextLine().toLowerCase();
        } while (!answer.equals(NO));
    }

    private static String[] inputNames(Scanner scanner) {
        String[] playerNames = new String[GuessNumber.NUMBER_OF_PLAYERS];
        for (int i = 0; i < GuessNumber.NUMBER_OF_PLAYERS; i++) {
            System.out.print("Введите имя игрока " + (i + 1) + ": ");
            playerNames[i] = scanner.nextLine();
        }
        return playerNames;
    }
}
