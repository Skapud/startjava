package com.startjava.lesson_1.final_;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое натуральное число");
        int x = scanner.nextInt();
        if (x < 0) {
            System.out.println("Ошибка ввода, повторите заново");
            return;
        }
        System.out.println("Введите математическую операцию: +, -, *, /, ^, %");
        scanner.nextLine();
        String mathSign = scanner.nextLine();
        System.out.println("Введите второе натуральное число");
        int y = scanner.nextInt();
        if (y < 0) {
            System.out.println("Ошибка ввода, повторите заново");
            return;
        }
        int result = 0;
        if (mathSign.equals("+")) {
            result = x + y;
        } else if (mathSign.equals("-")) {
            result = x - y;
        } else if (mathSign.equals("*")) {
            result = x * y;
        } else if (mathSign.equals("/")) {
            result = x / y;
        } else if (mathSign.equals("^")) {
            result = 1;
            for (int i = 1; i <= y; i++) {
                result *= x;
            }
        } else if (mathSign.equals("%")) {
            result = x % y;
        } else {
            System.out.println("Ошибка ввода, повторите заново");
            return;
        }
        System.out.println(x + " " + mathSign + " " + y + " = " + result);
    }
}