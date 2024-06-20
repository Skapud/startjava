public class VariableTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte numCpu = 8;
        System.out.println("Количество процессоров = " + numCpu);
        short ram = 16384;
        System.out.println("Размер оперативной памяти = " + ram + "mb");
        int hdCapacity = 100;
        System.out.println("Размер жесткого диска = " + hdCapacity + "TB");
        long videoRam = 16L;
        System.out.println("Размер оперативной памяти видеокарты = " + videoRam + "GB");
        float baseCpuFreq = 4.7f;
        System.out.println("Базова частота процессора = " + baseCpuFreq + "GHz");
        double maxCpuFreq = 5.35;
        System.out.println("Максимальная частота процессора = " + maxCpuFreq + "GHz");
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
        System.out.println("Исходные значения переменных:" + 
                "\nNum5 = " + num5 + "\nNum6 = " + num6);
        System.out.println("С помощью третьей переменной.");
        int num7 = num5;
        num5 = num6;
        num6 = num7;
        System.out.println("Новые значения переменных:\n" + 
                "Num5 = " + num5 + "\nNum6 = " + num6);
        System.out.println("С помощью арифметических операций.");
        System.out.println("Исходные значения переменных:" + 
                "\nNum5 = " + num5 + "\nNum6 = " + num6);
        num5 = num5 + num6;
        num6 = num5 - num6;
        num5 = num5 - num6;
        System.out.println("Новые значения переменных:\n" + 
                "Num5 = " + num5 + "\nNum6 = " + num6);
        System.out.println("С помощью побитовой операции ^");
        System.out.println("Исходные значения переменных:" + 
                "\nNum5 = " + num5 + "\nNum6 = " + num6);
        num5 = 0 ^ num6;
        num6 = 7 ^ num5;
        System.out.println("Новые значения переменных:\n" + 
                "Num5 = " + num5 + "\nNum6 = " + num6);
    }
}