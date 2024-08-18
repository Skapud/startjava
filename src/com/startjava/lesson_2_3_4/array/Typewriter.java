package com.startjava.lesson_2_3_4.array;

public class Typewriter {
    public static void main(String[] args) throws InterruptedException {
        Typewriter tw = new Typewriter();
        tw.extractWords("Java - это C++, из которого убрали все пистолеты, ножи и дубинки.\n" +
                "- James Gosling");
        tw.extractWords("Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его.\n" +
                "- Robert Martin");
        tw.extractWords("null");
        tw.extractWords("");
    }

    private void extractWords(String message) throws InterruptedException {
        if (message.equals("null") || message.isBlank()) {
            System.out.printf("Ошибка ввода: " + ((message.equals("null")) ? "null\n" : "пустая строка\n"));
            return;
        }
        String[] split = message.split("(?=[\\s,.!?])|(?<=[\\s,.!?])");
        int[] indexSegment = findUppercaseSegment(split);
        String[] uppercaseSplit = rewrite(split, indexSegment);
        printUppercase(uppercaseSplit, indexSegment);
        printTypeWriter(uppercaseSplit);
    }

    private int[] findUppercaseSegment(String[] split) {
        int len = split.length;
        int min = 0;
        int max = 0;
        for (int i = 1; i < len; i++) {
            if (split[i].matches("[\\p{L}]+")) {
                if (split[i].length() < split[min].length()) {
                    min = i;
                }
                if (split[i].length() > split[max].length()) {
                    max = i;
                }
            }
        }
        if (min > max) {
            int swap = min;
            min = max;
            max = swap;
        }
        return new int[] {min, max};
    }

    private String[] rewrite(String[] split, int[] indexSegment) {
        int len = split.length;
        String[] uppercaseSplit = new String[len];
        for (int i = 0; i < len; i++) {
            if (i >= indexSegment[0] && i <= indexSegment[1]) {
                uppercaseSplit[i] = split[i].toUpperCase();
            } else {
                uppercaseSplit[i] = split[i];
            }
        }
        return uppercaseSplit;
    }

    private void printUppercase(String[] uppercaseSplit, int[] indexSegment) {
        System.out.println("Все слова между найденными (включительно): ");
        for (int i = indexSegment[0]; i <= indexSegment[1]; i++) {
            if (uppercaseSplit[i].matches("[\\p{L}]+")) {
                System.out.printf("%s ", uppercaseSplit[i]);
            }
        }
        System.out.println();
    }

    private void printTypeWriter(String[] uppercaseSplit) throws InterruptedException {
        System.out.println("Текст с эффектом пишущей машинки (побуквенно): ");
        for (String text : uppercaseSplit) {
            for (char c : text.toCharArray()) {
                System.out.print(c);
                Thread.sleep(100);
            }
        }
        System.out.println();
    }
}
