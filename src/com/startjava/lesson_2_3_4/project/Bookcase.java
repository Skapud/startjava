package com.startjava.lesson_2_3_4.project;

import java.util.Arrays;

public class Bookcase {
    public static final int BOOKCASE_CAPACITY = 10;
    private int booksCount;
    private Book[] books = new Book[BOOKCASE_CAPACITY];

    public int getBooksCount() {
        return booksCount;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, booksCount);
    }

    public void add(Book book) {
        if (booksCount >= BOOKCASE_CAPACITY) {
            throw new RuntimeException("Ошибка: на полках кончилось место");
        }
        books[booksCount++] = book;
    }

    public void delete(String name) {
        if (booksCount == 0) {
            return;
        }
        for (int i = 0; i < booksCount; i++) {
            if (books[i].getName().equalsIgnoreCase(name)) {
                System.arraycopy(books, i + 1, books, i, books.length - i - 1);
                books[--booksCount] = null;
                return;
            }
        }
        throw new RuntimeException("Ошибка: книга не найдена");
    }

    public Book find(String name) {
        if (booksCount == 0) {
            return null;
        }
        for (int i = 0; i < booksCount; i++) {
            if (books[i].getName().equals(name)) {
                return books[i];
            }
        }
        throw new RuntimeException("Ошибка: книга не найдена");
    }

    public void clear() {
        if (booksCount == 0) {
            return;
        }
        Arrays.fill(books, 0, booksCount, null);
        booksCount = 0;
    }
}

