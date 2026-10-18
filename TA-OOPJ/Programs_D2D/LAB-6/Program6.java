// Write a program to find length of string and print second half of the string.[C] 
import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Second half of string: " + str.substring(str.length() / 2));

        sc.close();
    }
}