// Define class for Complex number with real and imaginary as data members. Create its 
// constructor, overload the constructors. Also define addition method to add two 
// complex objects. [C] 

import java.util.Scanner;

class Complex {

    double real;
    double imaginary;

    // Default constructor
    Complex() {
        real = 0;
        imaginary = 0;
    }

    // Parameterized constructor
    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex c) {

        double r = this.real + c.real;
        double i = this.imaginary + c.imaginary;

        return new Complex(r, i);
    }

    public void display() {

        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }
}

public class Program4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first number: ");
        double real1 = sc.nextDouble();

        System.out.print("Enter imaginary part of first number: ");
        double imaginary1 = sc.nextDouble();

        System.out.print("Enter real part of second number: ");
        double real2 = sc.nextDouble();

        System.out.print("Enter imaginary part of second number: ");
        double imaginary2 = sc.nextDouble();

        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);

        Complex result = c1.add(c2);

        System.out.println("\nFirst Complex Number:");
        c1.display();

        System.out.println("Second Complex Number:");
        c2.display();

        System.out.println("Addition:");
        result.display();

        sc.close();
    }
}
