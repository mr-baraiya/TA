// Write a java program to take user input [A]
// i. Through Command Line Argument.
// ii. Through Scanner class.

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        System.out.println("--- Part 1: Command Line Argument ---");
        if (args.length > 0) {
            System.out.println("Command line argument received: " + args[0]);
        } else {
            System.out.println("No command line argument passed. Pass an argument when running: java Program3 <arg>");
        }

        System.out.println("\n--- Part 2: Scanner Class ---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "! (Input received via Scanner)");
        sc.close();
    }
}
