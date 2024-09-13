package com.startjava.lesson_2_3_4.project;

import java.util.Arrays;

public class Bookcase {
    private static final int BOOKCASE_CAPACITY = 10;
    private int booksCount = 0;
    private Book[] books = new Book[BOOKCASE_CAPACITY];

    public void add(Book book) {
        if (booksCount == BOOKCASE_CAPACITY) {
            throw new RuntimeException("На полках кончилось место");
        }
        System.out.println("Добавление книги..");
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                booksCount++;
                break;
            }
        }
    }

    public void delete(String name) {
        if (books[0] == null) {
            throw new RuntimeException("Шкаф пуст");
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getName().equalsIgnoreCase(name)) {
                System.out.println("Удаление книги..");
                System.arraycopy(books, i + 1, books, i, books.length - i - 1);
                books[books.length - 1] = null;
                booksCount--;
                return;
            }
        }
        throw new RuntimeException("Книга не найдена");
    }

    public Book find(String name) {
        if (books[0] == null) {
            throw new RuntimeException("Шкаф пуст");
        }
        for (Book book : books) {
            if (book != null && book.getName().equals(name)) {
                return book;
            }
        }
        throw new RuntimeException("Книга не найдена");
    }

    public void clear() {
        if (booksCount == 0) {
            throw new RuntimeException("Шкаф пуст");
        }
        System.out.println("Очищение шкафа..");
        Arrays.fill(books, 0, booksCount, null);
        booksCount = 0;
    }

    public void print() {
        System.out.println("В шкафу книг - " + booksCount +
                ", свободно полок - " + (BOOKCASE_CAPACITY - booksCount) + "\n");
        for (Book book : books) {
            if (book != null) {
                System.out.printf("| %-48s |\n", book.getAuthor() +
                        ", " + book.getName() +
                        ", " + book.getYear());
                System.out.println("|" + "-".repeat(50) + "|");
            }
        }
    }
}

