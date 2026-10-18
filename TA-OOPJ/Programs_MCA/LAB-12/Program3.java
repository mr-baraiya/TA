// Create a class Book with three overloaded constructors: Default constructor, Constructor accepting title, Constructor accepting title and price.[C]

class Book {
    private String title;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Untitled";
        this.price = 0.0;
    }

    // Constructor with title
    public Book(String title) {
        this.title = title;
        this.price = 100.0; // default base price
    }

    // Constructor with title and price
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void display() {
        System.out.println("Book Title: " + title + " | Price: Rs " + price);
    }
}

public class Program3 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Effective Java");
        Book b3 = new Book("Clean Code", 450.0);

        b1.display();
        b2.display();
        b3.display();
    }
}
