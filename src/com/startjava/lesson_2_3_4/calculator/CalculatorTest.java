package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                System.out.println("Введите математическое выражение: a ^ b");
                double result = calc.calculate(scanner.nextLine());
                DecimalFormat df = new DecimalFormat("#.###");
                System.out.println(df.format(calc.getArg1()) + " " + calc.getMathSign() + " " +
                        df.format(calc.getArg2()) + " = " + df.format(result));
                System.out.println("Хотите продолжить вычисления ? [yes/no]:");
            } else {
                System.out.println("Введите корректный ответ [yes / no]:");
            }
            answer = scanner.nextLine().toLowerCase();
        } while (!answer.equals("no"));
    }
}