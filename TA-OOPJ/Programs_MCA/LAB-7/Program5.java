// Write a Java program to implement a menu-driven area calculator for Circle, Rectangle, Triangle, and Square using a switch statement.[C]

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Area Calculator Menu ===");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Square");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius of circle: ");
                double r = sc.nextDouble();
                System.out.println("Area of Circle: " + (Math.PI * r * r));
                break;
            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double b = sc.nextDouble();
                System.out.println("Area of Rectangle: " + (l * b));
                break;
            case 3:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                System.out.println("Area of Triangle: " + (0.5 * base * h));
                break;
            case 4:
                System.out.print("Enter side of square: ");
                double side = sc.nextDouble();
                System.out.println("Area of Square: " + (side * side));
                break;
            default:
                System.out.println("Invalid choice entered.");
        }
        sc.close();
    }
}
