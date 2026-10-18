// Develop a Java program to generate the Fibonacci sequence up to a specified number of terms using recursion.[A]

import java.util.Scanner;

public class Program2 {
    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms for Fibonacci sequence: ");
        int terms = sc.nextInt();

        System.out.print("Fibonacci sequence up to " + terms + " terms: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        sc.close();
    }
}
