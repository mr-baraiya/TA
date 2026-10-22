// Student manager program to manipulate student information from files using FileInputStream and FileOutputStream.[C]

import java.io.*;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileOutputStream fout = new FileOutputStream("student.txt");

            System.out.print("Enter Student ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student Marks: ");
            String marks = sc.nextLine();

            String data = id + "," + name + "," + marks;
            fout.write(data.getBytes());
            fout.close();

            System.out.println("\nStudent information saved.");

            FileInputStream fin = new FileInputStream("student.txt");

            System.out.println("\nStudent Information:");
            int ch;

            while ((ch = fin.read()) != -1) {
                System.out.print((char) ch);
            }

            fin.close();

        } catch (IOException e) {
            System.out.println(e);
        }

        sc.close();
    }
}