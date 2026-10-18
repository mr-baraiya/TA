// Write a program to find a sum of numbers entered by user. (E.g: 582=5+8+2=15) [A]

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = Math.abs(num);
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits of " + num + " = " + sum);
        sc.close();
    }
}
