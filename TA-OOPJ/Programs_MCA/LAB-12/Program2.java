// Write a Java program to create a class called Employee with a name, job title, and salary, and methods to calculate and update salary.[B]

class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void updateSalary(double percentageIncrement) {
        if (percentageIncrement > 0) {
            this.salary += this.salary * (percentageIncrement / 100.0);
            System.out.println("Salary updated by " + percentageIncrement + "% for " + name);
        }
    }

    public void display() {
        System.out.println("Employee: " + name + " | Title: " + jobTitle + " | Salary: Rs " + salary);
    }
}

public class Program2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Rohan Verma", "Software Engineer", 60000.0);
        emp.display();

        emp.updateSalary(10); // 10% raise
        emp.display();
    }
}
