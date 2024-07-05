public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int rangeMin = -10;
        int rangeMax = 21;
        int rangeStep = rangeMin;
        int sumEvenNums = 0;
        int sumOddNums = 0;
        do {
            if (rangeStep % 2 == 0) {
                sumEvenNums += rangeStep;
            } else {
                sumOddNums += rangeStep;
            }
            rangeStep++;
        } while (rangeStep <= rangeMax);
        System.out.println("В отрезке [" + rangeMin + "," + rangeMax + 
                "] сумма четных чисел = " + sumEvenNums + ", а нечетных = " + sumOddNums);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int numMin = num3;
        int numMax = num1;
        if (num1 < numMin) {
            numMin = num1;
        } else if (num2 < numMin) {
            numMin = num2;
        }
        if (num2 > numMax) {
            numMax = num2;
        } else if (num3 > numMax) {
            numMax = num3;
        }
        for (--numMax; numMax > numMin; numMax--) {
            System.out.print(numMax + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int digitSum = 0;
        System.out.print("Исходное число " + srcNum + " в обратном порядке : ");
        while (srcNum > 0) {
            int digit = srcNum % 10;
            System.out.print(digit);
            digitSum += digit;
            srcNum /= 10;
        }
        System.out.println("\nСумма выделенных цифр: " + digitSum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int i;
        for (i = 1; i <= 23; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i <= 23) {
                    if (i % 2 != 0) {
                        System.out.printf("%2d ", i);
                    } else {
                        j--;    
                    }    
                } else {
                    System.out.print("00 ");
                }
                i++;
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        srcNum = 3242592;
        int srcNumCopy = srcNum;
        int countTwos = 0;
        while (srcNumCopy > 0) {
            if (srcNumCopy % 10 == 2) {
                countTwos++;
            }
            srcNumCopy /= 10;
        }
        System.out.print("В " + srcNum);
        if (countTwos % 2 == 0) {
            System.out.print(" четное (");
        } else {
            System.out.print(" нечетное (");
        }
        System.out.print(countTwos + ") количество двоек\n");

        System.out.println("\n6. Вывод геометрических фигур");
        for (i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        int line = 5;
        int count = 5;
        while (line != 0) {
            while (count > 0) {
                System.out.print("#");
                count -= 1;
            }
            System.out.println();
            line--;
            count = line;
        }

        System.out.println();
        line = 1;
        count = 0;
        int limitSigns = 0;
        do {
            if (line < 4) {
                limitSigns = line;
            } else {
                limitSigns = 6 - line;
            } 
            do {
                System.out.print("$");
                count++;
            } while (count < limitSigns);
            System.out.println();
            count = 0;
            line++;
        } while (line < 6);

        System.out.println("\n7. Вывод ASCII-символов");
        System.out.println("DECIMAL   " + "CHARACTER   " + "DESCRIPTION");
        for (i = 33; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("%2s%-12d%-13s%-15s%n", "", i, (char) i, Character.getName(i));
            }
        }
        for (i = 98; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%2s%-12d%-13s%-15s%n", "", i, (char) i, Character.getName(i));
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        srcNum = 1234321;
        int palindromeCheck = srcNum;
        int palindromeCheckResult = 0;
        int numReverseLastDigit = 0;
        do {
            numReverseLastDigit = palindromeCheck % 10;
            palindromeCheckResult = palindromeCheckResult * 10 + numReverseLastDigit;
            palindromeCheck /= 10;
        } while (palindromeCheck % 10 != 0);
        System.out.print("Число " + srcNum);
        if (srcNum == palindromeCheckResult) {
            System.out.print(" - палиндром\n");
        } else {
            System.out.print(" - не палиндром\n");
        }

        System.out.println("\n9.Проверка, является ли число счастливым");
        srcNum = 483843;
        int numHappyCheck = srcNum;
        int sumRightHalf = 0;
        int sumLeftHalf = 0;
        int digitsRightSide = 0;
        int digitsLeftSide = 0;
        for (i = 1; i <= 6; i++) {
            if (i < 4) {
                sumRightHalf += numHappyCheck % 10;
                digitsRightSide = digitsRightSide * 10 + numHappyCheck % 10;
            } else {
                sumLeftHalf += numHappyCheck % 10;
                digitsLeftSide = digitsLeftSide * 10 + numHappyCheck % 10;
            }
            numHappyCheck = numHappyCheck / 10;
        }
        System.out.print("Число " + srcNum);
        if (sumLeftHalf == sumRightHalf) {
            System.out.print(" - счастливое\n");
        } else {
            System.out.print(" - не счастливое\n");
        }
        System.out.println("Сумма цифр " + digitsLeftSide + " = " + sumLeftHalf);
        System.out.println("Сумма цифр " + digitsRightSide + " = " + sumRightHalf);

        System.out.println("\n10.Вывод таблицы умножения Пифагора");
        for (i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if ((j == 1) && (i == 1)) {
                    System.out.print("  |");
                } else if (j == 1) {
                    System.out.print(i + " |");
                } else {
                    System.out.printf("%3s", i * j);
                }
                if ((j == 9) && (i == 1)) {
                    System.out.print("\n---------------------------");
                }
            }
            System.out.println();
        }
    }
}