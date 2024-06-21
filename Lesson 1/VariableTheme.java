public class VariableTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte numCpu = 8;
        System.out.println("Количество процессоров = " + numCpu);
        short ramCapacity = 16384;
        System.out.println("Размер оперативной памяти = " + ramCapacity + "mb");
        int hdCapacity = 100;
        System.out.println("Размер жесткого диска = " + hdCapacity + "TB");
        long videoRam = 16L;
        System.out.println("Размер оперативной памяти видеокарты = " + videoRam + "GB");
        float freqCpuBase = 4.7f;
        System.out.println("Базова частота процессора = " + freqCpuBase + "GHz");
        double freqCpuMax = 5.35;
        System.out.println("Максимальная частота процессора = " + freqCpuMax + "GHz");
        char cpuNameMark = 'K';
        System.out.println("Маркировка названия процессора Intel = " + cpuNameMark);
        boolean hasEmptyRamSlots = true;
        System.out.println("Есть свободные слоты для оперативной памяти ? " + hasEmptyRamSlots);

        System.out.println("\n" + "2. Расчет стоимости товара со скидкой");
        float penPrice = 105.5f;
        double bookPrice = 235.83;
        float discountPercent = 0.11f;
        double totalPrice = penPrice + bookPrice;
        System.out.println("Стоимость товаров без скидки = " + totalPrice);
        double discountAmount = (penPrice + bookPrice) * discountPercent;
        System.out.println("Сумма скидки = " + discountAmount);
        double newTotalPrice = penPrice + bookPrice - discountAmount;
        System.out.println("Стоимость товаров со скидкой = " + newTotalPrice);

        System.out.println("\n" + "3. Вывод слова JAVA" + "\n    J    a  v     v  a" + 
                "\n    J   a a  v   v  a a" + "\n J  J  aaaaa  V V  aaaaa" + 
                "\n  JJ  a     a  V  a     a");

        System.out.println("\n" + "4. Вывод min и max значений целых числовых типов");
        byte num1 = 127;
        System.out.println("Изначальное num1 = " + num1 + "\nПосле инкремента num1 = " + 
                ++num1 + "\nПосле декремента num1 = " + --num1);
        short num2 = 32767;
        System.out.println("Изначальное num2 = " + num2 + "\nПосле инкремента num2 = " + 
                ++num2 + "\nПосле декремента num2 = " + --num2);
        int num3 = 2147483647;
        System.out.println("Изначальное num3 = " + num3 + "\nПосле инкремента num3 = " + 
                ++num3 + "\nПосле декремента num3 = " + --num3);
        long num4 = 9223372036854775807L;
        System.out.println("Изначальное num4 = " + num4 + "\nПосле инкремента num4 = " + 
                ++num4 + "\nПосле декремента num4 = " + --num4);

        System.out.println("\n" + "5. Перестановка значений переменных");
        int num5 = 2;
        int num6 = 5;
        System.out.println("С помощью третьей переменной" + "\nИсходные значения переменных:" + 
                "\nNum5 = " + num5 + "\nNum6 = " + num6);
        int num7 = num5;
        num5 = num6;
        num6 = num7;
        System.out.println("Новые значения переменных:\n" + 
                "Num5 = " + num5 + "\nNum6 = " + num6);
        System.out.println("С помощью арифметических операций" + "\nИсходные значения переменных:" + 
                "\nNum5 = " + num5 + "\nNum6 = " + num6);
        num5 = num5 + num6;
        num6 = num5 - num6;
        num5 = num5 - num6;
        System.out.println("Новые значения переменных:\n" + 
                "Num5 = " + num5 + "\nNum6 = " + num6);
        System.out.println("С помощью побитовой операции ^" + "\nИсходные значения переменных:" + 
                "\nNum5 = " + num5 + "\nNum6 = " + num6);
        num5 = 0 ^ num6;
        num6 = 7 ^ num5;
        System.out.println("Новые значения переменных:\n" + 
                "Num5 = " + num5 + "\nNum6 = " + num6);

        System.out.println("\n" + "6. Вывод символов и их кодов");
        char num8 = '$';
        char num9 = '*';
        char num10 = '@';
        char num11 = '|';
        char num12 = '~';
        System.out.println("Код символа " + "  Символ\n" + 
                Integer.toString(num8) + "            " + num8 + "\n" +
                Integer.toString(num9) + "            " + num9 + "\n" +
                Integer.toString(num10) + "            " + num10 + "\n" +
                Integer.toString(num11) + "           " + num11 + "\n" +
                Integer.toString(num12) + "           " + num12);

        System.out.println("\n" + "7. Вывод в консоль ASCII-арт Дюка");
        char num13 = '/';
        char num14 = '\\';
        char num15 = '_';
        char num16 = '(';
        char num17 = ')';
        System.out.println("    " + num13 + num14 + " \n" + "   " + num13 + "  " + 
                num14 + " \n" + "  " + num13 + num15 + num16 + " " + num17 + num14 + 
                " \n" + " " + num13 + "      " + num14 + " \n" + num13 + num15 + 
                num15 + num15 + num15 + num13 + num14 + num15 + num15 + num14);

        System.out.println("\n" + "8. Манипуляции с сотнями, десятками и единицами числа");
        System.out.println("Число 123 содержит:" + "\n сотен - " + 123 / 100 + 
                "\n десятков - " + 123 % 100 / 10 + "\n единиц - " + 123 % 120 + 
                "\nСумма разрядов = " + (123 / 100 + 123 % 100 / 10 + 123 % 120) + 
                "\nПроизведение разрядов = " + (123 / 100) * (123 % 100 / 10) * (123 % 120));

        System.out.println("\n" + "9. Перевод секунд в часы, минуты и секунды");
        System.out.println("Имеется 86399 сек" + "\nЭто " + 86399 / 3600 + ":" + 
                86399 % 3600 / 60 + ":" + 86399 % 3600 % 60);
    }
}