package com.startjava.lesson_2_3_4.array;

public class SortedChars {
    public static void main(String[] args) {
        SortedChars fm = new SortedChars();
        double[] array0 = new double[15];
        double[] array1 = new double[15];
        double[] array2 = new double[15];
        double[] array3 = new double[15];

        fm.initArray(array0);
        fm.formatArray(array0, -1);

        fm.initArray(array1);
        fm.formatArray(array1, 15);

        fm.initArray(array2);
        fm.formatArray(array2, 0);

        fm.initArray(array3);
        fm.formatArray(array3, 14);
    }

    public void initArray(double[] array) {
        int len = array.length;
        System.out.print("Исходный массив: ");
        for (int i = 0; i < len; i++) {
            array[i] = Math.random();
        }
        for (int i = 0; i < len; i++) {
            if (i % 8 == 0) {
                System.out.println();
            }
            System.out.printf((i + 1 == len) ? "%.3f. " : "%.3f, ", array[i]);
        }
        System.out.println();
    }

    public void formatArray(double[] array, int index) {
        int len = array.length;
        if (index < 0 || index >= len) {
            System.out.println("Ошибка - индекс массива " + ((index < 0) ?
                    "не может быть отрицательным\n" : "не может превышать длину массива\n"));
            return;
        }
        System.out.printf("Значение по индексу [%d] : %.3f%n", index, array[index]);
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] < array[index]) {
                array[i] = 0;
                count++;
            }
        }
        System.out.print("Измененный массив: ");
        for (int i = 0; i < len; i++) {
            if (i % 7 == 0) {
                System.out.println();
            }
            System.out.printf((i + 1 == len) ? "%.3f. \n" : "%.3f, ", array[i]);
        }
        System.out.println("Количество обнуленных ячеек: " + count);
        System.out.println();
    }
}
