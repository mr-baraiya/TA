// The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. 
// Write a java program that demonstrates how to establish this class hierarchy. Declare 
// one instance variable of type String that indicates the color of a vegetable. Create and 
// display instances of these objects. Override the toString() method of object to return a 
// string with the name of vegetable and its color. [A] 

abstract class Vegetable {
    String color;

    public Vegetable(String color) {
        this.color = color;
    }

    // Abstract method
    abstract String getName();

    // Override toString()
    @Override
    public String toString() {
        return getName() + " is " + color + " in color.";
    }
}

class Potato extends Vegetable {

    public Potato(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Potato";
    }
}

class Brinjal extends Vegetable {

    public Brinjal(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Brinjal";
    }
}

class Tomato extends Vegetable {

    public Tomato(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Tomato";
    }
}

public class Program1 {
    public static void main(String[] args) {

        Potato potato = new Potato("Brown");
        Brinjal brinjal = new Brinjal("Purple");
        Tomato tomato = new Tomato("Red");

        System.out.println(potato);
        System.out.println(brinjal);
        System.out.println(tomato);
    }
}