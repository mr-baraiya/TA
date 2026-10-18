// The marks obtained by a student in 5 different subjects are input through the 
// keyboard.  
// The student gets a division as per the following rules: 
// I. Percentage above or equals to 60-first division 
// II. Percentage between 50 to 59-second division 
// III. Percentage between 40 and 49-Third division 
// IV. Percentage less than 40-fail 
// Write a program to calculate the division obtained by the student.[A]

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtained in 5 subjects : ");
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        int marks4 = sc.nextInt();
        int marks5 = sc.nextInt();
        int total = marks1 + marks2 + marks3 + marks4 + marks5;
        double percentage = (total / 500.0) * 100;
        if(percentage >= 60) {
            System.out.println("First Division");
        } else if(percentage >= 50 && percentage < 60) {
            System.out.println("Second Division");
        } else if(percentage >= 40 && percentage < 50) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }
}