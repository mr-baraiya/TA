// Hospital Management System: Hospital parent class and Department derived class using super.[B]

class Hospital {
    protected String hospitalName;
    protected String city;

    public Hospital(String hospitalName, String city) {
        this.hospitalName = hospitalName;
        this.city = city;
    }

    public void displayInfo() {
        System.out.println("Hospital: " + hospitalName + " (" + city + ")");
    }
}

class Department extends Hospital {
    private String deptName;
    private int numberOfDoctors;

    public Department(String hospitalName, String city, String deptName, int numberOfDoctors) {
        super(hospitalName, city);
        this.deptName = deptName;
        this.numberOfDoctors = numberOfDoctors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // super calls parent method
        System.out.println("Department: " + deptName + " | Doctors Count: " + numberOfDoctors);
    }
}

public class Program4 {
    public static void main(String[] args) {
        Department dept = new Department("City Life Care Hospital", "Rajkot", "Cardiology", 12);
        dept.displayInfo();
    }
}
