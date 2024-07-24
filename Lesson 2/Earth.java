public class Earth {
    public static void main(String[] args) {
        Water water = new Water();
        Fire fire = new Fire();
        Earth earth = new Earth();
        earth.startWater(water);
        System.out.println();
        earth.startFire(fire);
    }

    public void startWater(Water water) {
        water.chooseMenu();
        water.calculateAverage();
        water.calculateUniqueWords();
        water.printError();
        water.syncData();
        water.restoreData();
        water.pauseDownload();
        water.resetSettings();
        water.burnFiles();
        water.convertTemperature();
        water.enterMath();
        water.findWinner();
        water.findBook();
    }

    public void startFire(Fire fire) {
        fire.shouldContinue();
        fire.isFileDeleted();
        fire.hasUniqueNum();
        fire.hasLetterInput();
        fire.hasEqualNums();
        fire.isExtraLives();
        fire.isEmptyInput();
        fire.hasEvenNums();
        fire.isValidPath();
        fire.isFileExist();
    }
}