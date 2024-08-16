package com.startjava.lesson_2_3_4.array;

public class ThresholdEraser {
    public static void main(String[] args) {
        ThresholdEraser te = new ThresholdEraser();
        te.thresholdErase(-1);
        te.thresholdErase(8);
        te.thresholdErase(0);
        te.thresholdErase(14);
    }

    private void thresholdErase(int index) {
        float[] randomFloats = new float[15];
        init(randomFloats);
        System.out.print("Исходный массив: ");
        print(randomFloats);
        deleteElements(randomFloats, index);
        System.out.print("Измененный массив: ");
        print(randomFloats);
        System.out.println();
    }

    private void init(float[] randomFloats) {
        for (int i = 0; i < randomFloats.length; i++) {
            randomFloats[i] = (float) Math.random();
        }
    }

    private void print(float[] floats) {
        int len = floats.length;
        int linesPrint = (len + 1) / 2;
        for (int i = 0; i < len; i++) {
            if (linesPrint == i) {
                System.out.println();
            }
            System.out.printf((i + 1 == len) ? "%.3f. " : "%.3f, ", floats[i]);
        }
        System.out.println();
    }

    private void deleteElements(float[] randomFloats, int index) {
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
}