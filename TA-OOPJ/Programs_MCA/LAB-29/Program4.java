// Sort as per SPI from the List of students stored as ArrayList.[C]

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentSortable {
    int studentId;
    String studentName;
    int studentRollNo;
    double studentSPI;

    public StudentSortable(int id, String name, int rollNo, double spi) {
        this.studentId = id;
        this.studentName = name;
        this.studentRollNo = rollNo;
        this.studentSPI = spi;
    }

    public double getSPI() {
        return studentSPI;
    }

    public void display() {
        System.out.printf("ID: %-4d | Roll: %-4d | Name: %-15s | SPI: %.2f%n", studentId, studentRollNo, studentName, studentSPI);
    }
}

public class Program4 {
    public static void main(String[] args) {
        List<StudentSortable> students = new ArrayList<>();

        students.add(new StudentSortable(1, "Aarav Mehta", 101, 8.75));
        students.add(new StudentSortable(2, "Diya Patel", 102, 9.40));
        students.add(new StudentSortable(3, "Kabir Shah", 103, 7.90));
        students.add(new StudentSortable(4, "Sneha Joshi", 104, 9.15));

        System.out.println("--- Before Sorting ---");
        for (StudentSortable s : students) s.display();

        // Sort descending by SPI (highest first)
        students.sort(Comparator.comparingDouble(StudentSortable::getSPI).reversed());

        System.out.println("\n--- After Sorting by SPI (Descending) ---");
        for (StudentSortable s : students) s.display();
    }
}
