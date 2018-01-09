import java.util.ArrayList;

public class Borrower {

    private String name;
    private int borrowLimit;
    ArrayList<Book> books;

    public Borrower(String name, int borrowLimit){
        books = new ArrayList<>();
        this.name = name;
        this.borrowLimit = borrowLimit;
    }

    public void addBook(Book book) {
        if (this.borrowLimit > books.size()){
            books.add(book);
        }
    }

    public int getBookCount() {
        return books.size();
    }

    public void borrowBook(Library library){
        Book book = library.removeBook();
        addBook(book);
    }
}
