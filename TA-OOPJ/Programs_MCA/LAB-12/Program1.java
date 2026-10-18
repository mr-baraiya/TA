// Develop a program that validates student marks using a constructor and displays whether the student is eligible for placement.[A]

class PlacementStudent {
    private String name;
    private double marks;
    private boolean eligible;

    public PlacementStudent(String name, double marks) {
        this.name = name;
        this.marks = marks;
        // Eligibility rule: 60% or higher
        this.eligible = marks >= 60.0;
    }

    public void displayStatus() {
        System.out.println("Student: " + name + " | Marks: " + marks + "% | Placement Eligible: " + (eligible ? "YES" : "NO"));
    }
}

public class Program1 {
    public static void main(String[] args) {
        PlacementStudent s1 = new PlacementStudent("Aarav", 78.5);
        PlacementStudent s2 = new PlacementStudent("Diya", 54.0);
        PlacementStudent s3 = new PlacementStudent("Kabir", 62.0);

        s1.displayStatus();
        s2.displayStatus();
        s3.displayStatus();
    }
}
