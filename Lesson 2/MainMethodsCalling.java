public class MainMethodsCalling {
    public static void main(String[] args) {
        MainMethodsCalling caller = new MainMethodsCalling();
        caller.startNotBoolean();
        System.out.println();
        caller.startBoolean();
    }

    public void startNotBoolean() {
        NotBooleanMethods first = new NotBooleanMethods();
        first.chooseMenu();
        first.calculateAverage();
        first.calculateUniqueWords();
        first.printError();
        first.syncData();
        first.restoreData();
        first.pauseDownload();
        first.resetSettings();
        first.burnFiles();
        first.convertTemperature();
        first.enterMath();
        first.findWinner();
        first.findBook();
    }

    public void startBoolean() {
        BooleanMethods second = new BooleanMethods();
        System.out.println(second.shouldContinue());
        System.out.println(second.isFileDeleted());
        System.out.println(second.hasUniqueNum());
        System.out.println(second.hasLetterInput());
        System.out.println(second.hasEqualNums());
        System.out.println(second.isExtraLives());
        System.out.println(second.isEmptyInput());
        System.out.println(second.hasEvenNums());
        System.out.println(second.isValidPath());
        System.out.println(second.isFileExist());
    }
}