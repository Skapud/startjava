public class Calculator {
    private double arg1;
    private String mathSign;
    private double arg2;
    private double result;
    private boolean active = true;

    public void calculate() {
        switch (this.mathSign) {
            case "+":
                this.result = this.arg1 + this.arg2;
                break;
            case "-":
                this.result = this.arg1 - this.arg2;
                break;
            case "*":
                if (this.arg2 == 0) {
                    this.result = 1;
                } else {
                    this.result = this.arg1 * this.arg2;
                } 
                break;
            case "/":
                if (this.arg2 == 0) {
                    throw new IllegalArgumentException("Ошибка: деление на ноль запрещено");
                }
                this.result = this.arg1 / this.arg2;
                break;
            case "^":
                this.result = 1;
                for (int i = 1; i <= Math.abs(this.arg2); i++) {
                    this.result = this.result * this.arg1;
                }
                if (this.arg2 < 0) {
                    this.result = 1 / this.result;
                }
                break;
            case "%":
                this.result = this.arg1 % this.arg2;
                break;
            default:
                throw new IllegalArgumentException("Ошибка: операция '" + 
                        this.mathSign + "' не поддерживается." + 
                        "\nДоступны следующие операции: +, -, *, /, ^, % +"); 
        }
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

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}