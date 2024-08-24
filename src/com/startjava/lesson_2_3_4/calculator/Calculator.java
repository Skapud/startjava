package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;

public class Calculator {
    private String formula;
    private double arg1;
    private String mathSign;
    private double arg2;
    private double result;

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        if (formula.isBlank()) {
            throw new RuntimeException("Ошибка: строка является пустой или содержит только пробелы");
        }
        this.formula = formula;
    }

    public double getArg1() {
        return arg1;
    }

    public void setArg1(double arg1) {
        this.arg1 = arg1;
    }

    public String getMathSign() {
        return mathSign;
    }

    public void setMathSign(String mathSign) {
        this.mathSign = mathSign;
    }

    public double getArg2() {
        return arg2;
    }

    public void setArg2(double arg2) {
        this.arg2 = arg2;
    }

    public void checkFormulaParts(double arg1, double arg2, String mathSign) {
        if (Double.isNaN(arg1) || Double.isNaN(arg2)) {
            throw new RuntimeException("Ошибка: введено недопустимое число");
        }
        if (mathSign == null || mathSign.isBlank()) {
            throw new RuntimeException("Ошибка: знак не может быть пустым или содержать пробелы");
        }
        if (!mathSign.equals("+") && !mathSign.equals("-") && !mathSign.equals("*") &&
                !mathSign.equals("/") && !mathSign.equals("%") && !mathSign.equals("^")) {
            throw new RuntimeException("Ошибка: операция '" + mathSign +
                    "' не поддерживается." +
                    "\nДоступны следующие операции: +, -, *, /, ^, %");
        }
    }

    public double calculate() {
        switch (mathSign) {
            case "+":
                result = arg1 + arg2;
                break;
            case "-":
                result = arg1 - arg2;
                break;
            case "*":
                result = arg1 * arg2;
                break;
            case "/":
            case "%":
                if (arg2 == 0) {
                    throw new IllegalArgumentException("Ошибка: деление на ноль запрещено");
                }
                result = (mathSign.equals("/")) ? arg1 / arg2 : Math.IEEEremainder(arg1, arg2);
                break;
            case "^":
                result = Math.pow(arg1, arg2);
                break;
        }
        return result;
    }

    public void print(double arg1, double arg2, String mathSign, double result) {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(df.format(arg1) + " " + mathSign + " " +
                    df.format(arg2) + " = " + df.format(result));
    }
}