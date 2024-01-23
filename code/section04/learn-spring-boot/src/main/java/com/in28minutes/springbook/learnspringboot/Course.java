package com.in28minutes.springbook.learnspringboot;

public class Course {
    
    private int id;
    private String name;
    private String author;

    public Course(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }
}
