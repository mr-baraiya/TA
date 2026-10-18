// Write a Java program to create a class called Area with a static final variable PI=3.14159. 
// Implement a method to calculate the area of a circle given its radius.[B] 

import java.util.Scanner;

class Area {
    static final double PI = 3.14159;

    public double calculateArea(double radius) {
        return PI * radius * radius;
    }
}

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        Area obj = new Area();

        double result = obj.calculateArea(radius);

        System.out.println("Area of Circle = " + result);

        sc.close();
    }
}