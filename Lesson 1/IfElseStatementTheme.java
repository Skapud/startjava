import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        String gender = "male";
        if (gender != "male") {
            System.out.println("Пол игрока: женский");
        } else {
            System.out.println("Пол игрока: мужской");
        }
        int age = 19;
        if (age > 18) {
            System.out.println("Игроку больше 18 лет");
        } else {
            System.out.println("Игроку меньше 18 лет");
        }
        double height = 1.87;
        if (height < 1.8) {
            System.out.println("Рост игрока менее 1.8 м");
        } else {
            System.out.println("Рост игрока более 1.8 м");
        }
        String name = "Andrew";
        char firstLetterName = name.charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Загаданное имя игрока начинается на: " + firstLetterName);
        } else if (firstLetterName == 'I') {
            System.out.println("Загаданное имя игрока начинается на: " + firstLetterName);
        } else {
            System.out.println("Загаданное имя начинается на неизвестную букву");
        } 

        System.out.println("\n2. Поиск большего числа");
        int a = 145289;
        int b = 145289;
        if (a > b) {
            System.out.println("Число " + a + " больше числа " + b);
        } else if (a < b) {
            System.out.println("Число " + b + " больше числа " + a);
        } else {
            System.out.println("Числа " + a + " и " + b + " равны");
        }

        System.out.println("\n3. Проверка числа");
        int num = 11;
        if (num == 0) {
            System.out.println("Число равно нулю");
        } else {
            if (num > 0) {
                System.out.print(num + " является положительным");
            } else {
                System.out.print(num + " является отрицательным");
            }
            if (num % 2 == 0) {
                System.out.print(" и четным\n");
            } else {
                System.out.print(" и нечетным\n");
            }
        }

        System.out.println("\n4. Поиск одинаковых чисел в цифрах");
        int num1 = 123;
        int num2 = 223;
        int ones1 = num1 % 10;
        int ones2 = num2 % 10;
        int tens1 = num1 % 100 / 10;
        int tens2 = num2 % 100 / 10;
        int hundreds1 = num1 / 100;
        int hundreds2 = num2 / 100;
        if ((ones1 != ones2) && (tens1 != tens2) && (hundreds1 != hundreds2)) {
            System.out.println("Равных чисел нет");
        } else { 
            System.out.println("Исходные числа: \n" + num1 + " и " + num2 + 
                    "\nОдинаковые в них цифры: ");
            if (ones1 == ones2) {
                System.out.println(ones1 + " - номер разряда 1");
            }
            if (tens1 == tens2) {
                System.out.println(tens1 + " - номер разряда 2");
            }
            if (hundreds1 == hundreds2) {
                System.out.println(hundreds1 + " - номер разряда 3");
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char searchedChar = '\u0031';
        if (Character.isLowerCase(searchedChar)) {
            System.out.println(searchedChar + " - маленькая буква");
        } else if (Character.isUpperCase(searchedChar)) {
            System.out.println(searchedChar + " - большая буква");
        } else if (Character.isDigit(searchedChar)) {
            System.out.println(searchedChar + " - цифра");
        } else {
            System.out.println(searchedChar + " - ни буква и ни цифра");
        }

        System.out.println("\n6. Подсчет начисленных банком %");
        double depositInitial = 321123.59;
        double rate = 0.05;
        System.out.println("Сумма вклада : " + depositInitial);
        if ((depositInitial >= 100000) && (depositInitial < 300000)) {
            rate = 0.07;
        } else if (depositInitial >= 300000) {
            rate = 0.1;
        }
        double interestAmount = depositInitial * rate;
        double depositFinal = depositInitial + interestAmount;
        System.out.println("Сумма начисленного % : " + interestAmount + 
                    "\nИтоговая сумма с % :" + depositFinal);

        System.out.println("\n7. Определение оценки по предметам");
        double historyPercent = 0.59;
        int historyGrade = 2;
        if (historyPercent > 0.91) {
            historyGrade = 5;
        } else if (historyPercent > 0.73) {
            historyGrade = 4;
        } else if (historyPercent > 0.6) {
            historyGrade = 3;
        }
        double programmingPercent = 0.92;
        int programmingGrade = 5;
        if (programmingPercent <= 0.6) {
            programmingGrade = 2;
        } else if (programmingPercent < 0.73) {
            programmingGrade = 3;
        } else if (programmingPercent < 0.91) {
            programmingGrade = 4;
        } 
        System.out.println("История - " + historyGrade);
        System.out.println("Программирование - " + programmingGrade);
        double averageGrade = (historyGrade + programmingGrade) / 2;
        double averagePercent = (historyPercent + programmingPercent) / 2 * 100;
        System.out.println("Средний балл - " + averageGrade);
        System.out.println("Средний % по предметам - " + averagePercent + "%");

        System.out.println("\n8. Расчет годовой прибыли");
        double incomeMonth = 13025.233;
        double rentMonth = 5123.018;
        double productionCostMonth = 9001.729;
        double incomeYear = (incomeMonth - rentMonth - productionCostMonth) * 12;
        if (incomeYear > 0) {
            System.out.println("Прибыль за год: +" + incomeYear + " руб.");
        } else {
            System.out.println("Прибыль за год: " + incomeYear + " руб.");
        }

        System.out.println("\n9. Подсчет начисленных банком % со *");
        var depositInitial1 = BigDecimal.valueOf(321123.59);
        System.out.println("Сумма вклада : " + depositInitial1);
        var rate1 = BigDecimal.valueOf(0.1);
        if (depositInitial1.compareTo(BigDecimal.valueOf(100000)) < 0) {
            rate1 = BigDecimal.valueOf(0.05);
        } else if (depositInitial1.compareTo(BigDecimal.valueOf(100000)) >= 0 && 
                depositInitial1.compareTo(BigDecimal.valueOf(300000)) < 0) {
            rate1 = BigDecimal.valueOf(0.07);
        }
        var interestAmount1 = depositInitial1.multiply(rate1)
                .setScale(2, RoundingMode.HALF_UP);
        var depositFinal1 = depositInitial1.add(interestAmount1)
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println("Сумма начисленного % : " + interestAmount1 + 
                    "\nИтоговая сумма с % :" + depositFinal1);

        System.out.println("\n10. Расчет годовой прибыли со *");
        var incomeMonth1 = BigDecimal.valueOf(13025.233);
        var rentmonth1 = BigDecimal.valueOf(5123.018);
        var productionCostMonth1 = BigDecimal.valueOf(9001.729);
        var incomeYear1 = incomeMonth1.subtract(rentmonth1)
                .subtract(productionCostMonth1)
                .multiply(BigDecimal.valueOf(12))
                .setScale(2, RoundingMode.HALF_UP);
        if (incomeYear1.compareTo(BigDecimal.ZERO) > 0) {
            System.out.printf("Прибыль за год: +" + incomeYear1 + " руб.");
        } else {
            System.out.printf("Прибыль за год: " + incomeYear1 + " руб.");
        }
    }
}