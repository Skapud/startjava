package com.startjava.lesson_2_3_4.array;

public class ThresholdEraser {
    public static void main(String[] args) {
        ThresholdEraser te = new ThresholdEraser();
        te.erase(-1);
        te.erase(15);
        te.erase(0);
        te.erase(14);
    }

    private void erase(int index) {
        float[] randomFloats = new float[15];
        if (index < 0 || index >= randomFloats.length) {
            System.out.println("Ошибка - индекс массива " + ((index < 0) ?
                    "не может быть отрицательным" : "не может превышать длину массива"));
            return;
        }
        init(randomFloats);
        System.out.print("Исходный массив: \n");
        print(randomFloats);
        deleteElements(randomFloats, index);
        System.out.print("Измененный массив: \n");
        print(randomFloats);
        System.out.println();
    }

    private void init(float[] randomFloats) {
        for (int i = 0; i < randomFloats.length; i++) {
            randomFloats[i] = (float) Math.random();
        }
    }

    private void print(float[] randomfloats) {
        int len = randomfloats.length;
        int linesPrint = (len + 1) / 2;
        for (int i = 0; i < len; i++) {
            if (linesPrint == i) {
                System.out.println();
            }
            System.out.printf((i + 1 == len) ? "%.3f. " : "%.3f, ", randomfloats[i]);
        }
        System.out.println();
    }

    private void deleteElements(float[] randomFloats, int index) {
        int len = randomFloats.length;
        System.out.printf("Значение из ячейки по переданному адресу: %.3f%n", randomFloats[index]);
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (randomFloats[i] > randomFloats[index]) {
                randomFloats[i] = 0;
                count++;
            }
        }
        System.out.println("Количество обнуленных ячеек: " + count);
    }
}