// ArrayList to store and display List of Student class with StudentID, StudentName, StudentRollNo, StudentSPI.[C]

import java.util.ArrayList;
import java.util.List;

class StudentItem {
    int studentId;
    String studentName;
    int studentRollNo;
    double studentSPI;

    public StudentItem(int id, String name, int rollNo, double spi) {
        this.studentId = id;
        this.studentName = name;
        this.studentRollNo = rollNo;
        this.studentSPI = spi;
    }

    public void display() {
        System.out.printf("ID: %-4d | Roll: %-4d | Name: %-15s | SPI: %.2f%n", studentId, studentRollNo, studentName, studentSPI);
    }
}

public class Program3 {
    public static void main(String[] args) {
        List<StudentItem> students = new ArrayList<>();

        students.add(new StudentItem(1, "Aarav Mehta", 101, 8.75));
        students.add(new StudentItem(2, "Diya Patel", 102, 9.40));
        students.add(new StudentItem(3, "Kabir Shah", 103, 7.90));

        System.out.println("=== Students Stored in ArrayList ===");
        for (StudentItem s : students) {
            s.display();
        }
    }
}
