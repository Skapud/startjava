import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariableTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte numCpu = 8;
        System.out.println("Количество процессоров = " + numCpu);
        short ramCapacity = 16384;
        System.out.println("Размер оперативной памяти = " + ramCapacity + "mb");
        int hdCapacity = 100;
        System.out.println("Размер жесткого диска = " + hdCapacity + "TB");
        long vram = 16L;
        System.out.println("Размер оперативной памяти видеокарты = " + vram + "GB");
        float freqCpuBase = 4.7f;
        System.out.println("Базова частота процессора = " + freqCpuBase + "GHz");
        double freqCpuMax = 5.35;
        System.out.println("Максимальная частота процессора = " + freqCpuMax + "GHz");
        char cpuNameMark = 'K';
        System.out.println("Маркировка названия процессора Intel = " + cpuNameMark);
        boolean hasEmptyRamSlots = true;
        System.out.println("Есть свободные слоты для оперативной памяти ? " + hasEmptyRamSlots);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        float penPrice = 105.5f;
        double bookPrice = 235.83;
        float discountPercent = 0.11f;
        double basePrice = penPrice + bookPrice;
        double discountAmount = basePrice * discountPercent;
        double discountPrice = basePrice - discountAmount;
        System.out.println("Стоимость товаров без скидки = " + basePrice);
        System.out.println("Сумма скидки = " + discountAmount);
        System.out.println("Стоимость товаров со скидкой = " + discountPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("    J    a  v     v  a" + 
                "\n    J   a a  v   v  a a" + 
                "\n J  J  aaaaa  V V  aaaaa" + 
                "\n  JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte extremesByteValue = 127;
        System.out.println("Изначальное num1 = " + extremesByteValue + 
                "\nПосле инкремента num1 = " + ++extremesByteValue +
                "\nПосле декремента num1 = " + --extremesByteValue);
        short extremesShortValue = 32767;
        System.out.println("Изначальное num2 = " + extremesShortValue +
                "\nПосле инкремента num2 = " + ++extremesShortValue + 
                "\nПосле декремента num2 = " + --extremesShortValue);
        int extremesIntValue = 2147483647;
        System.out.println("Изначальное num3 = " + extremesIntValue + 
                "\nПосле инкремента num3 = " + ++extremesIntValue + 
                "\nПосле декремента num3 = " + --extremesIntValue);
        long extremesLongValue = 9223372036854775807L;
        System.out.println("Изначальное num4 = " + extremesLongValue + 
                "\nПосле инкремента num4 = " + ++extremesLongValue + 
                "\nПосле декремента num4 = " + --extremesLongValue);
        char extremesCharValue = 65535;
        System.out.println("Изначальное num5 = " + (int) extremesCharValue + 
                "\nПосле инкремента num5 = " + (int) ++extremesCharValue + 
                "\nПосле декремента num5 = " + (int) --extremesCharValue);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("С помощью третьей переменной" + 
                "\nИсходные значения переменных:" + 
                "\na = " + a + "\nb = " + b);
        int swap = a;
        a = b;
        b = swap;
        System.out.println("Новые значения переменных:" + 
                "\na = " + a + "\nb = " + b);
        System.out.println("С помощью арифметических операций" + 
                "\nИсходные значения переменных:" + 
                "\na = " + a + "\nb = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Новые значения переменных:\n" + 
                "a = " + a + "\nb = " + b);
        System.out.println("С помощью побитовой операции ^" + 
                "\nИсходные значения переменных:" + 
                "\na = " + a + "\nb = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Новые значения переменных:\n" + 
                "a = " + a + "\nb = " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char at = '@';
        char barVertical = '|';
        char tilde = '~';
        System.out.println("Код символа " + "  Символ\n" + 
                (int) dollar + "            " + dollar + "\n" +
                (int) asterisk + "            " + asterisk + "\n" +
                (int) at + "            " + at + "\n" +
                (int) barVertical + "           " + barVertical + "\n" +
                (int) tilde + "           " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char parenthesisLeft = '(';
        char parenthesisRight = ')';
        System.out.println("    " + slash + backslash + 
                " \n" + "   " + slash + "  " + backslash + 
                " \n" + "  " + slash + underscore + parenthesisLeft + " " + parenthesisRight + 
                backslash + 
                " \n" + " " + slash + "      " + backslash + 
                " \n" + slash + underscore + underscore + underscore + underscore + slash + 
                backslash + underscore + underscore + backslash);

        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа");
        int hundreds = 123 / 100;
        int tens = 123 % 100 / 10;
        int ones = 123 % 120;
        System.out.println("Число 123 содержит:" + 
                "\n сотен - " + hundreds + 
                "\n десятков - " + tens + 
                "\n единиц - " + ones + 
                "\nСумма разрядов = " + (hundreds + tens + ones) + 
                "\nПроизведение разрядов = " + hundreds * tens * ones);

        System.out.println("\n9. Перевод секунд в часы, минуты и секунды");
        int hours = 86399 / 3600;
        int minutes = 86399 % 3600 / 60;
        int seconds = 86399 % 60;
        System.out.println("Имеется 86399 сек" + 
                "\nЭто " + hours + ":" + minutes + ":" + seconds);

        System.out.println("\n10. Расчет стоимости товара со скидкой");
        var penPriceDecimal = new BigDecimal("105.5");
        var bookPriceDecimal = new BigDecimal("235.83");
        var discountPercentDecimal = new BigDecimal("0.11");
        var basePriceDecimal = penPriceDecimal.add(bookPriceDecimal);
        var discountAmountDecimal = basePriceDecimal.multiply(discountPercentDecimal)
                .setScale(2, RoundingMode.HALF_UP);
        var discountPriceDecimal = basePriceDecimal.subtract(discountAmountDecimal);
        System.out.println("Стоимость товаров без скидки = " + basePriceDecimal);
        System.out.println("Сумма скидки = " + discountAmountDecimal);
        System.out.println("Стоимость товаров со скидкой = " + discountPriceDecimal);
    }
}