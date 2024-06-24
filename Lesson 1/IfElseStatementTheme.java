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
        } else if (a == b) {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Проверка числа");
        int num = -9;
        if (num == 0) {
            System.out.println("Число равно нулю");
        } else {
            if ((num % 2 == 0) && (num > 0)) {
                System.out.println(num + " является четным и положителньым");
            } else if ((num % 2 == 0) && (num < 0)) {
                System.out.println(num + " является четным и отрицательным");
            } else if (num > 0) {
                System.out.println(num + " является нечетным и положительным");
            } else {
                System.out.println(num + " является нечетным и отрицательным");
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
        if ((ones1 != ones2) & (tens1 != tens2) & (hundreds1 != hundreds2)) {
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
    }
}