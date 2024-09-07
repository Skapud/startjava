package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static final String YES = "yes";
    private static final String NO = "no";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] playerNames = new String[3];
        for (int i = 0; i < playerNames.length; i++) {
            System.out.print("Введите имя игрока " + (i + 1) + ": ");
            playerNames[i] = scanner.nextLine();
        }
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
}
