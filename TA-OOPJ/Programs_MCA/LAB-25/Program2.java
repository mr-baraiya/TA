// University Management System: academic-related classes in package university accessed from administration.[A]

class UnivStudentRecord {
    private String name;
    private String enrollmentNo;

    public UnivStudentRecord(String name, String enrollmentNo) {
        this.name = name;
        this.enrollmentNo = enrollmentNo;
    }

    public void display() {
        System.out.println("Student: " + name + " (Enrollment: " + enrollmentNo + ")");
    }
}

class UnivFacultyRecord {
    private String name;
    private String department;

    public UnivFacultyRecord(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void display() {
        System.out.println("Faculty: " + name + " (Dept: " + department + ")");
    }
}

public class Program2 {
    public static void main(String[] args) {
        System.out.println("=== Administration Module Accessing University Package ===");
        UnivStudentRecord s = new UnivStudentRecord("Kishan Dave", "MCA202615");
        UnivFacultyRecord f = new UnivFacultyRecord("Prof. Swati Sharma", "Computer Science");

        s.display();
        f.display();
    }
}
