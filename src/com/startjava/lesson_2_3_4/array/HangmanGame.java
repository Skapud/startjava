package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Scanner;

public class HangmanGame {
    private static String[] gallows = {
            " _________",
            " |       |",
            " |       ()/",
            " |      /||",
            " |       //",
            " |",
            "_|_____"
    };
    private int attemptsLeft = gallows.length;
    String[] allLetters = new String[33];
    private int allLettersCount = 0;
    String[] wrongLetters = new String[33];
    private int wrongLettersCount = 0;
    private String chosenWord;

    public static void main(String[] args) {
        HangmanGame game = new HangmanGame();
        char[][] gameInit = game.init();
        char[] chosenWordChars = gameInit[0];
        char[] currentMask = gameInit[1];
        boolean isEqual;
        do {
            String input = game.inputLetter();
            isEqual = game.checkMatch(input, chosenWordChars, currentMask);
            game.printStatus(currentMask);
        } while (!isEqual && game.attemptsLeft != 0);
        game.printGameResult(isEqual);
    }

    private char[][] init() {
        String[] listWordsGuess = {"ВЕЛОСИПЕД", "АТТРАКЦИОН", "АСФИКСИЯ", "ЦЕНТНЕР", "ФРАКЦИЯ"};
        chosenWord = listWordsGuess[(int) (Math.random() * listWordsGuess.length)];
        char[] chosenWordChars = chosenWord.toCharArray();
        char[] currentMask = new char[chosenWord.length()];
        Arrays.fill(currentMask, '_');
        return new char[][]{chosenWordChars, currentMask};
    }

    private String inputLetter() {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean isDuplicate;
        do {
            System.out.println("Введите букву:");
            input = scanner.nextLine().toUpperCase();
            if (input.isBlank()) {
                System.out.println("Ошибка: введена пустая строка или пробел");
                continue;
            }
            if (input.length() != 1) {
                System.out.println("Ошибка: количество введённых символов не равно одному");
                continue;
            }
            if (!isCyrillic(input)) {
                System.out.println("Ошибка: введённый символ не является кириллическим");
                continue;
            }
            isDuplicate = false;
            for (int i = 0; i < allLetters.length; i++) {
                if (allLetters[i] != null && allLetters[i].equals(input)) {
                    isDuplicate = true;
                    System.out.println("Ошибка: данный символ был введён ранее");
                    break;
                }
            }
            if (!isDuplicate) {
                allLetters[allLettersCount] = input;
                allLettersCount++;
                break;
            }
        } while (true);
        return input;
    }

    private boolean isCyrillic(String ch) {
        return ch.matches("\\p{IsCyrillic}");
    }

    private boolean checkMatch(String input, char[] chosenWordChars, char[] currentMask) {
        boolean isGuessed = false;
        for (int i = 0; i < chosenWordChars.length; i++) {
            if (chosenWordChars[i] == input.charAt(0)) {
                currentMask[i] = input.charAt(0);
                isGuessed = true;
            }
        }
        if (isGuessed && attemptsLeft < gallows.length) {
            attemptsLeft++;
        }
        if (!isGuessed) {
            wrongLetters[wrongLettersCount] = input;
            wrongLettersCount++;
            attemptsLeft--;
        }
        return Arrays.equals(chosenWordChars, currentMask);
    }

    private void printStatus(char[] currentMask) {
        if (attemptsLeft < gallows.length) {
            for (int i = 0; i < gallows.length - attemptsLeft; i++) {
                System.out.println(gallows[i]);
            }
        }
        System.out.println("Текущее количество попыток: " + attemptsLeft);
        for (char letter : currentMask) {
            System.out.print(letter + " ");
        }
        System.out.print("\nСписок ошибочных букв: ");
        for (String letter : wrongLetters) {
            if (letter != null) {
                System.out.printf("%s ", letter);
            }
        }
        System.out.println();
    }

    private void printGameResult(boolean isEqual) {
        System.out.println((isEqual) ? "Вы победили" : "Вы проиграли");
        System.out.println("Загаданное слово : " + chosenWord);
    }
}