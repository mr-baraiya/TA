// Write a java program to take user input [A] 
// i. Through Command Line Argument. 
// ii. Through Scanner class. 

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        
        // String name = args[0];
        // int age = Integer.parseInt(args[1]);
        // System.out.println("Name = "+name+"\nAge = "+age);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Name = " + name + "\nAge = " + age);
        sc.close();
        
    }
}
