package com.startjava.lesson_2_3_4.array;

public class Reverse {
    public static void main(String[] args) {
        int[] zeroNum = new int[0];
        System.out.print("До реверса: ");
        printCurrent(zeroNum);
        runProcess(zeroNum);
        System.out.print("\nПосле реверса : ");
        printCurrent(zeroNum);

        int[] empty = null;
        System.out.print("\n\nДо реверса: ");
        printCurrent(empty);
        runProcess(empty);
        System.out.print("\nПосле реверса : ");
        printCurrent(empty);

        int[] fourNums = new int[]{6, 8, 9, 1};
        System.out.print("\n\nДо реверса: ");
        printCurrent(fourNums);
        runProcess(fourNums);
        System.out.print("\nПосле реверса : ");
        printCurrent(fourNums);

        int[] sevenNums = new int[]{13, 8, 5, 3, 2, 1, 1};
        System.out.print("\n\nДо реверса: ");
        printCurrent(sevenNums);
        runProcess(sevenNums);
        System.out.print("\nПосле реверса : ");
        printCurrent(sevenNums);
    }

    public static boolean isArrayNullOrEmpty(int[] array) {
        if (array == null) {
            System.out.println("Массив не инициализирован");
            return true;
        }
        if (array.length == 0) {
            System.out.println("Массив пуст");
            return true;
        }
        return false;
    }

    public static void printCurrent(int[] array) {
        if (isArrayNullOrEmpty(array)) {
            return;
        }
        int len = array.length;
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            System.out.print(array[i]);
            if (i < len - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void runProcess(int[] array) {
        if (isArrayNullOrEmpty(array)) {
            System.out.print("Преобразования невозможны");
            return;
        }
        int len = array.length;
        for (int j = len - 1, i = 0; i < len / 2; i++) {
            int k = array[i];
            array[i] = array[j - i];
            array[j - i] = k;
        }
    }
}