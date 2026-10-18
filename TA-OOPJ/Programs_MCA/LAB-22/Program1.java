// Demonstrate Arithmetic Exception and ArrayIndexOutOfBounds Exception using try-catch block.[A]

public class Program1 {
    public static void main(String[] args) {
        // 1. ArithmeticException
        try {
            System.out.println("Attempting integer division by zero...");
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            System.out.println("\nAttempting to access out-of-bounds array element...");
            int[] arr = {1, 2, 3};
            int val = arr[5];
            System.out.println("Value: " + val);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println("\nProgram execution completed normally after handling exceptions.");
    }
}
