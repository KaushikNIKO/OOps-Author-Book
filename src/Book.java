import java.util.Arrays;

public class Book {

    private String nameBook;
    private Author[] authors;
    private double price;
    private int quantity;




    public Book(String nameBook, Author[] author, double price, int quantity) {
        this.nameBook = nameBook;
        this.authors = author;
        this.price = price;
        this.quantity = quantity;
    }

    public Book(String nameBook, Author[] author, double price) {
        this.nameBook = nameBook;
        this.authors = author;
        this.price = price;
    }



    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {

        return authors[0];
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

}
