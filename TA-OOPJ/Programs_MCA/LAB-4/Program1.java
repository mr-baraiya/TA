// Write a program that reads a number in meters, converts it to feet, and displays the result.[A]

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();

        double feet = meters * 3.28084;
        System.out.printf("%.2f meters is equal to %.2f feet.%n", meters, feet);
        sc.close();
    }
}
