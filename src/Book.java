import java.util.Arrays;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int gty ;

    public Book(String name, Author author, double price, int gty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.gty = gty;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getGty() {
        return gty;
    }

    public void setGty(int gty) {
        this.gty = gty;
    }

    @Override
    public String toString() {
        return "Book name: "
                + name +
                "   Author: " + author +
                "      Price: " + price +
                "   Gty: " + gty;
    }
}

