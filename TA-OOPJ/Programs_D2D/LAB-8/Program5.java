// Write a Java program to create a class called House with private instance variables 
// address, numberOfRooms, and area. Provide public getter and setter methods to access 
// and modify these variables. Add a method called calculatePrice() that returns the price 
// of the house based on its area and a price per square meter.[C] 

import java.util.Scanner;

class House {

    // Private instance variables
    private String address;
    private int numberOfRooms;
    private double area;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calculatePrice(double pricePerSquareMeter) {
        return area * pricePerSquareMeter;
    }
}

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        House house = new House();

        System.out.print("Enter address: ");
        house.setAddress(sc.nextLine());

        System.out.print("Enter number of rooms: ");
        house.setNumberOfRooms(sc.nextInt());

        System.out.print("Enter area in square meters: ");
        house.setArea(sc.nextDouble());

        System.out.print("Enter price per square meter: ");
        double pricePerSquareMeter = sc.nextDouble();

        System.out.println("\nHouse Details:");
        System.out.println("Address: " + house.getAddress());
        System.out.println("Number of Rooms: " + house.getNumberOfRooms());
        System.out.println("Area: " + house.getArea() + " sq. meters");
        System.out.println("Price: " + house.calculatePrice(pricePerSquareMeter));

        sc.close();
    }
}
