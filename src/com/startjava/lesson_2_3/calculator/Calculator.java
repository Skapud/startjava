package com.startjava.lesson_2_3.calculator;


public class Calculator {
    private double arg1;
    private String mathSign;
    private double arg2;
    private double result;

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

    public double getResult() {
        return result;
    }

    public void calculate() {
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
                result = (mathSign == "/") ? arg1 / arg2 : arg1 % arg2;
                break;
            case "^":
                result = 1;
                for (int i = 1; i <= Math.abs(arg2); i++) {
                    result *= arg1;
                }
                result = (arg2 < 0) ? 1 / result : result;
                break;
            default:
                throw new IllegalArgumentException("Ошибка: операция '" + mathSign + 
                        "' не поддерживается." + 
                        "\nДоступны следующие операции: +, -, *, /, ^, % +"); 
        }
    }
}