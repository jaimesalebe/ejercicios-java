package com.jaimesalebe.tutorial.models;

public class Book {

    private String name;
    private String editorial;

    public Book(String name, String editorial) {
        this.name = name;
        this.editorial = editorial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
