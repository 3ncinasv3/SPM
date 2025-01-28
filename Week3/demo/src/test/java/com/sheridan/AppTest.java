package com.sheridan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
// import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testAddingNewBook() {
        BookManager bm = new BookManager();
        Book book = new Book("Harry Potter", "J.K Rowling", 2000, "1002");
        assertTrue(bm.addBook(book));
        // bm.addBook(book);
    }

    @Test
    public void testRetrievingBook() {
        BookManager bm = new BookManager();
        Book book = new Book("The Art of War", "Unknown", 200, "8282");
        bm.addBook(book);
        Book retrievedBook = bm.getBook(book.getISBN());
        assertNotNull(retrievedBook);
    }

    @Test
    public void testUpdatingBookInCollection() {
        BookManager bm = new BookManager();
        Book book = new Book("The Art of War", "Unknown", 200, "8282");
        bm.addBook(book);
        book.setAuthor("Sun Tzu");
        bm.updateBook(book); 
        assertEquals("Sun Tzu", bm.getBook(book.getISBN()).getAuthor());
    }

    @Test
    public void testDeletingBookInCollection() {
        BookManager bm = new BookManager();
        Book book = new Book("HelloWorld", "Joshua", 5, "919191");
        bm.addBook(book);
        bm.deleteBook(book);
        assertNull(bm.getBook(book.getISBN()));
    }

    @Test
public void testRetrievingBookx() {
    System.out.println("Testing retrieving book...");
    BookManager bm = new BookManager();
    Book book = new Book("The Art of War", "Unknown", 200, "8282");
    bm.addBook(book);
    Book retrievedBook = bm.getBook(book.getISBN());
    System.out.println("Retrieved book: " + retrievedBook);
    assertNotNull(retrievedBook);
}
}
