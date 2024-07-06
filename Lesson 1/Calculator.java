import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое натуральное число");
        int x = scanner.nextInt();
        if (x < 0) {
            System.out.println("Ошибка ввода, повторите заново");
            return;
        }
        System.out.println("Введите математическую операцию: +, -, *, /, ^, %");
        scanner.nextLine();
        String signMath = scanner.nextLine();
        System.out.println("Введите второе натуральное число");
        int y = scanner.nextInt();
        if (y < 0) {
            System.out.println("Ошибка ввода, повторите заново");
            return;
        }
        int result = 0;
        if (signMath.equals("+")) {
            result = x + y;
        } else if (signMath.equals("-")) {
            result = x - y;
        } else if (signMath.equals("*")) {
            result = x * y;
        } else if (signMath.equals("/")) {
            result = x / y;
        } else if (signMath.equals("^")) {
            if (y == 0) {
                result = 1;
            } else {
                result = x;
                for (int i = 2; i <= y; i++) {
                    result *= x;
                }
            }
        } else if (signMath.equals("%")) {
            result = x % y;
        } else {
            System.out.println("Ошибка ввода, повторите заново");
            return;
        }
        System.out.println(x + " " + signMath + " " + y + " = " + result);
    }
}