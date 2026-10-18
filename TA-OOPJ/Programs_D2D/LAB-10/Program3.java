// Write a Java program to create an abstract class Vehicle with abstract methods 
// startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend the 
// Vehicle class and implement the respective methods to start and stop the engines for 
// each vehicle type.[B]

abstract class Vehicle {
    abstract void startEngine();

    abstract void stopEngine();
}

class Car extends Vehicle {

    public void startEngine() {
        System.out.println("Car engine started.");
    }

    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

class Motorcycle extends Vehicle {

    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

public class Program3 {
    public static void main(String[] args) {

        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        car.startEngine();
        car.stopEngine();

        System.out.println();

        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}