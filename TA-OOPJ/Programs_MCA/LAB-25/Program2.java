// University Management System: academic-related classes in package university accessed from administration.[A]

import University.Student;

public class Program2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}

// javac -d . university\Student.java Program2.java
// java Program2