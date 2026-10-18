// Write a program to find length of string and print second half of the string.[A]

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int len = str.length();
        System.out.println("Length of string: " + len);

        String secondHalf = str.substring(len / 2);
        System.out.println("Second half of string: " + secondHalf);
        sc.close();
    }
}
