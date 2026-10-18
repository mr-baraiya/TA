// Write a program that prompts the user to enter three numbers. Find the largest 
// number.[C] 

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int b  = sc.nextInt();
        System.out.println("Enter the Third Number : ");
        int c  = sc.nextInt();
        
        if(a > b && a > c) {
            System.out.println("The Largest Number is : " + a);
        } else if(b > a && b > c) {
            System.out.println("The Largest Number is : " + b);
        } else {
            System.out.println("The Largest Number is : " + c);
        }
        sc.close();
    }
}
