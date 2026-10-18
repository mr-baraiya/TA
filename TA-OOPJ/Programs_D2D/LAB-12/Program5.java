// Write a program in java if number is less than 10 and greater than 50, it generate the 
// exception out of range. Else it displays the square of number. [C]

import java.util.Scanner;

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            int num = sc.nextInt();
            if (num < 10 || num > 50) {
                throw new OutOfRangeException("Number " + num + " is out of range (Must be between 10 and 50).");
            }
            System.out.println("Square of " + num + " is: " + (num * num));
        } catch (OutOfRangeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
