package com.sheridan;

public class Book {
    private String name;
    private String author;
    private double price;
    private String isbn;

    public Book (String name, String author, double price, String isbn) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getISBN() {
        return isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
        // ... existing fields and methods ...
    
        @Override
public String toString() {
    return String.format("Book[name=%s, author=%s, price=%.2f, ISBN=%s]",
        name != null ? name : "null",
        author != null ? author : "null",
        price,
        isbn != null ? isbn : "null");
    }
}