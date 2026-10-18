// Custom exception AgeException: throw if age < 18.[C]

import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Program3 {
    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age " + age + " is invalid. Age must be at least 18 years.");
        }
        System.out.println("Eligible! Age " + age + " verified successfully.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");

        try {
            int age = sc.nextInt();
            checkAge(age);
        } catch (AgeException e) {
            System.out.println("AgeException Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
