// Refine the student manager program to manipulate the student information from files 
// by using the BufferedReader and BufferedWriter. [A]

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class StudentRecord {
    private int id;
    private String name;
    private double spi;

    public StudentRecord(int id, String name, double spi) {
        this.id = id;
        this.name = name;
        this.spi = spi;
    }

    public String toCSV() {
        return id + "," + name + "," + spi;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | SPI: " + spi;
    }
}

public class Program1 {
    private static final String FILE_NAME = "student_records.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Advanced Student Manager (BufferedReader / BufferedWriter) ===");
            System.out.println("1. Add Student Record");
            System.out.println("2. Display All Student Records");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Student SPI: ");
                    double spi = sc.nextDouble();

                    StudentRecord record = new StudentRecord(id, name, spi);
                    addStudent(record);
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    System.out.println("Exiting Advanced Student Manager.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent(StudentRecord record) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(record.toCSV());
            bw.newLine();
            System.out.println("Student record saved successfully using BufferedWriter.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    private static void displayStudents() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("No records file found.");
            return;
        }

        System.out.println("\n--- All Student Records ---");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split(",");
                    if (parts.length == 3) {
                        System.out.println("ID: " + parts[0] + " | Name: " + parts[1] + " | SPI: " + parts[2]);
                        count++;
                    }
                }
            }
            System.out.println("Total records: " + count);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
