package com.startjava.lesson_2_3_4.project;

public class Book {
    private String author;
    private String name;
    private int yearPublished;

    public Book(String author, String name, int yearRelease) {
        this.author = author;
        this.name = name;
        this.yearPublished = yearRelease;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return author + ", " + name + ", " + yearPublished;
    }
}
