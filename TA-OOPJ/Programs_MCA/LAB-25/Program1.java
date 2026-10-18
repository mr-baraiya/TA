// Package 'Darshan' with class 'BTech' within it, and class 'University' importing it.[A]

class BTech {
    public void displayProgramInfo() {
        System.out.println("Package: Darshan | Class: BTech | Course: Computer Science and Engineering");
    }
}

public class Program1 {
    public static void main(String[] args) {
        System.out.println("Simulating 'import Darshan.BTech':");
        BTech studentCourse = new BTech();
        studentCourse.displayProgramInfo();
    }
}
