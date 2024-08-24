package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer = "";
        boolean shouldContinue = true;
        while (true) {
            if (shouldContinue) {
                System.out.println("Введите математическое выражение: a ^ b");
                calc.setFormula(scanner.nextLine());
                String[] formulaParts = calc.getFormula().split(" ");
                calc.setArg1(Integer.parseInt(formulaParts[0]));
                calc.setMathSign(formulaParts[1]);
                calc.setArg2(Integer.parseInt(formulaParts[2]));
                calc.checkFormulaParts(calc.getArg1(), calc.getArg2(), calc.getMathSign());
                calc.print(calc.getArg1(), calc.getArg2(), calc.getMathSign(), calc.calculate());
                System.out.println("Хотите продолжить вычисления ? [yes/no]:");
                shouldContinue = false;
            } else if (answer.equals("no")) {
                break;
            } else if (answer.equals("yes")) {
                shouldContinue = true;
                continue;
            } else {
                System.out.println("Введите корректный ответ [yes / no]:");
            }
            answer = scanner.nextLine().toLowerCase();
        }
    }
}