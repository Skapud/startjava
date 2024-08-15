package com.startjava.lesson_2_3_4.array;

public class UniqueDigitsGenerator {
    public static void main(String[] args) {
        UniqueDigitsGenerator udg = new UniqueDigitsGenerator();
        udg.startFill(-10, 20, 23);
        udg.startFill(-30, 10, 10);
        udg.startFill(34, -34, 0);
        udg.startFill(-1, 2, -3);
    }

    public void startFill(int border1, int border2, int stringCount) {
        if (stringCount < 1) {
            System.out.printf("Ошибка: количество чисел в строке не может быть меньше 1 (%s)\n", stringCount);
            return;
        }
        int interval = (Math.abs(border2 - border1) + 1);
        int len = (int) (interval * 0.75);
        if (len <= 0) {
            System.out.printf("Ошибка: длина массива должна быть больше 0 (%s)\n", len);
            return;
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
                int tempNumToCheck = (int) (border1 + (Math.random() * (border2 - border1 + 1)));
                for (int j = 0; j < i; j++) {
                    if (tempNumToCheck == uniqueNums[j]) {
                        isUnique = false;
                        break;
                    }
                }
                uniqueNums[i] = tempNumToCheck;
            } while (!isUnique);
        }
        System.out.println("Изначальный массив: ");
        for (int num : uniqueNums) {
            System.out.printf("%s ", num);
        }
        System.out.println();

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (uniqueNums[j] > uniqueNums[j + 1]) {
                    int temp = uniqueNums[j];
                    uniqueNums[j] = uniqueNums[j + 1];
                    uniqueNums[j + 1] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        int count = 0;
        for (int num : uniqueNums) {
            System.out.printf("%s ", num);
            count++;
            if (count == stringCount) {
                System.out.println();
                count = 0;
            }
        }
        System.out.println();
    }
}
