// Write a program to create circle class with area function to find area of circle. [A]

import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        System.out.printf("Area of Circle with radius %.2f: %.2f%n", r, c.getArea());
        sc.close();
    }
}
