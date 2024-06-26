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
            System.out.println("Рост игрока менее 1.8м");
        } else {
            System.out.println("Рост игрока более 1.8м");
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
            if (num % 2 == 0) {
                if (num > 0) {
                    System.out.println(num + " является четным и положителньым");
                } else {
                    System.out.println(num + " является четным и отрицательным");
                }
            } else {
                if (num < 0) {
                    System.out.println(num + " является нечетным и отрицательным");
                } else {
                    System.out.println(num + " является нечетным и положительным");
                }
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
        char sym = '\u0031';
        if (Character.isLetter(sym)) {
            if (Character.isLowerCase(sym)) {
                System.out.println(sym + " - маленькая буква");
            } else {
                System.out.println(sym + " - большая буква");
            }
        } else if (Character.isDigit(sym)) {
            System.out.println(sym + " - цифра");
        } else {
            System.out.println(sym + " - ни буква и ни цифра");
        }

        System.out.println("\n6. Подсчет начисленных банком %");
        double depositInitial = 321123.59;
        double rate;
        System.out.println("Суммка вклада : " + depositInitial);
        if (depositInitial < 100000) {
            rate = 0.05;
        } else if ((depositInitial >= 100000) && (depositInitial < 300000)) {
            rate = 0.07;
        } else {
            rate = 0.1;
        }
        double interestAmount = depositInitial * rate;
        double depositFinal = depositInitial + interestAmount;
        System.out.println("Сумма начисленного % : " + interestAmount + 
                    "\nИтоговая сумма с % :" + depositFinal);

        System.out.println("\n7. Определение оценки по предметам");
        double history = 0.59;
        double programming = 0.92;
        int historyScore;
        int programmingScore;
        if (history > 0.91) {
            historyScore = 5;
        } else if (history > 0.73) {
            historyScore = 4;
        } else if (history > 0.6) {
            historyScore = 3;
        } else {
            historyScore = 2;
        }
        if (programming > 0.91) {
            programmingScore = 5;
        } else if (programming > 0.73) {
            programmingScore = 4;
        } else if (programming > 0.6) {
            programmingScore = 3;
        } else {
            programmingScore = 2;
        }
        System.out.println("История - " + historyScore);
        System.out.println("Программирование - " + programmingScore);
        double averageScore = (historyScore + programmingScore) / 2;
        double averagePercent = (history + programming) / 2 * 100;
        System.out.println("Средний балл - " + averageScore);
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
        var depositInitial1 = new BigDecimal("321123.59");
        System.out.println("Суммка вклада : " + depositInitial1);
        var rate1 = new BigDecimal("0");
        if (depositInitial1.compareTo(new BigDecimal(100000)) < 0) {
            rate1 = new BigDecimal("0.05");
        } else if (depositInitial1.compareTo(new BigDecimal(100000)) > 0 && 
                depositInitial1.compareTo(new BigDecimal(300000)) < 0) {
            rate1 = new BigDecimal("0.07");
        } else {
            rate1 = new BigDecimal("0.1");
        }
        var interestAmount1 = depositInitial1.multiply(rate1)
                .setScale(2, RoundingMode.HALF_UP);
        var depositFinal1 = depositInitial1.add(interestAmount1)
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println("Сумма начисленного % : " + interestAmount1 + 
                    "\nИтоговая сумма с % :" + depositFinal1);

        System.out.println("\n10. Расчет годовой прибыли со *");
        var incomeMonth1 = new BigDecimal("13025.233");
        var rentmonth1 = new BigDecimal("5123.018");
        var productionCostMonth1 = new BigDecimal("9001.729");
        var incomeYear1 = incomeMonth1.subtract(rentmonth1).subtract(
                productionCostMonth1).multiply(new BigDecimal("12"))
                .setScale(2, RoundingMode.HALF_UP);
        if (incomeYear1.compareTo(new BigDecimal(0)) > 0) {
            System.out.printf("Прибыль за год: +" + incomeYear1 + " руб.");
        } else {
            System.out.printf("Прибыль за год: " + incomeYear1 + " руб.");
        }
    }
}