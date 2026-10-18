 // Create class Student with attributes (name: String, roll_no:int, SPI:double, 
// course: String). Implement getter() and setter() method to assign data for 3 
// students and display it.[A] 

import java.util.Scanner;

class Student {

    String name;
    int rollNo;
    double spi;
    String course;

    public void set(String name, int rollNo, double spi, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.spi = spi;
        this.course = course;
    }

    public void get() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("SPI: " + spi);
        System.out.println("Course: " + course);
    }
}

public class Program1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {

            students[i] = new Student();

            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            int rollNo = sc.nextInt();

            System.out.print("Enter SPI: ");
            double spi = sc.nextDouble();

            sc.nextLine();

            System.out.print("Enter course: ");
            String course = sc.nextLine();

            students[i].set(name, rollNo, spi, course);
        }

        System.out.println("\n----- Student Details -----");

        for (int i = 0; i < 3; i++) {

            System.out.println("\nStudent " + (i + 1));
            students[i].get();
        }

        sc.close();
    }
}