package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class UniqueDigitsFiller {
    public static void main(String[] args) {
        UniqueDigitsFiller udg = new UniqueDigitsFiller();
        udg.fillDigits(-10, 20, 23);
        udg.fillDigits(-30, 10, 10);
        udg.fillDigits(34, -34, 0);
        udg.fillDigits(-1, 2, -3);
    }

    private void fillDigits(int minBorder, int maxBorder, int lineCount) {
        int[] uniqueDigits = fillRandom(minBorder, maxBorder, lineCount);
        if (uniqueDigits != null) {
            System.out.println("Изначальный массив: ");
            print(uniqueDigits, lineCount);
            sort(uniqueDigits);
            System.out.println("Отсортированный массив: ");
            print(uniqueDigits, lineCount);
        }
    }

    private int[] fillRandom(int border1, int border2, int stringCount) {
        if (stringCount < 1) {
            System.out.printf("Ошибка: количество чисел в строке не может быть меньше 1 (%s)\n", stringCount);
            return null;
        }
        int len = (int) ((Math.abs(border2 - border1) + 1) * 0.75);
        if (len <= 0) {
            System.out.printf("Ошибка: длина массива должна быть больше 0 (%s)\n", len);
            return null;
        }
        if (border1 > border2) {
            int swap = border1;
            border1 = border2;
            border2 = swap;
        }

        int[] uniqueNums = new int[len];
        boolean isUnique;
        for (int i = 0; i < len; i++) {
            do {
                isUnique = true;
                Random r = new Random();
                int tempNumCheck = border1 + r.nextInt(border2 - border1 + 1);
                for (int j = 0; j < i; j++) {
                    if (tempNumCheck == uniqueNums[j]) {
                        isUnique = false;
                        break;
                    }
                }
                uniqueNums[i] = tempNumCheck;
            } while (!isUnique);
        }
        return uniqueNums;
    }

    private void sort(int[] uniqueNums) {
        int len = uniqueNums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (uniqueNums[j] > uniqueNums[j + 1]) {
                    int temp = uniqueNums[j];
                    uniqueNums[j] = uniqueNums[j + 1];
                    uniqueNums[j + 1] = temp;
                }
            }
        }
    }

    private void print(int[] uniqueNums, int stringCount) {
        int count = 0;
        for (int num : uniqueNums) {
            if (uniqueNums.length == stringCount) {
                System.out.printf("%s ", num);
            } else {
                System.out.printf("%3s ", num);
                count++;
                if (count == stringCount) {
                    System.out.println();
                    count = 0;
                }
            }
        }
        System.out.println();
    }
}
