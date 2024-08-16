package com.startjava.lesson_2_3_4.array;

public class TriangleDrawing {
    public static void main(String[] args) {
        TriangleDrawing pr = new TriangleDrawing();
        pr.drawChars('0', '9', true);
        pr.drawChars('/', '!', false);
        pr.drawChars('A', 'J', false);
    }

    private void drawChars(char minBorder, char maxBorder, boolean direction) {
        int segmentLen = Math.abs(minBorder - maxBorder) + 1;
        char[] symbols = new char[segmentLen];
        if (minBorder > maxBorder) {
            char swap = minBorder;
            minBorder = maxBorder;
            maxBorder = swap;
        }
        for (int i = 0; i < segmentLen; i++) {
            symbols[i] = (char) (direction ? minBorder + i : maxBorder - i);
        }
        int symCount = 1;
        int spaceCount = maxBorder - minBorder;
        for (char sym : symbols) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= spaceCount; i++) {
                sb.append(" ");
            }
            for (int i = 1; i <= symCount; i++) {
                sb.append(sym);
            }
            System.out.println(sb);
            symCount += 2;
            spaceCount--;
        }
        System.out.println();
    }
}