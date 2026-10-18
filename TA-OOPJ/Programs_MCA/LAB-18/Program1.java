// Abstract vegetable class with subclasses Potato, Brinjal, and Tomato.[A]

abstract class Vegetable {
    protected String color;

    public Vegetable(String color) {
        this.color = color;
    }

    public abstract String toString();
}

class Potato extends Vegetable {
    public Potato(String color) { super(color); }

    @Override
    public String toString() {
        return "Vegetable: Potato, Color: " + color;
    }
}

class Brinjal extends Vegetable {
    public Brinjal(String color) { super(color); }

    @Override
    public String toString() {
        return "Vegetable: Brinjal, Color: " + color;
    }
}

class Tomato extends Vegetable {
    public Tomato(String color) { super(color); }

    @Override
    public String toString() {
        return "Vegetable: Tomato, Color: " + color;
    }
}

public class Program1 {
    public static void main(String[] args) {
        Vegetable v1 = new Potato("Brownish Yellow");
        Vegetable v2 = new Brinjal("Purple");
        Vegetable v3 = new Tomato("Red");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
