// Write a program to add two different Time class objects. Time class contains 3 fields: hours, minutes, seconds.[A]

import java.util.Scanner;

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time add(Time t) {
        int totalSec = this.seconds + t.seconds;
        int carryMin = totalSec / 60;
        int sec = totalSec % 60;

        int totalMin = this.minutes + t.minutes + carryMin;
        int carryHour = totalMin / 60;
        int min = totalMin % 60;

        int hour = this.hours + t.hours + carryHour;
        return new Time(hour, min, sec);
    }

    public void display() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Time 1 (hours minutes seconds): ");
        Time t1 = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.print("Enter Time 2 (hours minutes seconds): ");
        Time t2 = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());

        Time sum = t1.add(t2);
        System.out.print("Sum of Times: ");
        sum.display();
        sc.close();
    }
}
