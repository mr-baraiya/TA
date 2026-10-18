// Book class, BookPublication and PaperPublication subclasses with dynamic method dispatch.[A]

class Book {
    private String authorName;

    public Book(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void display() {
        System.out.println("Author: " + authorName);
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Book Publication: " + title + " by " + getAuthorName());
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Research Paper Publication: " + title + " by " + getAuthorName());
    }
}

public class Program3 {
    public static void main(String[] args) {
        Book b1 = new BookPublication("Herbert Schildt", "Java: The Complete Reference");
        Book b2 = new PaperPublication("Alan Turing", "Computing Machinery and Intelligence");

        b1.display();
        b2.display();
    }
}
