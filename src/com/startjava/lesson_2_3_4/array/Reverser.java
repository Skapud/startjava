package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        reverse(new int[] {});

        reverse(null);

        reverse(new int[] {6, 8, 9, 1});

        reverse(new int[] {13, 8, 5, 3, 2, 1, 1});
    }

    private static void reverse(int[] toReverse) {
        if (!isValidArray(toReverse)) {
            System.out.println("Преобразования невозможны");
            return;
        }
        System.out.print("   До реверса: ");
        print(toReverse);
        reverseArray(toReverse);
        System.out.print("После реверса: ");
        print(toReverse);
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

    private static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void reverseArray(int[] toReverse) {
        int len = toReverse.length;
        for (int i = 0; i < len / 2; i++) {
            len--;
            int swap = toReverse[i];
            toReverse[i] = toReverse[len - i];
            toReverse[len - i] = swap;
        }
    }
}