package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
        Factorial fc = new Factorial();
        fc.startCalc();
        fc.startCalc((int[]) null);
        fc.startCalc(8, 0, 9);
        fc.startCalc(-3, 1, 7, 13);
        fc.startCalc(-22, -0);
    }

    public void startCalc(int... inputs) {
        if (inputs == null) {
            System.out.println("Ошибка: null не является допустимым входом\n");
            return;
        }
        int validCount = 0;
        for (int num : inputs) {
            if (num >= 0) {
                validCount++;
            } else {
                System.out.println("Ошибка: факториал " + num + "! не определен");
            }
        }
        long[] factorials = new long[validCount];
        int index = 0;
        for (int num : inputs) {
            if (num >= 0) {
                factorials[index] = calculateFactorial(num);
                index++;
            }
        }
        printResult(inputs, factorials);
    }

    public long calculateFactorial(int num) {
        long factorial = 1;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }

    public void printResult(int[] originalArray, long[] factorials) {
        for (int num : originalArray) {
            if (num >= 0) {
                System.out.print(num + "! = ");
                long factorial = 1;
                if (num > 1) {
                    for (int i = 1; i <= num; i++) {
                        factorial *= i;
                        System.out.print((i < num) ? i + " * " : i + " = " + factorial);
                    }
                } else {
                    System.out.print(factorial);
                }
                System.out.println();
            }
        }
        System.out.println("Результат: ");
        System.out.println(Arrays.toString(factorials) + "\n");
    }
}
