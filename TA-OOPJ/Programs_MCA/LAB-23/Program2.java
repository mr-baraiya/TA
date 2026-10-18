// Division with NumberFormatException and ArithmeticException.[B]

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (Num1): ");
        String s1 = sc.next();
        System.out.print("Enter second number (Num2): ");
        String s2 = sc.next();

        try {
            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);

            int result = num1 / num2;
            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Number Format Exception! Both inputs must be valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic Exception! Division by zero is not allowed.");
        } finally {
            sc.close();
        }
    }
}
