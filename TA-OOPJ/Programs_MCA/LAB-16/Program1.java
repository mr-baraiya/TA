// Student and Exam inheritance with SPI calculation.[A]

import java.util.Scanner;

class StudentRecord {
    int idNo;
    int noOfSubjects;
    String[] subjectCode;
    int[] subjectCredits;
    String[] gradeObtained;

    public StudentRecord(int idNo, int n) {
        this.idNo = idNo;
        this.noOfSubjects = n;
        this.subjectCode = new String[n];
        this.subjectCredits = new int[n];
        this.gradeObtained = new String[n];
    }
}

class Exam extends StudentRecord {
    public Exam(int idNo, int n) {
        super(idNo, n);
    }

    public int gradeToPoint(String grade) {
        switch (grade.toUpperCase()) {
            case "AA": return 10;
            case "AB": return 9;
            case "BB": return 8;
            case "BC": return 7;
            case "CC": return 6;
            case "CD": return 5;
            case "DD": return 4;
            default: return 0;
        }
    }

    public double calculateSPI() {
        int totalCredits = 0;
        int weightedPoints = 0;
        for (int i = 0; i < noOfSubjects; i++) {
            totalCredits += subjectCredits[i];
            weightedPoints += subjectCredits[i] * gradeToPoint(gradeObtained[i]);
        }
        return totalCredits == 0 ? 0 : (double) weightedPoints / totalCredits;
    }
}

public class Program1 {
    public static void main(String[] args) {
        Exam exam = new Exam(101, 3);
        exam.subjectCode[0] = "CS101"; exam.subjectCredits[0] = 4; exam.gradeObtained[0] = "AA";
        exam.subjectCode[1] = "CS102"; exam.subjectCredits[1] = 4; exam.gradeObtained[1] = "AB";
        exam.subjectCode[2] = "CS103"; exam.subjectCredits[2] = 2; exam.gradeObtained[2] = "BB";

        System.out.println("Student ID: " + exam.idNo);
        System.out.printf("Calculated SPI: %.2f%n", exam.calculateSPI());
    }
}
