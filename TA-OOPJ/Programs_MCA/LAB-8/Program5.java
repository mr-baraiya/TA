// Write a Java program that accepts a Roman numeral (I, V, X, L, C) and displays its decimal value using a switch statement.[C]

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single Roman numeral (I, V, X, L, C): ");
        char ch = sc.next().toUpperCase().charAt(0);

        int decimalValue;
        switch (ch) {
            case 'I':
                decimalValue = 1;
                break;
            case 'V':
                decimalValue = 5;
                break;
            case 'X':
                decimalValue = 10;
                break;
            case 'L':
                decimalValue = 50;
                break;
            case 'C':
                decimalValue = 100;
                break;
            default:
                decimalValue = -1;
        }

        if (decimalValue != -1) {
            System.out.println("Roman Numeral " + ch + " = " + decimalValue + " in decimal.");
        } else {
            System.out.println("Invalid Roman numeral! Please enter one of I, V, X, L, C.");
        }
        sc.close();
    }
}
