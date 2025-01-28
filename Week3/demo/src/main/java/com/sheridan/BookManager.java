package com.sheridan;
import java.util.HashMap;
import java.util.Map;

public class BookManager {

    private Map<String, Book> books = new HashMap<>();

    public boolean addBook(Book book) {
        if (book == null || books.containsKey(book.getISBN()))
            return false;
        else {
            books.put(book.getISBN(), book);
            return true;
        }
    }

    public Book getBook(String isbn) {
        return books.get(isbn);
    }

    public boolean updateBook(Book book) {
        // if (book != null) {
        //     book.setAuthor = book.
        // }

       if (books.containsKey(book.getISBN())) {
            books.replace(book.getISBN(), book);
            return true;
       }
       else {
            return false;
       }
    }

    public boolean deleteBook(Book book) {
        if (books.containsKey(book.getISBN())) {
            books.remove(book.getISBN(), book);
            return true;
       }
       else {
            return false;
       }
    }
}