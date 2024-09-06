package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя игрока 1: ");
        String playerName1 = scanner.nextLine();
        System.out.print("Введите имя игрока 2: ");
        String playerName2 = scanner.nextLine();
        System.out.print("Введите имя игрока 3: ");
        String playerName3 = scanner.nextLine();
        GuessNumber game = new GuessNumber(playerName1, playerName2, playerName3);
        System.out.println(playerName1 + " vs " + playerName2 + " vs " + playerName3);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.start();
                game.printResult();
                System.out.println("Хотите продолжить игру? [yes / no]:");
            } else {
                System.out.println("Введите корректный ответ [yes / no]:");
            }
            answer = scanner.nextLine().toLowerCase();
        } while (!answer.equals("no"));
    }
}
