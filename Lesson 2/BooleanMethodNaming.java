public class BooleanMethodNaming {

    public boolean shouldContinue() {
        MethodUtils.methodName();
        System.out.println(MethodUtils.methodName() + 
                "() -> программа выполняется далее или завершается?");
        return false;
    }

    public boolean isFileDeleted() {
        System.out.println(MethodUtils.methodName() + 
                "() -> удалился ли файл на жестком диске или флешке?");
        return false;
    }

    public boolean hasUniqueNum() {
        System.out.println(MethodUtils.methodName() + 
                "() -> последовательность содержит уникальную цифру?");
        return false;
    }

    public boolean hasLetterInput() {
        System.out.println(MethodUtils.methodName() + 
                "() -> пользователь ввел букву или что-то другое?");
        return false;
    }

    public boolean hasEqualNums() {
        System.out.println(MethodUtils.methodName() + 
                "() -> в проверяемых числах, есть равные цифры?");
        return false;
    }

    public boolean isExtraLives() {
        System.out.println(MethodUtils.methodName() + 
                "() -> в игре 'Марио' остались попытки?");
        return false;
    }

    public boolean isEmptyInput() {
        System.out.println(MethodUtils.methodName() + 
                "() -> пользователь ввёл пустую строку или из одних пробелов?");
        return false;
    }

    public boolean hasEvenNums() {
        System.out.println(MethodUtils.methodName() + 
                "() -> на кубике, который бросил компьютер, выпало четное число?");
        return false;
    }

    public boolean isValidPath() {
        System.out.println(MethodUtils.methodName() + 
                "() -> путь до файла, который вы ищите на ssd, действительный?");
        return false;
    }

    public boolean isFileExist() {
        System.out.println(MethodUtils.methodName() + 
                "() -> файл по указанному адресу существует?");
        return false;
    }
}