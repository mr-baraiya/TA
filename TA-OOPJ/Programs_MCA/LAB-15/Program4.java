// Design a program to compare two student objects and return the object having higher marks.[C]

class StudentComparison {
    int rollNo;
    String name;
    double marks;

    public StudentComparison(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public static StudentComparison getHigherStudent(StudentComparison s1, StudentComparison s2) {
        return s1.marks >= s2.marks ? s1 : s2;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo + " | Name: " + name + " | Marks: " + marks);
    }
}

public class Program4 {
    public static void main(String[] args) {
        StudentComparison s1 = new StudentComparison(1, "Ravi", 88.5);
        StudentComparison s2 = new StudentComparison(2, "Meera", 92.0);

        System.out.println("Student 1:"); s1.display();
        System.out.println("Student 2:"); s2.display();

        StudentComparison top = StudentComparison.getHigherStudent(s1, s2);
        System.out.println("\nStudent with higher marks:");
        top.display();
    }
}
