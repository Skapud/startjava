package com.startjava.lesson_2_3_4.array;

public class Factorial {
    private long[] result = new long[6];
    private int index;

    public static void main(String[] args) {
        Factorial fc = new Factorial();
        fc.startCalc();
        fc.startCalc(null);
        fc.startCalc(8, 0, 9);
        fc.startCalc(-3, 1, 7, 13);
        fc.startCalc(-22, -0);
        fc.printResult();
    }

    public void startCalc(int... array) {
        if (array == null) {
            System.out.println("null");
            return;
        }
        for (int num : array) {
            if (num < 0) {
                System.out.println("Ошибка: факториал " + num + "! не определен");
                continue;
            }
            long resultCalc = 1;
            System.out.print(num + "! = ");
            if (num == 0 || num == 1) {
                System.out.println(resultCalc);
            } else {
                for (int i = 1; i <= num; i++) {
                    resultCalc *= i;
                    System.out.print((i < num) ? i + " * " : i + " = " + resultCalc);
                }
                System.out.println();
            }
            if (index < this.result.length) {
                this.result[index] = resultCalc;
                index++;
            }
        }
    }

    public void printResult() {
        System.out.println("Результат: ");
        for (long num : result) {
            System.out.print(num + " ");
        }
    }
}
