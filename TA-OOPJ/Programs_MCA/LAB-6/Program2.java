// Write a java program to find that entered no is odd or even without using arithmetic operators.[A]

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Using bitwise AND operator (&)
        if ((num & 1) == 0) {
            System.out.println(num + " is EVEN (evaluated via bitwise AND).");
        } else {
            System.out.println(num + " is ODD (evaluated via bitwise AND).");
        }
        sc.close();
    }
}
