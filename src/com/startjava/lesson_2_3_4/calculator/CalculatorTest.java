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
                try {
                    double result = Calculator.calculate(scanner.nextLine());
                    print(result);
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

    private static void print(double result) {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(df.format(Calculator.getArg1()) + " " + Calculator.getMathSign() + " " +
                df.format(Calculator.getArg2()) + " = " + df.format(result));
    }
}