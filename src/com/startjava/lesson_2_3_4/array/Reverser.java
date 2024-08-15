package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        int[] zeroNum = {};
        processArray(zeroNum);

        int[] empty = null;
        processArray(empty);

        int[] fourNums = {6, 8, 9, 1};
        processArray(fourNums);

        int[] sevenNums = {13, 8, 5, 3, 2, 1, 1};
        processArray(sevenNums);
    }

    private static void processArray(int[] toReverse) {
        if (!isValidArray(toReverse)) {
            System.out.println("Преобразования невозможны");
            return;
        }
        System.out.print("   До реверса: ");
        printArray(toReverse);
        runReverse(toReverse);
        System.out.print("После реверса: ");
        printArray(toReverse);
    }

    private static void printArray(int[] toReverse) {
        System.out.println(Arrays.toString(toReverse));
    }

    private static void runReverse(int[] toReverse) {
        int len = toReverse.length - 1;
        for (int i = 0; i < len / 2; i++) {
            int swap = toReverse[i];
            toReverse[i] = toReverse[len - i];
            toReverse[len - i] = swap;
        }
    }

    public static boolean isValidArray(int[] toReverse) {
        if (toReverse == null) {
            System.out.println("Массив не инициализирован");
            return false;
        }
        if (toReverse.length == 0) {
            System.out.println("Массив пуст");
            return false;
        }
        return true;
    }
}