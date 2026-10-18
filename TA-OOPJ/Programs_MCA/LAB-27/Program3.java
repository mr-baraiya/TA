// Student manager program to manipulate student information from files using FileInputStream and FileOutputStream.[C]

import java.io.*;
import java.util.Scanner;

class StudentFileRecord implements Serializable {
    private static final long serialVersionUID = 1L;
    int rollNo;
    String name;
    double spi;

    public StudentFileRecord(int rollNo, String name, double spi) {
        this.rollNo = rollNo;
        this.name = name;
        this.spi = spi;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo + " | Name: " + name + " | SPI: " + spi);
    }
}

public class Program3 {
    public static void main(String[] args) {
        File dataFile = new File("students.dat");

        // Write student record using FileOutputStream & ObjectOutputStream
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dataFile))) {
            StudentFileRecord s1 = new StudentFileRecord(101, "Aarav Patel", 8.9);
            StudentFileRecord s2 = new StudentFileRecord(102, "Sneha Shah", 9.4);
            oos.writeObject(s1);
            oos.writeObject(s2);
            System.out.println("Saved 2 student records to " + dataFile.getName());
        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
        }

        // Read student record using FileInputStream & ObjectInputStream
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dataFile))) {
            System.out.println("\nReading records from " + dataFile.getName() + ":");
            StudentFileRecord r1 = (StudentFileRecord) ois.readObject();
            StudentFileRecord r2 = (StudentFileRecord) ois.readObject();
            r1.display();
            r2.display();
        } catch (Exception e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }
}
