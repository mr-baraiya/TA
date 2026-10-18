// A student gets scholarship if: Percentage >= 75 OR Annual income < Rs 2,50,000. Write a java program to check eligibility.[A]

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student percentage: ");
        double percentage = sc.nextDouble();
        System.out.print("Enter annual family income (in Rs): ");
        double income = sc.nextDouble();

        if (percentage >= 75 || income < 250000) {
            System.out.println("Congratulations! The student is ELIGIBLE for the scholarship.");
        } else {
            System.out.println("The student is NOT eligible for the scholarship.");
        }
        sc.close();
    }
}
