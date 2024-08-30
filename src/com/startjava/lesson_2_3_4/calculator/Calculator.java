package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static int arg1;
    private static String mathSign;
    private static int arg2;
    private static final int EXPECTED_MATH_EXPRESSION_LENGTH = 3;

    public static int getArg1() {
        return arg1;
    }

    public static String getMathSign() {
        return mathSign;
    }

    public static int getArg2() {
        return arg2;
    }

    public static double calculate(String mathExpression) throws RuntimeException {
        String[] parts = mathExpression.trim().split("\\s+");
        if (parts.length != EXPECTED_MATH_EXPRESSION_LENGTH) {
            throw new RuntimeException("Ошибка: математическое выражение " +
                    "должно состоять из двух чисел и одного знака");
        }
        checkArg(parts[0], parts[2]);
        mathSign = parts[1];
        return switch (mathSign) {
            case "+" -> arg1 + arg2;
            case "-" -> arg1 - arg2;
            case "*" -> arg1 * arg2;
            case "/", "%" -> {
                if (arg2 == 0) {
                    throw new RuntimeException("Ошибка: деление на ноль запрещено");
                }
                yield (mathSign.equals("/")) ?
                        (double) arg1 / arg2 : Math.IEEEremainder(arg1, arg2);
            }
            case "^" -> Math.pow(arg1, arg2);
            default -> throw new RuntimeException("Ошибка: неподдерживаемая операция");
        };
    }

    private static void checkArg(String partsZero, String partsTwo) {
        arg1 = Integer.parseInt(partsZero);
        arg2 = Integer.parseInt(partsTwo);
    }
}