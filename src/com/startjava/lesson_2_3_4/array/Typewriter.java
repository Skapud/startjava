package com.startjava.lesson_2_3_4.array;

public class Typewriter {
    public static void main(String[] args) {
        Typewriter tw = new Typewriter();
        tw.extractWords("Java - это C++, из которого убрали все пистолеты, ножи и дубинки.\n" +
                "- James Gosling");
        tw.extractWords("Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его.\n" +
                "- Robert Martin");
        tw.extractWords("null");
        tw.extractWords("");
    }

    private void extractWords(String message) {
        String[] split = message.split(" ");
        findMinMax(split);
        String[] minMax = findMinMax(split);
        rewriteInterval(split, minMax);
    }

    private String[] findMinMax(String[] split) {
        int len = split.length;
        String max = split[0];
        String min = split[0];
        for (int i = 1; i < len; i++) {
            if (split[i].length() < min.length()) {
                min = split[i];
            }
            if (split[i].length() > max.length()) {
                max = split[i];
            }
        }
        System.out.println(min + " " + max);
        return new String[] {min, max};
    }

    private void rewriteInterval(String[] split, String[] minMax) {
        int len = split.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (split[i].equals(minMax[0]) || split[i].equals(minMax[1])) {
                count++;
            }
            if (count > 0) {
                split[i] = split[i].toUpperCase();
            }
            if (count == 2) {
                break;
            }
        }
        for (String text : split) {
            System.out.print(text + " ");
        }
    }
}
