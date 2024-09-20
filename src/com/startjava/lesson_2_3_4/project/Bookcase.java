package com.startjava.lesson_2_3_4.project;

import java.util.Arrays;

public class Bookcase {
    static final int SHELVES = 10;
    private int booksCount;
    private Book[] books = new Book[SHELVES];
    private int bookcaseLength;

    public int getBooksCount() {
        return booksCount;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, booksCount);
    }

    public int getBookcaseLength() {
        return bookcaseLength;
    }

    public void save(Book book) {
        if (booksCount >= SHELVES) {
            throw new RuntimeException("Ошибка: на полках кончилось место");
        }
        books[booksCount++] = book;
        bookcaseLength = Math.max(bookcaseLength, book.toString().length());
    }

    public boolean delete(String input) {
        if (booksCount == 0) return false;
        for (int i = 0; i < booksCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(input)) {
                boolean isLongestBook = (bookcaseLength == books[i].toString().length());
                System.arraycopy(books, i + 1, books, i, booksCount - i - 1);
                books[--booksCount] = null;
                if (isLongestBook) updateBookcaseLength();
                return true;
            }
        }
        throw new RuntimeException("Ошибка: книга не найдена");
    }

    private void updateBookcaseLength() {
        for (Book book : getBooks()) {
            bookcaseLength = Math.max(bookcaseLength, book.toString().length());
        }
    }

    public Book find(String input) {
        if (booksCount == 0) return null;
        for (int i = 0; i < booksCount; i++) {
            if (books[i].getTitle().equals(input)) {
                return books[i];
            }
        }
        throw new RuntimeException("Ошибка: книга не найдена");
    }

    public void clear() {
        if (booksCount == 0) return;
        Arrays.fill(books, 0, booksCount, null);
        booksCount = 0;
    }
}

