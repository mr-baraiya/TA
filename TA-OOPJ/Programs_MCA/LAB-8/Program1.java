// Write a program to check that the given number is prime or not.[A]

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        boolean isPrime = num > 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a PRIME number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }
        sc.close();
    }
}
