// Write a program to create circle class with area function to find area of circle. [A] 

import java.util.Scanner;

class Circle {

    double radius;

    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Program1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();

        System.out.print("Enter radius: ");
        c.radius = sc.nextDouble();

        System.out.println("Area of Circle: " + String.format("%.2f", c.area()));

        sc.close();
    }
}