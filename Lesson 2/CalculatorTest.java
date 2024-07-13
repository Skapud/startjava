import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Введите первое число");
        calculator.setArg1(scanner.nextInt());
        scanner.nextLine();
        while (calculator.isActive()) {
            System.out.println("Введите знак операции (+, -, *, /, ^, %):");
            calculator.setMathSign(scanner.nextLine());
            System.out.println("Введите второе число");
            calculator.setArg2(scanner.nextInt());
            calculator.calculate();
            System.out.println(calculator.getArg1() + " " + 
                    calculator.getMathSign() + " " + 
                    calculator.getArg2() + " = " + 
                    calculator.getResult());
            boolean validInput = false;
            do {
                switch (scanner.nextLine()) {
                    case "no":
                        calculator.setActive(false);
                        validInput = true;
                        return;
                    case "yes":
                        calculator.setActive(true);
                        validInput = true;
                        calculator.setArg1(calculator.getResult());
                        break;
                    default:
                        validInput = false;
                        break;
                }
                System.out.println("Хотите продолжить вычисления ? [yes/no]:");
            } while (!validInput);
        }
    }
}