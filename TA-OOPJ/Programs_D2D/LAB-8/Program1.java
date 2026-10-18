// Write a program to add two different Time class’s objects. Time class contains 3 
// fields hours, Minute and Seconds. (Take input from user and assume user will 
// always enter a valid data, e.g. if Time1 is 02:55:55 and Time2 is 03:07:10 then 
// result is 06:03:05) [A] 

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
        int sec = this.seconds + t.seconds;
        int min = this.minutes + t.minutes;
        int hrs = this.hours + t.hours;

        if (sec >= 60) {
            sec -= 60;
            min++;
        }

        if (min >= 60) {
            min -= 60;
            hrs++;
        }

        return new Time(hrs, min, sec);
    }

    public void display() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Time 1 (hours minutes seconds): ");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();

        System.out.print("Enter Time 2 (hours minutes seconds): ");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        Time time1 = new Time(h1, m1, s1);
        Time time2 = new Time(h2, m2, s2);

        Time result = time1.add(time2);

        System.out.print("Result: ");
        result.display();

        sc.close();
    }
}