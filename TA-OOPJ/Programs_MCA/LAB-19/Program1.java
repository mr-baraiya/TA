// Vehicle Management System: Parent class Vehicle inherited by Car, Bike, Bus demonstrating Dynamic Method Dispatch.[A]

class VehicleInfo {
    public void displayInfo() {
        System.out.println("General Vehicle Information.");
    }
}

class CarType extends VehicleInfo {
    @Override
    public void displayInfo() {
        System.out.println("Car: 4 wheels, seating capacity 5, air conditioned.");
    }
}

class BikeType extends VehicleInfo {
    @Override
    public void displayInfo() {
        System.out.println("Bike: 2 wheels, highly fuel efficient, easy city commute.");
    }
}

class BusType extends VehicleInfo {
    @Override
    public void displayInfo() {
        System.out.println("Bus: 6 wheels, passenger capacity 50+, public transport.");
    }
}

public class Program1 {
    public static void main(String[] args) {
        VehicleInfo ref;

        ref = new CarType();
        ref.displayInfo();

        ref = new BikeType();
        ref.displayInfo();

        ref = new BusType();
        ref.displayInfo();
    }
}
