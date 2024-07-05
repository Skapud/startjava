import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое натуральное число");
        int numFirst = scanner.nextInt();
        if (numFirst < 0) {
            System.out.println("Ошибка ввода, повторите заново");
            return;
        }
        System.out.println("Введите второе натуральное число");
        int numSecond = scanner.nextInt();
        if (numSecond < 0) {
            System.out.println("Ошибка ввода, повторите заново");
            return;
        }
        System.out.println("Введите математическую операцию: +, -, *, /, ^, %");
        scanner.nextLine();
        String signMath = scanner.nextLine();
        int result = 0;
        if (signMath.equals("+")) {
            result = numFirst + numSecond;
        } else if (signMath.equals("-")) {
            result = numFirst - numSecond;
        } else if (signMath.equals("*")) {
            result = numFirst * numSecond;
        } else if (signMath.equals("/")) {
            result = numFirst / numSecond;
        } else if (signMath.equals("^")) {
            for (int i = 1; i <= numSecond; i++) {
                if (i == 1) {
                    result = numFirst * 1;
                } else {
                    result = result * numFirst;
                }
            }
        } else if (signMath.equals("%")) {
            result = numFirst % numSecond;
        } else {
            System.out.println("Ошибка ввода, повторите заново");
            return;
        }

        System.out.println(numFirst + " " + signMath + " " + numSecond + " = " + result);
    }
}