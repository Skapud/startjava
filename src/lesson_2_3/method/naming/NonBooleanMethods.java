package startjava.lesson_2_3.method.naming;

public class NonBooleanMethods {
    public void searchLongestWord() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> найти самое длинное слово в предложении из книги по Java");
    }

    public void chooseMenu() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> выбрать пункт меню в текстовом редакторе на macOS");
    }

    public void calculateAverageGrades() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> вычислить среднее значение оценок в школе №1234");
    }

    public void calculateUniqueWords() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> подсчитать количество уникальных слов в 'Война и Мир'");
    }

    public void printError() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> вывести сообщение об ошибке");
    }

    public void syncData() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> синхронизировать данные с облачным хранилищем");
    }

    public void restoreBackup() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> восстановить данные из резервной копии от 11.03.2024");
    }

    public void pauseDownload() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> приостановить загрузку mp3-файла группы 'Ария'");
    }

    public void resetSettings() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> сбросить настройки до заводских для пылесоса Mi");
    }

    public void writeFilesUsb() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> записать содержимое в файл по указанному пути на флешку");
    }

    public void convertCelsiusToFahrenheit() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> преобразовать температуру из Цельсия в Фаренгейт");
    }

    public void inputMathExpression() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> ввести математическое выражение с тремя аргументами");
    }

    public void findWinnerNfs() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> выявить победителя среди гонщиков игры 'Need For Speed'");
    }

    public void findBookAuthorsName() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> найти книгу по имени писателя");
    }
}