// Demonstrate the use of Super Keyword: variables, methods, constructors.[A]

class Parent {
    int value = 100;

    public Parent() {
        System.out.println("Parent class no-arg constructor invoked using super()");
    }

    public void show() {
        System.out.println("Parent class show() method invoked using super.show()");
    }
}

class Child extends Parent {
    int value = 200;

    public Child() {
        super(); // Calls parent constructor
        System.out.println("Child class constructor executed.");
    }

    @Override
    public void show() {
        super.show(); // Calls parent method
        System.out.println("Child value: " + this.value + ", Parent value: " + super.value);
    }
}

public class Program1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
