package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                System.out.println("Введите математическое выражение: a ^ b");
                String mathExpression = scanner.nextLine().trim();
                try {
                    double result = Calculator.calculate(mathExpression);
                    print(result, mathExpression);
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Хотите продолжить вычисления ? [yes/no]:");
            } else {
                System.out.println("Введите корректный ответ [yes / no]:");
            }
            answer = scanner.nextLine().toLowerCase();
        } while (!answer.equals("no"));
    }

    private static void print(double result, String mathExpression) {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(mathExpression + " = " + df.format(result));
    }
}