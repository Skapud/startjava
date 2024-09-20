package com.startjava.lesson_2_3_4.project;

public class Book {
    private String author;
    private String title;
    private int yearPublished;

    public Book(String author, String title, int yearPublished) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + yearPublished;
    }
}
