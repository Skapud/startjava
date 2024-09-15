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
        return books;
    }

    public String add(Book book) {
        if (booksCount >= BOOKCASE_CAPACITY) {
            throw new RuntimeException("Ошибка: на полках кончилось место");
        }
        books[booksCount++] = book;
        return "Добавление книги..";
    }

    public String delete(String name) {
        if (books[0] == null) {
            return "Шкаф пуст";
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getName().equalsIgnoreCase(name)) {
                System.arraycopy(books, i + 1, books, i, books.length - i - 1);
                books[books.length - 1] = null;
                booksCount--;
                return "Удаление книги..";
            }
        }
        throw new RuntimeException("Ошибка: книга не найдена");
    }

    public String find(String name) {
        if (books[0] == null) {
            return "Шкаф пуст";
        }
        for (Book book : books) {
            if (book != null && book.getName().equals(name)) {
                return book.toString();
            }
        }
        throw new RuntimeException("Ошибка: книга не найдена");
    }

    public String clear() {
        if (booksCount == 0) {
            return "Шкаф пуст";
        }
        Arrays.fill(books, 0, booksCount, null);
        booksCount = 0;
        return "Очищение шкафа..";
    }
}

