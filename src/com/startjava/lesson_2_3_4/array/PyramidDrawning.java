package com.startjava.lesson_2_3_4.array;

public class PyramidDrawning {
    public static void main(String[] args) {
        PyramidDrawning pr = new PyramidDrawning();
        pr.sortChars('0', '9', true);
        pr.sortChars('/', '!', false);
        pr.sortChars('A', 'J', false);
    }

    private void sortChars(char minBorder, char maxBorder, boolean direction) {
        int segmentLen = Math.abs(minBorder - maxBorder) + 1;
        char[] symbols = new char[segmentLen];
        if (minBorder > maxBorder) {
            char swap = minBorder;
            minBorder = maxBorder;
            maxBorder = swap;
        }
        if (direction) {
            for (int i = 0; i < segmentLen; i++) {
                symbols[i] = (char) (minBorder + i);
            }
        } else {
            for (int i = 0; i < segmentLen; i++) {
                symbols[i] = (char) (maxBorder - i);
            }
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