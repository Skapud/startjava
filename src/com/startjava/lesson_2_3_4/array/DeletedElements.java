package com.startjava.lesson_2_3_4.array;

public class DeletedElements {
    public static void main(String[] args) {
        DeletedElements de = new DeletedElements();
        double[] negativeIndex = new double[15];
        de.initArray(negativeIndex);
        System.out.print("Исходный массив:");
        de.printArray(negativeIndex, 8);
        de.formatArray(negativeIndex, -1);
        System.out.print("Измененный массив:");
        de.printArray(negativeIndex, 7);
        System.out.println();

        double[] overIndex = new double[15];
        de.initArray(overIndex);
        System.out.print("Исходный массив:");
        de.printArray(overIndex, 8);
        de.formatArray(overIndex, 15);
        System.out.print("Измененный массив:");
        de.printArray(overIndex, 7);
        System.out.println();

        double[] zeroIndex = new double[15];
        de.initArray(zeroIndex);
        System.out.print("Исходный массив:");
        de.printArray(zeroIndex, 8);
        de.formatArray(zeroIndex, 0);
        System.out.print("Измененный массив:");
        de.printArray(zeroIndex, 7);
        System.out.println();

        double[] lastIndex = new double[15];
        de.initArray(lastIndex);
        System.out.print("Исходный массив:");
        de.printArray(lastIndex, 8);
        de.formatArray(lastIndex, 14);
        System.out.print("Измененный массив:");
        de.printArray(lastIndex, 7);
    }

    public void initArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
    }

    public void formatArray(double[] array, int index) {
        int len = array.length;
        if (index < 0 || index >= len) {
            System.out.println("Ошибка - индекс массива " + ((index < 0) ?
                    "не может быть отрицательным" : "не может превышать длину массива"));
            return;
        }
        System.out.printf("Значение из ячейки по переданному адресу: %.3f%n", array[index]);
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] < array[index]) {
                array[i] = 0;
                count++;
            }
        }
        System.out.println("Количество обнуленных ячеек: " + count);
    }

    public void printArray(double[] array, int linesPrinted) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            if (i % linesPrinted == 0) {
                System.out.println();
            }
            System.out.printf((i + 1 == len) ? "%.3f. " : "%.3f, ", array[i]);
        }
        System.out.println();
    }
}