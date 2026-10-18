// Write a program to demonstrate Arithmetic Exception and ArrayIndexOutOfBounds 
// Exception using try-catch block. [A]

public class Program1 {
    public static void main(String[] args) {
        // 1. Demonstrating ArithmeticException
        System.out.println("--- Demonstrating ArithmeticException ---");
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // 2. Demonstrating ArrayIndexOutOfBoundsException
        System.out.println("\n--- Demonstrating ArrayIndexOutOfBoundsException ---");
        try {
            int[] arr = {1, 2, 3};
            System.out.println("Accessing element at index 5: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println("\nProgram execution completed successfully.");
    }
}
