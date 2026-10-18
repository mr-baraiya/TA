// Create a class called Student. Write a student manager program to manipulate the 
// student information from files by using FileInputStream and FileOutputStream. [C]

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double spi;

    public Student(int id, String name, double spi) {
        this.id = id;
        this.name = name;
        this.spi = spi;
    }

    public String toRecordString() {
        return id + "," + name + "," + spi + "\n";
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | SPI: " + spi;
    }
}

public class Program4 {
    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Student Manager (FileInputStream / FileOutputStream) ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
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

                    Student student = new Student(id, name, spi);
                    writeStudentToFile(student);
                    break;

                case 2:
                    readStudentsFromFile();
                    break;

                case 3:
                    System.out.println("Exiting Student Manager.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void writeStudentToFile(Student s) {
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME, true)) {
            byte[] bytes = s.toRecordString().getBytes();
            fos.write(bytes);
            System.out.println("Student record added successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void readStudentsFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("No records found.");
            return;
        }

        System.out.println("\n--- All Student Records ---");
        try (FileInputStream fis = new FileInputStream(file)) {
            StringBuilder sb = new StringBuilder();
            int ch;
            while ((ch = fis.read()) != -1) {
                sb.append((char) ch);
            }

            String[] lines = sb.toString().split("\n");
            for (String line : lines) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split(",");
                    if (parts.length == 3) {
                        System.out.println("ID: " + parts[0] + " | Name: " + parts[1] + " | SPI: " + parts[2]);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
