import java.util.ArrayList;

public class Library {

    private int capacity = 3;
    ArrayList<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (this.capacity > getBookCount()){
            books.add(book);
        }
    }

    public int getBookCount() {
        return books.size();
    }

    public Book removeBook() {
        return books.remove(0);
    }
}
