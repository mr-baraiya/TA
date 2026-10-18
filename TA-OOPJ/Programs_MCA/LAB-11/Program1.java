// Create class Student with attributes (name, roll_no, SPI, course). Implement getter() and setter() for 3 students.[A]

class Student {
    private String name;
    private int roll_no;
    private double SPI;
    private String course;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getRollNo() { return roll_no; }
    public void setRollNo(int roll_no) { this.roll_no = roll_no; }

    public double getSPI() { return SPI; }
    public void setSPI(double SPI) { this.SPI = SPI; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public void display() {
        System.out.println("Roll No: " + roll_no + ", Name: " + name + ", Course: " + course + ", SPI: " + SPI);
    }
}

public class Program1 {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student();
        students[0].setRollNo(101);
        students[0].setName("Alice");
        students[0].setCourse("MCA");
        students[0].setSPI(8.5);

        students[1] = new Student();
        students[1].setRollNo(102);
        students[1].setName("Bob");
        students[1].setCourse("MCA");
        students[1].setSPI(9.1);

        students[2] = new Student();
        students[2].setRollNo(103);
        students[2].setName("Charlie");
        students[2].setCourse("MCA");
        students[2].setSPI(7.8);

        System.out.println("=== Student Details ===");
        for (Student s : students) {
            s.display();
        }
    }
}
