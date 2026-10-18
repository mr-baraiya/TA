// Write a program to find that given Number is palindrome or not. [B]

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;
        while (temp != 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }

        if (num == rev) {
            System.out.println(num + " is a PALINDROME.");
        } else {
            System.out.println(num + " is NOT a palindrome.");
        }
        sc.close();
    }
}
