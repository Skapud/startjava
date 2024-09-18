package com.startjava.lesson_2_3_4.project;

public class Book {
    private String author;
    private String title;
    private int yearPublished;

    public Book(String author, String title, int yearRelease) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearRelease;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + yearPublished;
    }
}
