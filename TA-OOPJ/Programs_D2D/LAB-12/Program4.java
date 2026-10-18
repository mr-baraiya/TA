// Write a Java program that divides two numbers. If Num1 or Num2 were not an integer, 
// the program would throw a Number Format Exception. If Num2 were Zero, the program 
// would throw an Arithmetic Exception. Display appropriate message for each exception. [B]

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        String str1 = sc.next();
        System.out.print("Enter Num2: ");
        String str2 = sc.next();

        try {
            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);

            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            int result = num1 / num2;
            System.out.println("Result of " + num1 + " / " + num2 + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Caught: One or both inputs are not valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Caught: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
