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
        System.out.println("    J    a  v     v  a\n" + 
                "    J   a a  v   v  a a\n" + 
                " J  J  aaaaa  V V  aaaaa\n" + 
                "  JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte extremesByteValue = 127;
        System.out.println("Изначальное значение = " + extremesByteValue + 
                "\nПосле инкремента = " + ++extremesByteValue +
                "\nПосле декремента = " + --extremesByteValue);
        short extremesShortValue = 32767;
        System.out.println("Изначальное значение = " + extremesShortValue +
                "\nПосле инкремента = " + ++extremesShortValue + 
                "\nПосле декремента = " + --extremesShortValue);
        int extremesIntValue = 2147483647;
        System.out.println("Изначальное значение = " + extremesIntValue + 
                "\nПосле инкремента = " + ++extremesIntValue + 
                "\nПосле декремента = " + --extremesIntValue);
        long extremesLongValue = 9223372036854775807L;
        System.out.println("Изначальное значение = " + extremesLongValue + 
                "\nПосле инкремента = " + ++extremesLongValue + 
                "\nПосле декремента = " + --extremesLongValue);
        char extremesCharValue = 65535;
        System.out.println("Изначальное значение = " + (int) extremesCharValue + 
                "\nПосле инкремента = " + (int) ++extremesCharValue + 
                "\nПосле декремента = " + (int) --extremesCharValue);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("Исходные значения переменных:\n" + 
                "a = " + a + " b = " + b + "\n" + 
                "С помощью третьей переменной");
        int swap = a;
        a = b;
        b = swap;
        System.out.println("Новые значения переменных:\n" + 
                "a = " + a + " b = " + b);
        System.out.println("С помощью арифметических операций");
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Новые значения переменных:\n" + 
                "a = " + a + " b = " + b);
        System.out.println("С помощью побитовой операции ^");
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Новые значения переменных:\n" + 
                "a = " + a + " b = " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println("Код символа   Символ\n" + 
                (int) dollar + "            " + dollar + "\n" +
                (int) asterisk + "            " + asterisk + "\n" +
                (int) atSign + "            " + atSign + "\n" +
                (int) verticalBar + "           " + verticalBar + "\n" +
                (int) tilde + "           " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backslash + " \n   " + slash + 
                "  " + backslash + " \n  " + slash + underscore + 
                leftParenthesis + " " + rightParenthesis + backslash + " \n " + 
                slash + "      " + backslash + " \n" + slash + 
                underscore + underscore + underscore + underscore + slash + 
                backslash + underscore + underscore + backslash);

        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа");
        int srcNum = 987;
        int hundreds = srcNum / 100;
        int tens = srcNum % 100 / 10;
        int ones = srcNum % 10;
        System.out.println("Число " + srcNum + " содержит:" + 
                "\n сотен - " + hundreds + 
                "\n десятков - " + tens + 
                "\n единиц - " + ones + 
                "\nСумма разрядов = " + (hundreds + tens + ones) + 
                "\nПроизведение разрядов = " + hundreds * tens * ones);

        System.out.println("\n9. Перевод секунд в часы, минуты и секунды");
        int srcSec = 86399;
        int hh = srcSec / 3600;
        int mm = srcSec % 3600 / 60;
        int ss = srcSec % 60;
        System.out.println("Имеется " + srcSec + " сек" + 
                "\nЭто " + hh + ":" + mm + ":" + ss);

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