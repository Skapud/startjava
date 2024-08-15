package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
        Factorial fc = new Factorial();
        fc.calc();
        fc.calc((int[]) null);
        fc.calc(8, 0, 9);
        fc.calc(-3, 1, 7, 13);
        fc.calc(-22, -0);
    }

    private void calc(int... sequence) {
        if (sequence == null || sequence.length == 0) {
            System.out.printf("Ошибка: %s не является допустимым значением\n",
                    (sequence == null) ? "null" : "0");
            return;
        }
        int validCount = countValidValues(sequence);
        long[] factorials = new long[validCount];
        int index = 0;
        for (int num : sequence) {
            if (num >= 0) {
                factorials[index] = calcFactorial(num);
                index++;
            }
        }
        printResult(sequence, factorials);
    }

    private int countValidValues(int[] sequence) {
        int count = 0;
        for (int num : sequence) {
            if (num >= 0) {
                count++;
            }
        }
        return count;
    }

    private long calcFactorial(int factorialNum) {
        long factorialResult = 1;
        if (factorialNum > 1) {
            for (int i = 1; i <= factorialNum; i++) {
                factorialResult *= i;
            }
        }
        return factorialResult;
    }

    private void printResult(int[] original, long[] factorials) {
        int validIndex = 0;
        for (int num : original) {
            if (num >= 0) {
                long factorial = factorials[validIndex];
                System.out.print(num + "! = ");
                if (num == 0 || num == 1) {
                    System.out.print(factorial);
                } else {
                    for (int i = 0; i <= num; i++) {
                        System.out.print(i + ((i < num) ? " * " : " = " + factorial));
                    }
                }
                System.out.println();
                validIndex++;
            }
        }
        System.out.println("Результат: " + Arrays.toString(factorials) + "\n");
    }
}
