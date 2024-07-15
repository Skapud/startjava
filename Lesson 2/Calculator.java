public class Calculator {
    private double arg1;
    private String mathSign;
    private double arg2;
    private double result;
    private String validInput;

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

    public String getValidInput() {
        return validInput;
    }

    public void setValidInput(String validInput) {
        this.validInput = validInput;
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
                if (arg2 == 0) {
                    result = 1;
                } else {
                    result = arg1 * arg2;
                } 
                break;
            case "/":
                if (arg2 == 0) {
                    throw new IllegalArgumentException("Ошибка: деление на ноль запрещено");
                }
                result = arg1 / arg2;
                break;
            case "^":
                result = 1;
                for (int i = 1; i <= Math.abs(arg2); i++) {
                    result *= arg1;
                }
                if (arg2 < 0) {
                    result = 1 / result;
                }
                break;
            case "%":
                result = arg1 % arg2;
                break;
            default:
                throw new IllegalArgumentException("Ошибка: операция '" + 
                        mathSign + "' не поддерживается." + 
                        "\nДоступны следующие операции: +, -, *, /, ^, % +"); 
        }
    }
}