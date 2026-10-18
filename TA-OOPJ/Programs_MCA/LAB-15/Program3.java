// Class House with private variables address, numberOfRooms, area. Getter/setter and calculatePrice().[B]

class House {
    private String address;
    private int numberOfRooms;
    private double area; // in square meters

    public House(String address, int numberOfRooms, double area) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }

    public double calculatePrice(double pricePerSqMeter) {
        return area * pricePerSqMeter;
    }

    public void display(double rate) {
        System.out.println("Address: " + address + " | Rooms: " + numberOfRooms + " | Area: " + area + " sq.m | Price: Rs " + calculatePrice(rate));
    }
}

public class Program3 {
    public static void main(String[] args) {
        House h1 = new House("12 Green Valley", 3, 120.0);
        House h2 = new House("45 Lake View", 4, 180.0);

        double rate = 25000.0; // Rs per sq meter
        h1.display(rate);
        h2.display(rate);
    }
}
