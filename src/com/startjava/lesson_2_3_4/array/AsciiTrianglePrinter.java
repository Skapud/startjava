package com.startjava.lesson_2_3_4.array;

public class AsciiTrianglePrinter {
    public static void main(String[] args) {
        AsciiTrianglePrinter atp = new AsciiTrianglePrinter();
        atp.createTriangle('0', '9', true);
        atp.createTriangle('/', '!', false);
        atp.createTriangle('A', 'J', false);
    }

    private void createTriangle(char minBorder, char maxBorder, boolean ascending) {
        if (minBorder > maxBorder) {
            char swap = minBorder;
            minBorder = maxBorder;
            maxBorder = swap;
        }
        int segmentLen = Math.abs(minBorder - maxBorder) + 1;
        char[] symbols = new char[segmentLen];
        for (int i = 0; i < segmentLen; i++) {
            symbols[i] = (char) (ascending ? minBorder + i : maxBorder - i);
        }
        print(symbols, minBorder, maxBorder);
    }

    private void print(char[] symbols, char minBorder, char maxBorder) {
        int symbolsCount = 1;
        int spaceCount = maxBorder - minBorder;
        for (char symbol : symbols) {
            System.out.print(" ".repeat(spaceCount));
            System.out.println(String.valueOf(symbol).repeat(symbolsCount));
            symbolsCount += 2;
            spaceCount--;
        }
        System.out.println();
    }
}