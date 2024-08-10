package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer;
        do {
            System.out.println("Введите первое число");
            calculator.setArg1(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Введите знак операции (+, -, *, /, ^, %):");
            calculator.setMathSign(scanner.nextLine());
            System.out.println("Введите второе число");
            calculator.setArg2(scanner.nextInt());
            calculator.calculate();
            System.out.println(calculator.getArg1() + " " + 
                    calculator.getMathSign() + " " + 
                    calculator.getArg2() + " = " + 
                    calculator.getResult());
            scanner.nextLine();
            do {
                System.out.println("Хотите продолжить вычисления ? [yes/no]:");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}