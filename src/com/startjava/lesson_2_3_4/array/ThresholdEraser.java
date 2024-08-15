package com.startjava.lesson_2_3_4.array;

public class ThresholdEraser {
    public static void main(String[] args) {
        ThresholdEraser te = new ThresholdEraser();
        te.processArray(-1);
        te.processArray(8);
        te.processArray(0);
        te.processArray(14);
    }

    private void processArray(int index) {
        float[] randomFloats = new float[15];
        initArray(randomFloats);
        System.out.print("Исходный массив:");
        printArray(randomFloats, 8);
        formatArray(randomFloats, index);
        System.out.print("Измененный массив:");
        printArray(randomFloats, 7);
        System.out.println();
    }

    private void initArray(float[] randomFloats) {
        for (int i = 0; i < randomFloats.length; i++) {
            randomFloats[i] = (float) Math.random();
        }
    }

    private void formatArray(float[] randomFloats, int index) {
        int len = randomFloats.length;
        if (index < 0 || index >= len) {
            System.out.println("Ошибка - индекс массива " + ((index < 0) ?
                    "не может быть отрицательным" : "не может превышать длину массива"));
            return;
        }
        System.out.printf("Значение из ячейки по переданному адресу: %.3f%n", randomFloats[index]);
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (randomFloats[i] < randomFloats[index]) {
                randomFloats[i] = 0;
                count++;
            }
        }
        System.out.println("Количество обнуленных ячеек: " + count);
    }

    private void printArray(float[] randomFloats, int linesPrint) {
        int len = randomFloats.length;
        for (int i = 0; i < len; i++) {
            if (i % linesPrint == 0) {
                System.out.println();
            }
            System.out.printf((i + 1 == len) ? "%.3f. " : "%.3f, ", randomFloats[i]);
        }
        System.out.println();
    }
}