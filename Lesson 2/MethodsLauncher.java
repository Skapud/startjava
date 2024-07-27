public class MethodsLauncher {
    public static void main(String[] args) {
        MethodsLauncher caller = new MethodsLauncher();
        caller.startNonBoolean();
        System.out.println();
        caller.startBoolean();
    }

    public void startNonBoolean() {
        NonBooleanMethods nonBm = new NonBooleanMethods();
        nonBm.chooseMenu();
        nonBm.calculateAverageGrades();
        nonBm.calculateUniqueWords();
        nonBm.printError();
        nonBm.syncData();
        nonBm.restoreBackup();
        nonBm.pauseDownload();
        nonBm.resetSettings();
        nonBm.writeFilesUSB();
        nonBm.convertCelsiusToFahrenheit();
        nonBm.inputMathExpression();
        nonBm.findWinnerNFS();
        nonBm.findBookAuthorsName();
    }

    public void startBoolean() {
        BooleanMethods bm = new BooleanMethods();
        System.out.println(bm.shouldContinue());
        System.out.println(bm.isFileDeleted());
        System.out.println(bm.hasUniqueNum());
        System.out.println(bm.isLetter());
        System.out.println(bm.isEqualNums());
        System.out.println(bm.hasAttempts());
        System.out.println(bm.isEmptyInput());
        System.out.println(bm.hasEvenNums());
        System.out.println(bm.isValidPath());
        System.out.println(bm.isFileExist());
    }
}