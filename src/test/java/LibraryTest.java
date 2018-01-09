import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Borrower borrower;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Paul Auster", "The Music Of Chance");
        borrower = new Borrower("Tom Jones", 2);
    }

    @Test
    public void canCountBooks(){
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void canAddBookOnlyToCapacity(){
        library.addBook(book);
        book = new Book("Natalie Angier", "Canon");
        library.addBook(book);
        book = new Book("Natalie Angier", "Canon pt.2");
        library.addBook(book);
        book = new Book("Natalie Angier", "Canon pt.3");
        library.addBook(book);
        book = new Book("Natalie Angier", "Canon pt.4");
        library.addBook(book);
        assertEquals(3, library.getBookCount());
    }

    @Test
    public void canLendBooks(){
        library.addBook(book);
        borrower.borrowBook(library);
        assertEquals(0, library.getBookCount());
    }


}
