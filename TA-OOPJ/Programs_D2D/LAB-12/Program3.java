// Write a program to create a custom exception named AgeException, get the age of 
// the user from command prompt (terminal) and if age is less than 18 it should throw 
// AgeException, also handle this exception in main method. [A]

import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");

        try {
            int age = sc.nextInt();
            if (age < 18) {
                throw new AgeException("Age is " + age + ". Age must be 18 or above to proceed.");
            }
            System.out.println("Access granted! You are " + age + " years old.");
        } catch (AgeException e) {
            System.out.println("AgeException Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
