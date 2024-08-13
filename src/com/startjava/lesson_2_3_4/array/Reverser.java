package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        int[] zeroNum = {0};
        System.out.print("    До реверса: ");
        printArray(zeroNum);
        runReverse(zeroNum);
        System.out.print("\nПосле реверса: ");
        printArray(zeroNum);

        int[] empty = null;
        System.out.print("\n\n    До реверса: ");
        printArray(empty);
        runReverse(empty);
        System.out.print("\nПосле реверса: ");
        printArray(empty);

        int[] fourNums = {6, 8, 9, 1};
        System.out.print("\n\n    До реверса: ");
        printArray(fourNums);
        runReverse(fourNums);
        System.out.print("\nПосле реверса: ");
        printArray(fourNums);

        int[] sevenNums = {13, 8, 5, 3, 2, 1, 1};
        System.out.print("\n\n    До реверса: ");
        printArray(sevenNums);
        runReverse(sevenNums);
        System.out.print("\nПосле реверса: ");
        printArray(sevenNums);
    }

    public static void printArray(int[] array) {
        if (!isValidArray(array)) return;
        System.out.print(Arrays.toString(array));
    }

    public static void runReverse(int[] array) {
        if (!isValidArray(array)) {
            System.out.print("Преобразования невозможны");
            return;
        }
        int len = array.length - 1;
        for (int i = 0; i < len / 2; i++, len--) {
            int swap = array[i];
            array[i] = array[len];
            array[len] = swap;
        }
    }

    public static boolean isValidArray(int[] array) {
        if (array == null) {
            System.out.println("Массив не инициализирован");
            return false;
        }
        if (array.length == 0) {
            System.out.println("Массив пуст");
            return false;
        }
        return true;
    }
}