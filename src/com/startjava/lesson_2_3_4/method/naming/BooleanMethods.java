package com.startjava.lesson_2_3_4.method.naming;

public class BooleanMethods {
    public boolean shouldContinue() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> программа выполняется далее или завершается?");
        return false;
    }

    public boolean isFileDeleted() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> удалился ли файл на жестком диске или флешке?");
        return false;
    }

    public boolean hasUniqueNum() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> последовательность содержит уникальную цифру?");
        return false;
    }

    public boolean isLetter() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> пользователь ввел букву или что-то другое?");
        return false;
    }

    public boolean isEqualNums() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> в проверяемых числах, есть равные цифры?");
        return false;
    }

    public boolean hasAttempts() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> в игре 'Марио' остались попытки?");
        return false;
    }

    public boolean isEmptyInput() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> пользователь ввёл пустую строку или из одних пробелов?");
        return false;
    }

    public boolean hasEvenNums() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> на кубике, который бросил компьютер, выпало четное число?");
        return false;
    }

    public boolean isValidPath() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> путь до файла, который вы ищите на ssd, действительный?");
        return false;
    }

    public boolean isFileExist() {
        System.out.println(CurrentMethodNameUtil.get() + 
                "() -> файл по указанному адресу существует?");
        return false;
    }
}