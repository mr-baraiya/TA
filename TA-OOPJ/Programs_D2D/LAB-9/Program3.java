// Demonstrate the use of Super Keyword. [A] 

class Parent {
    int number = 10;

    public Parent() {
        System.out.println("Parent class constructor");
    }

    public void display() {
        System.out.println("Display method of Parent class");
    }
}

class Child extends Parent {
    int number = 20;

    public Child() {
        super();   // Calls Parent class constructor
        System.out.println("Child class constructor");
    }

    public void display() {
        System.out.println("Child number: " + number);

        // Access Parent class variable
        System.out.println("Parent number: " + super.number);

        // Call Parent class method
        super.display();
    }
}

public class Program3 {
    public static void main(String[] args) {

        Child obj = new Child();

        obj.display();
    }
}