public class BooleanMethods {
    public boolean shouldContinue() {
        System.out.println(StaticMethodsHelper.getInitMethodName() + 
                "() -> программа выполняется далее или завершается?");
        return false;
    }

    public boolean isFileDeleted() {
        System.out.println(StaticMethodsHelper.getInitMethodName() + 
                "() -> удалился ли файл на жестком диске или флешке?");
        return false;
    }

    public boolean hasUniqueNum() {
        System.out.println(StaticMethodsHelper.getInitMethodName() + 
                "() -> последовательность содержит уникальную цифру?");
        return false;
    }

    public boolean isLetter() {
        System.out.println(StaticMethodsHelper.getInitMethodName() + 
                "() -> пользователь ввел букву или что-то другое?");
        return false;
    }

    public boolean isEqualNums() {
        System.out.println(StaticMethodsHelper.getInitMethodName() + 
                "() -> в проверяемых числах, есть равные цифры?");
        return false;
    }

    public boolean hasAttempts() {
        System.out.println(StaticMethodsHelper.getInitMethodName() + 
                "() -> в игре 'Марио' остались попытки?");
        return false;
    }

    public boolean isEmptyInput() {
        System.out.println(StaticMethodsHelper.getInitMethodName() + 
                "() -> пользователь ввёл пустую строку или из одних пробелов?");
        return false;
    }

    public boolean hasEvenNums() {
        System.out.println(StaticMethodsHelper.getInitMethodName() + 
                "() -> на кубике, который бросил компьютер, выпало четное число?");
        return false;
    }

    public boolean isValidPath() {
        System.out.println(StaticMethodsHelper.getInitMethodName() + 
                "() -> путь до файла, который вы ищите на ssd, действительный?");
        return false;
    }

    public boolean isFileExist() {
        System.out.println(StaticMethodsHelper.getInitMethodName() + 
                "() -> файл по указанному адресу существует?");
        return false;
    }
}