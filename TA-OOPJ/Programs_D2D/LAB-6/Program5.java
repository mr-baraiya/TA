// Write a Java program to create a class called Employee with a name, job title, and salary 
// attributes, and methods to calculate and update salary.

import java.util.Scanner;

class Employee {

    String name;
    String jobTitle;
    double salary;

    public void set(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void get() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

    public double calculateSalary(double percentage) {
        return salary + (salary * percentage / 100);
    }

    public void updateSalary(double percentage) {
        salary = salary + (salary * percentage / 100);
    }
}

public class Program5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter job title: ");
        String jobTitle = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        emp.set(name, jobTitle, salary);

        System.out.println("\n----- Employee Details -----");
        emp.get();

        System.out.print("\nEnter salary increment percentage: ");
        double percentage = sc.nextDouble();

        double newSalary = emp.calculateSalary(percentage);

        System.out.println("Calculated Salary: " + newSalary);

        emp.updateSalary(percentage);

        System.out.println("\n----- Updated Employee Details -----");
        emp.get();

        sc.close();
    }
}