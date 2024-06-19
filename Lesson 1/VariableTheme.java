public class VariableTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte numCpu = 8;
        System.out.println("Количество процессоров = "+ numCpu);
        short ram = 16384;
        System.out.println("Размер оперативной памяти = " + ram + "mb");
        int hdSize = 100;
        System.out.println("Размер жесткого диска = " + hdSize + "TB");
        long videoRam = 16;
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

        System.out.println("\n" + "3. Вывод слова JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");
    }
}