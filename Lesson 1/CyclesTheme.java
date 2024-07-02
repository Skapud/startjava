public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int rangeMin = -10;
        int rangeMax = 21;
        int i = rangeMin;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
            i++;
        } while (i <= rangeMax);
        System.out.println("В отрезке [" + rangeMin + "," + rangeMax + 
                "] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int numMin = num3;
        int numMax = num1;
        if (num1 < num2 && num1 < num3) {
            numMin = num1;
        } else if (num2 < num1 && num2 < num3) {
            numMin = num2;
        }
        if (num2 > num1 && num2 > num3) {
            numMax = num2;
        } else if (num3 > num1 && num3 > num2) {
            numMax = num3;
        }
        for (--numMax; numMax > numMin; numMax--) {
            System.out.print(numMax + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int numReverse = 1234;
        int digitReverse;
        int digitSum = 0;
        while (numReverse % 10 != 0) {
            digitReverse = numReverse % 10;
            System.out.print(digitReverse + " ");
            digitSum += digitReverse;
            numReverse = numReverse / 10;
        }
        System.out.println("\nСумма выделенных цифр: " + digitSum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        for (i = 1; i <= 23; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i <= 23) {
                    if (i % 2 != 0) {
                        System.out.printf("%02d ", i);
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
        int numTwoCheck = 3242592;
        int k = numTwoCheck;
        int count = 0;
        while (k % 10 != 0) {
            if (k % 10 == 2) {
                count++;
            }
            k = k / 10;
        }
        if (count / 2 == 0) {
            System.out.println("В " + numTwoCheck + " четное (" + count + ") количество двоек");
        } else {
            System.out.println("В " + numTwoCheck + " нечетное (" + count + ") количество двоек");
        }

        System.out.println("\n6. Вывод геометрических фигур");
        for (i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
                if (j == 10) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        int line = 5;
        count = 5;
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
        do {
            do {
                System.out.print("$");
                count++;
            } while (line > count);
            System.out.println();
            line++;
            count = 0;
        } while (line < 4);
        do {
            do {
                System.out.print("$");
                count++;
            } while (line / count != 2);
            System.out.println();
            line++;
            count = 1;
        } while (line < 6);

        System.out.println("\n7. Вывод ASCII-символов");
        System.out.println("DECIMAL   " + "CHARACTER   " + "DESCRIPTION");
        for (i = 33; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("%2s%-12d%-13s%-15s%n", "", i, (char) i, Character.getName(i));
            }
        }
        for (int j = 98; j <= 122; j++) {
            if (j % 2 == 0) {
                System.out.printf("%2s%-12d%-13s%-15s%n", "", j, (char) j, Character.getName(j));
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        int numCheck = 1234321;
        int palindromeCheck = numCheck;
        String palindromeCheckResult = "";
        do {
            palindromeCheckResult += palindromeCheck % 10;
            palindromeCheck = palindromeCheck / 10;
        } while (palindromeCheck % 10 != 0);
        int palindromeIntCheckResult = Integer.parseInt(palindromeCheckResult);
        if (numCheck == palindromeIntCheckResult) {
            System.out.println("Число " + numCheck + " - палиндром");
        } else {
            System.out.println("Число " + numCheck + " - не палиндром");
        }

        System.out.println("\n9.Проверка, является ли число счастливым");
        int numSixDigits = 483843;
        int numHappyCheck = numSixDigits;
        int numSumRightSide = 0;
        int numSumLeftSide = 0;
        String digitsRightSide = "";
        String digitsLeftSide = "";
        for (i = 1; i <= 3; i++) {
            numSumRightSide += numHappyCheck % 10;
            digitsRightSide += numHappyCheck % 10;
            numHappyCheck = numHappyCheck / 10;
        }
        for (int j = 1; j <= 3; j++) {
            numSumLeftSide += numHappyCheck % 10;
            digitsLeftSide += numHappyCheck % 10;
            numHappyCheck = numHappyCheck / 10;
        }
        if (numSumLeftSide == numSumRightSide) {
            System.out.println("Число " + numSixDigits + " - счастливое");
        } else {
            System.out.println("Число " + numSixDigits + " - не счастливое");
        }
        System.out.println("Сумма цифр " + digitsLeftSide + " = " + numSumLeftSide);
        System.out.println("Сумма цифр " + digitsRightSide + " = " + numSumRightSide);

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