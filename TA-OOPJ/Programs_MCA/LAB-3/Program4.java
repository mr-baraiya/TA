// Write a program to get 2 numbers from the user and print the sum of two numbers using command line and Scanner class.[B]

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        // 1. Command Line Arguments
        System.out.println("--- Part 1: Sum using Command Line Arguments ---");
        if (args.length >= 2) {
            try {
                int cNum1 = Integer.parseInt(args[0]);
                int cNum2 = Integer.parseInt(args[1]);
                System.out.println("Sum (CLI): " + cNum1 + " + " + cNum2 + " = " + (cNum1 + cNum2));
            } catch (NumberFormatException e) {
                System.out.println("Please provide valid integers in command line arguments.");
            }
        } else {
            System.out.println("Provide two integers as CLI arguments (e.g. java Program4 10 20).");
        }

        // 2. Scanner Class
        System.out.println("\n--- Part 2: Sum using Scanner Class ---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int sNum1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int sNum2 = sc.nextInt();
        System.out.println("Sum (Scanner): " + sNum1 + " + " + sNum2 + " = " + (sNum1 + sNum2));
        sc.close();
    }
}
