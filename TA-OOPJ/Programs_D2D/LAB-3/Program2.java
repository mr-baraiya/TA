// Write a program to create basic calculator by getting 2 numbers and an operation(+,
// ,/,*,%) from the user and apply the operation given in a string on the given numbers.[A] 

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter operation (+, -, *, /, %): ");
        String operation = sc.next();
        double result = 0;
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}
