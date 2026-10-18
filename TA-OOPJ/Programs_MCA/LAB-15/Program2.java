// Store employee details using instance variables and common company name using static variable.[A]

class CorporateEmployee {
    int empId;
    String name;
    static String companyName = "TechCorp Global";

    public CorporateEmployee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + empId + " | Name: " + name + " | Company: " + companyName);
    }
}

public class Program2 {
    public static void main(String[] args) {
        CorporateEmployee e1 = new CorporateEmployee(101, "Aarav");
        CorporateEmployee e2 = new CorporateEmployee(102, "Sneha");

        e1.display();
        e2.display();
    }
}
