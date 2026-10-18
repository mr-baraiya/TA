// Declare a class called book having author_name as private data member. Extend book 
// class to have two sub classes called book_publication & paper_publication. Each of 
// these classes have private member called title. Write a complete program to show 
// usage of dynamic method dispatch (dynamic polymorphism) to display book or paper 
// publications of given author. [B] 

import java.util.Scanner;

class Book {
    private String author_name;

    public Book(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthorName() {
        return author_name;
    }

    public void display() {
        System.out.println("Author: " + author_name);
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Book Publication");
        System.out.println("Author: " + getAuthorName());
        System.out.println("Title: " + title);
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Paper Publication");
        System.out.println("Author: " + getAuthorName());
        System.out.println("Title: " + title);
    }
}

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        System.out.print("Enter publication type (1-Book, 2-Paper): ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter title: ");
        String title = sc.nextLine();

        Book publication;

        if (choice == 1) {
            publication = new BookPublication(author, title);
        } else {
            publication = new PaperPublication(author, title);
        }

        // Dynamic Method Dispatch
        publication.display();

        sc.close();
    }
}