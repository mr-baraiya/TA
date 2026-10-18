// Declare a class called Student having following data members:id_no, 
// no_of_subjects_registered, subject_code, subject_credits, grade_obtained and spi. 
// Define constructor and calculate_spi methods. Define main to instantiate an array for 
// objects of class student to process data of n students [A] 

import java.util.Scanner;

class Student {
    int id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    char[] grade_obtained;
    double spi;

    public Student(int id_no, int no_of_subjects_registered) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;

        subject_code = new String[no_of_subjects_registered];
        subject_credits = new int[no_of_subjects_registered];
        grade_obtained = new char[no_of_subjects_registered];
    }

    public void calculate_spi() {
        int totalCredits = 0;
        int totalPoints = 0;

        for (int i = 0; i < no_of_subjects_registered; i++) {
            int gradePoint = 0;

            switch (grade_obtained[i]) {
                case 'A':
                    gradePoint = 10;
                    break;
                case 'B':
                    gradePoint = 8;
                    break;
                case 'C':
                    gradePoint = 7;
                    break;
                case 'D':
                    gradePoint = 6;
                    break;
                case 'E':
                    gradePoint = 5;
                    break;
                case 'F':
                    gradePoint = 0;
                    break;
            }

            totalCredits += subject_credits[i];
            totalPoints += subject_credits[i] * gradePoint;
        }

        spi = (double) totalPoints / totalCredits;
    }

    public void display() {
        System.out.println("\nStudent ID: " + id_no);

        for (int i = 0; i < no_of_subjects_registered; i++) {
            System.out.println(
                subject_code[i] + "  Credits: " +
                subject_credits[i] + "  Grade: " +
                grade_obtained[i]
            );
        }

        System.out.printf("SPI: %.2f%n", spi);
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter number of subjects: ");
            int subjects = sc.nextInt();

            students[i] = new Student(id, subjects);

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter subject code: ");
                students[i].subject_code[j] = sc.next();

                System.out.print("Enter subject credits: ");
                students[i].subject_credits[j] = sc.nextInt();

                System.out.print("Enter grade (A/B/C/D/E/F): ");
                students[i].grade_obtained[j] = sc.next().charAt(0);
            }

            students[i].calculate_spi();
        }

        System.out.println("\nSTUDENT DETAILS :");

        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        sc.close();
    }
}