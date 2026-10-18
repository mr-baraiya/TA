// Class Employee with work() and getSalary(), subclass HRManager overrides work() and adds addEmployee().[A]

class Employee {
    protected double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working on general company tasks.");
    }

    public double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    public HRManager(double salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing recruitment, employee relations, and HR policies.");
    }

    public void addEmployee(String name) {
        System.out.println("HR Manager added new employee: " + name);
    }
}

public class Program2 {
    public static void main(String[] args) {
        Employee emp = new Employee(45000);
        emp.work();
        System.out.println("Employee Salary: Rs " + emp.getSalary());

        HRManager hr = new HRManager(75000);
        hr.work();
        System.out.println("HR Manager Salary: Rs " + hr.getSalary());
        hr.addEmployee("Rohan Sharma");
    }
}
