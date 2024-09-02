package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static final int EXPECTED_MATH_EXPRESSION_LENGTH = 3;

    public static double calculate(String[] parts) {
        if (parts.length != EXPECTED_MATH_EXPRESSION_LENGTH) {
            throw new RuntimeException("Ошибка: математическое выражение " +
                    "должно состоять из двух чисел и одного знака");
        }
        int arg1 = checkArg(parts[0]);
        int arg2 = checkArg(parts[2]);
        String mathSign = parts[1];
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

    private static int checkArg(String part) {
        int arg;
        try {
            arg = Integer.parseInt(part);
        } catch (RuntimeException e) {
            throw new RuntimeException("Ошибка: введённые аргумент(ы) не являются числовыми");
        }
        return arg;
    }
}