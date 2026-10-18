// Write a Java program to find the angle between the hour and minute hands.[A]

import java.util.Scanner;

public class Program2 {
    public static double findAngle(int hour, int minute) {
        if (hour < 0 || minute < 0 || hour > 12 || minute > 60) {
            System.out.println("Invalid input!");
            return -1;
        }
        if (hour == 12) hour = 0;
        if (minute == 60) {
            minute = 0;
            hour += 1;
            if (hour > 12) hour -= 12;
        }

        // Hour hand position: (h * 30) + (m * 0.5)
        double hourAngle = 0.5 * (hour * 60 + minute);
        // Minute hand position: m * 6
        double minuteAngle = 6 * minute;

        double diff = Math.abs(hourAngle - minuteAngle);
        return Math.min(360 - diff, diff);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour (1-12): ");
        int h = sc.nextInt();
        System.out.print("Enter minute (0-59): ");
        int m = sc.nextInt();

        double angle = findAngle(h, m);
        System.out.println("Angle between hands: " + angle + " degrees");
        sc.close();
    }
}
