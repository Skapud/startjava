package com.startjava.lesson_2_3_4.project;

public class Book {
    private String author;
    private String name;
    private int yearRelease;

    public Book(String author, String name, int yearRelease) {
        this.author = author;
        this.name = name;
        this.yearRelease = yearRelease;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + yearRelease +
                '}';
    }
}
