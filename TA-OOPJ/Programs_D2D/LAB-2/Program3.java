// Write a program to get 2 numbers from the user and print the sum of two numbers 
// using command line and Scanner class.[A] 

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

        // int num1 = Integer.parseInt(args[0]);
        // int num2 = Integer.parseInt(args[1]);
        // int sum = num1 + num2;
        // System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        sc.close();
        
    }
}
