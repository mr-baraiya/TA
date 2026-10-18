// Design a class named MyPoint to represent a point with x- and y-coordinates. The 
// class contains: 
// The data fields x and y that represent the coordinates with getter methods. 
// 1. a no-arg constructor that creates a point (0, 0). 
// 2. a constructor that constructs a point with specified coordinates. 
// 3. a method named distance that returns the distance from this point to a specified 
// point of the MyPoint type. 
// 4. a method named distance that returns the distance from this point to another point 
// with specified x- and y-coordinates.Create a class named ThreeDPoint to model a 
// point in a three-dimensional space. Let ThreeDPoint be derived from MyPoint with 
// following additional features: 
// 1. A data fields named z that represents the z-coordinate. 
// 2.    A no-arg constructor that creates a point (0, 0, 0). 
// 3.   A constructor that constructs a point with three specified coordinates. 
// 4.   A get method that returns the z value. 
// 5.   Override the distance method to return the distance between two points in the 
// three-dimensional space. Write a program that creates two points (0, 0, 0) and (10, 
// 30, 25.5) and display the distance between the two points. [C] 

class MyPoint {
    
    private double x;
    private double y;

    // No-argument constructor
    public MyPoint() {
        x = 0;
        y = 0;
    }

    // Constructor with specified coordinates
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint point) {
        double dx = x - point.getX();
        double dy = y - point.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;

        return Math.sqrt(dx * dx + dy * dy);
    }
}

class ThreeDPoint extends MyPoint {
    private double z;

    // No-argument constructor
    public ThreeDPoint() {
        super();
        z = 0;
    }

    // Constructor with three coordinates
    public ThreeDPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    // Override distance method
    @Override
    public double distance(MyPoint point) {
        ThreeDPoint p = (ThreeDPoint) point;

        double dx = getX() - p.getX();
        double dy = getY() - p.getY();
        double dz = z - p.getZ();

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}

public class Program5 {
    public static void main(String[] args) {

        ThreeDPoint p1 = new ThreeDPoint(0, 0, 0);
        ThreeDPoint p2 = new ThreeDPoint(10, 30, 25.5);

        double distance = p1.distance(p2);

        System.out.println("Distance between the two points = " + distance);
    }
}