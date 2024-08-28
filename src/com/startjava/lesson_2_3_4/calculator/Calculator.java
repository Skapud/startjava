package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int arg1;
    private String mathSign;
    private int arg2;

    public double getArg1() {
        return arg1;
    }

    public String getMathSign() {
        return mathSign;
    }

    public double getArg2() {
        return arg2;
    }

    public double calculate(String formula) {
        String[] formulaParts = formula.split(" ");
        checkArg(formulaParts[0]);
        checkArg(formulaParts[2]);
        arg1 = Integer.parseInt(formulaParts[0]);
        mathSign = formulaParts[1];
        arg2 = Integer.parseInt(formulaParts[2]);
        switch (mathSign) {
            case "+":
                return arg1 + arg2;
            case "-":
                return arg1 - arg2;
            case "*":
                return arg1 * arg2;
            case "/":
            case "%":
                if (arg2 == 0) {
                    throw new IllegalArgumentException("Ошибка: деление на ноль запрещено");
                }
                return (mathSign.equals("/")) ?
                        (double) arg1 / (double) arg2 : Math.IEEEremainder(arg1, arg2);
            case "^":
                return Math.pow(arg1, arg2);
            default:
                return Double.NaN;
        }
    }

    public void checkArg(String arg) {
        if (arg == null || !arg.matches("-?\\d+")) {
            throw new IllegalArgumentException("Ошибка: введено недопустимое число");
        }
    }
}