// Create class Cube with attributes (height, width and depth with double datatype). 
// Implement getter() and setter() method to assign data for 2 cubes. Create method 
// volume() to calculate volume for 2 cubes. [A] 

import java.util.Scanner;

class Cube {

    double height;
    double width;
    double depth;

    public void set(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public void get() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Depth: " + depth);
    }

    public double volume() {
        return height * width * depth;
    }
}

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cube[] cubes = new Cube[2];

        for (int i = 0; i < 2; i++) {

            cubes[i] = new Cube();

            System.out.println("\nEnter details for Cube " + (i + 1));

            System.out.print("Enter height: ");
            double height = sc.nextDouble();

            System.out.print("Enter width: ");
            double width = sc.nextDouble();

            System.out.print("Enter depth: ");
            double depth = sc.nextDouble();

            cubes[i].set(height, width, depth);
        }

        System.out.println("\n----- Cube Details -----");

        for (int i = 0; i < 2; i++) {

            System.out.println("\nCube " + (i + 1));

            cubes[i].get();

            System.out.println("Volume: " + cubes[i].volume());
        }

        sc.close();
    }
}