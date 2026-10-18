// Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = (f - 32) * 5 / 9)[B]

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", fahrenheit, celsius);
        sc.close();
    }
}
