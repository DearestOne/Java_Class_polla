import java.util.ArrayList;
public class Book {
    public String isbn;
    public String title;
    public String type;
    public double price;
    public Book(String isbn, String title, String type, double price){
        this.isbn = isbn;
        this.price = price;
        this.title = title;
        this.type = type;
    }
}
class BookStore {
    public ArrayList<Book> books = new ArrayList<Book>();
    public void addBook(String isbn,String title,String type,double price){
        Book b = new Book(isbn, title, type, price);
        books.add(b);
    }
}
