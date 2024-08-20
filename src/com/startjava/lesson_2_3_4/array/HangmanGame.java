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
    String[] allLetters = new String[33];
    private int allLettersCount = 0;
    String[] wrongLetters = new String[33];
    private int wrongLettersCount = 0;
    Scanner scanner = new Scanner(System.in);
    private String chosenWord;
    private String input;
    private int remainAttempts = gallows.length;
    private char[] chosenWordChars;
    private char[] currentMask;
    private boolean isEqual;

    public static void main(String[] args) {
        HangmanGame gallows = new HangmanGame();
        gallows.init();
        do {
            gallows.inputSym();
            gallows.checkMatch();
            gallows.printStatus();
        } while (!gallows.isEqual && gallows.remainAttempts != 0);
        gallows.printWinnerLoser();
    }

    private void init() {
        String[] listWordsGuess = {"ВЕЛОСИПЕД", "АТТРАКЦИОН", "АСФИКСИЯ", "ЦЕНТНЕР", "ФРАКЦИЯ"};
        chosenWord = listWordsGuess[(int) (Math.random() * listWordsGuess.length)];
        chosenWordChars = chosenWord.toCharArray();
        currentMask = new char[chosenWord.length()];
        for (int i = 0; i < currentMask.length; i++) {
            currentMask[i] = '_';
        }
    }

    private void inputSym() {
        boolean isDublicate;
        do {
            System.out.println("Введите букву:");
            input = scanner.nextLine();
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
            isDublicate = false;
            for (int i = 0; i < allLetters.length; i++) {
                if (allLetters[i] != null && allLetters[i].equals(input.toUpperCase())) {
                    isDublicate = true;
                    System.out.println("Ошибка: данный символ был введён ранее");
                    break;
                }
            }
            if (!isDublicate) {
                allLetters[allLettersCount] = input.toUpperCase();
                allLettersCount++;
                break;
            }
        } while (true);
    }

    private boolean isCyrillic(String ch) {
        return ch.matches("\\p{IsCyrillic}");
    }

    private void checkMatch() {
        boolean isGuessed = false;
        for (int i = 0; i < chosenWordChars.length; i++) {
            if (chosenWordChars[i] == input.toUpperCase().charAt(0)) {
                currentMask[i] = input.toUpperCase().charAt(0);
                isGuessed = true;
            }
        }
        if (isGuessed && remainAttempts < gallows.length) {
            remainAttempts++;
        }
        if (!isGuessed) {
            wrongLetters[wrongLettersCount] = input.toUpperCase();
            wrongLettersCount++;
            remainAttempts--;
        }
        isEqual = Arrays.equals(chosenWordChars, currentMask);
    }

    private void printStatus() {
        if (remainAttempts < gallows.length) {
            for (int i = 0; i < gallows.length - remainAttempts; i++) {
                System.out.println(gallows[i]);
            }
        }
        System.out.println("Текущее количество попыток: " + remainAttempts);
        for (char sym : currentMask) {
            System.out.print(sym + " ");
        }
        System.out.print("\nСписок ошибочных букв: ");
        for (String sym : wrongLetters) {
            if (sym != null) {
                System.out.printf("%s ", sym);
            }
        }
        System.out.println();
    }

    private void printWinnerLoser() {
        System.out.println((isEqual) ? "Вы победили" : "Вы проиграли");
        System.out.println("Загаданное слово : " + chosenWord);
    }
}