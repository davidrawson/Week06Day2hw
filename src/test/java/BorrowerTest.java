import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;

    @Before
    public void before(){
        book = new Book("J.G. Ballard","Short Stories Collection");
        borrower = new Borrower("Tom Jones", 2);
    }

    @Test
    public void canAddBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.getBookCount());
    }

    @Test
    public void canOnlyBorrowToLimit(){
        borrower.addBook(book);
        borrower.addBook(book);
        borrower.addBook(book);
        borrower.addBook(book);
        assertEquals(2, borrower.getBookCount());
    }


}


