// The marks obtained by a student in 5 different subjects are input through keyboard. Calculate division.[A]

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        System.out.println("Enter marks for 5 subjects (out of 100): ");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            total += sc.nextDouble();
        }

        double percentage = total / 5.0;
        System.out.printf("Total Marks: %.2f / 500, Percentage: %.2f%%%n", total, percentage);

        if (percentage >= 60) {
            System.out.println("Division: First Division");
        } else if (percentage >= 50) {
            System.out.println("Division: Second Division");
        } else if (percentage >= 40) {
            System.out.println("Division: Third Division");
        } else {
            System.out.println("Division: Fail");
        }
        sc.close();
    }
}
