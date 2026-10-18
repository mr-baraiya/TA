// University Management System: Person base class, Student and Faculty derived classes.[B]

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + " | Age: " + age);
    }
}

class UnivStudent extends Person {
    private String enrollmentNo;
    private String branch;

    public UnivStudent(String name, int age, String enrollmentNo, String branch) {
        super(name, age);
        this.enrollmentNo = enrollmentNo;
        this.branch = branch;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Student | Enrollment: " + enrollmentNo + " | Branch: " + branch);
    }
}

class Faculty extends Person {
    private String employeeId;
    private String department;

    public Faculty(String name, int age, String employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Faculty | Emp ID: " + employeeId + " | Department: " + department);
    }
}

public class Program3 {
    public static void main(String[] args) {
        UnivStudent s = new UnivStudent("Karan Patel", 21, "MCA202601", "Computer Applications");
        Faculty f = new Faculty("Dr. Swati Sharma", 38, "FAC108", "Computer Science");

        System.out.println("--- Student Information ---");
        s.displayDetails();

        System.out.println("\n--- Faculty Information ---");
        f.displayDetails();
    }
}
