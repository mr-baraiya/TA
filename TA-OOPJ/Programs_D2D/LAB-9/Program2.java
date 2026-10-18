// Write a Java program to create a class called Employee with methods called work() and 
// getSalary(). Create a subclass called HRManager that overrides the work() method and 
// adds a new method called addEmployee().[A]
class Employee {

    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return 50000;
    }
}

class HRManager extends Employee {

    @Override
    public void work() {
        System.out.println("HR Manager is managing employees.");
    }

    public void addEmployee() {
        System.out.println("HR Manager added a new employee.");
    }
}

public class Program2 {
    public static void main(String[] args) {

        Employee emp = new Employee();
        HRManager hr = new HRManager();

        System.out.println("Employee:");
        emp.work();
        System.out.println("Salary: " + emp.getSalary());

        System.out.println("\nHR Manager:");
        hr.work();
        System.out.println("Salary: " + hr.getSalary());
        hr.addEmployee();
    }
}