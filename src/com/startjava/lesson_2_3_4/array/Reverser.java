package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        reverse(new int[] {});
        reverse(null);
        reverse(new int[] {6, 8, 9, 1});
        reverse(new int[] {13, 8, 5, 3, 2, 1, 1});
    }

    private static void reverse(int[] array) {
        if (!isValidArray(array)) {
            System.out.println("Преобразования невозможны");
            return;
        }
        System.out.print("   До реверса: ");
        print(array);
        reverseArray(array);
        System.out.print("После реверса: ");
        print(array);
    }

    private static boolean isValidArray(int[] toReverse) {
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

    private static void reverseArray(int[] toReverse) {
        int len = toReverse.length;
        for (int i = 0; i < len - 1; i++) {
            int swap = toReverse[i];
            toReverse[i] = toReverse[--len];
            toReverse[len] = swap;
        }
    }

    private static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}