// Write a Java program to find the angle between the hour and minute hands.[A] 

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour: ");
        int hour = sc.nextInt();

        System.out.print("Enter minute: ");
        int minute = sc.nextInt();

        if (hour < 0 || hour > 12 || minute < 0 || minute > 60) {
            System.out.println("Invalid input. Please enter valid hour (0-12) and minute (0-60).");
            return;
        }
        
        double angle = Math.abs(30 * hour - 5.5 * minute);

        if (angle > 180) {
            angle = 360 - angle;
        }

        System.out.println("Angle between hour and minute hand: " + angle + " degrees");

        sc.close();
    }
}
