// Write a program to calculate the area of Rectangle.[A] 

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length Of Rectangle : ");
        int l = sc.nextInt();
        System.out.println("Enter the Breadth of Rectangle : ");
        int b  = sc.nextInt();
        int area = l * b;
        System.out.println("Area of Rectangle is : " + area);
        sc.close();
    }
}
