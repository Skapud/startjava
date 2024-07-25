public class MethodCalling {
    public static void main(String[] args) {
        MethodNaming first = new MethodNaming();
        BooleanMethodNaming second = new BooleanMethodNaming();
        MethodCalling caller = new MethodCalling();
        caller.startFirst(first);
        System.out.println();
        caller.startSecond(second);
    }

    public void startFirst(MethodNaming first) {
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

    public void startSecond(BooleanMethodNaming second) {
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