public class Fire {
    public boolean shouldContinue() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        boolean result = false;
        System.out.println(methodName + 
                "() -> программа выполняется далее или завершается? " + 
                result);
        return result;
    }

    public boolean isFileDeleted() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        boolean result = false;
        System.out.println(methodName + 
                "() -> удалился ли файл на жестком диске или флешке? " + 
                result);
        return result;
    }

    public boolean hasUniqueNum() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        boolean result = false;
        System.out.println(methodName + 
                "() -> последовательность содержит уникальную цифру? " + 
                result);
        return result;
    }

    public boolean hasLetterInput() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        boolean result = false;
        System.out.println(methodName + 
                "() -> пользователь ввел букву или что-то другое? " + 
                result);
        return result;
    }

    public boolean hasEqualNums() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        boolean result = false;
        System.out.println(methodName + 
                "() -> в проверяемых числах, есть равные цифры? " + 
                result);
        return result;
    }

    public boolean isExtraLives() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        boolean result = false;
        System.out.println(methodName + 
                "() -> в игре 'Марио' остались попытки? " + 
                result);
        return result;
    }

    public boolean isEmptyInput() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        boolean result = false;
        System.out.println(methodName + 
                "() -> пользователь ввёл пустую строку или из одних пробелов? " + 
                result);
        return result;
    }

    public boolean hasEvenNums() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        boolean result = false;
        System.out.println(methodName + 
                "() -> на кубике, который бросил компьютер, выпало четное число? " +
                result);
        return result;
    }

    public boolean isValidPath() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        boolean result = false;
        System.out.println(methodName + 
                "() -> путь до файла, который вы ищите на ssd, действительный? " + 
                result);
        return result;
    }

    public boolean isFileExist() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        boolean result = false;
        System.out.println(methodName + 
                "() -> файл по указанному адресу существует? " + 
                result);
        return result;
    }
}