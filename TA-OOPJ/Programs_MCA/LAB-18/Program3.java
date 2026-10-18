// Abstract class Vehicle with abstract startEngine() and stopEngine().[B]

abstract class Vehicle {
    protected String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle {
    public Car(String model) { super(model); }

    @Override
    public void startEngine() {
        System.out.println("Car " + model + ": Key turned / Push button pressed, engine roaring smoothly.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car " + model + ": Engine turned off.");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String model) { super(model); }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle " + model + ": Self start pressed, engine idling.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle " + model + ": Kill switch activated, engine stopped.");
    }
}

public class Program3 {
    public static void main(String[] args) {
        Vehicle car = new Car("Honda City");
        Vehicle bike = new Motorcycle("Royal Enfield Classic 350");

        car.startEngine();
        car.stopEngine();

        System.out.println();
        bike.startEngine();
        bike.stopEngine();
    }
}
