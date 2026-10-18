// Write a program that reads a number in meters, converts it to feet, and displays the 
// result.[B]

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a distance in meters: ");
        double meters = sc.nextDouble();
        double feet = meters * 3.28084;
        System.out.println(meters + " meters is equal to " + feet + " feet.");
        sc.close();
        
    }
}
