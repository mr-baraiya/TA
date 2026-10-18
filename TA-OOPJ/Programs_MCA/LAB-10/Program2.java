// Write an interactive program to print a string entered in a pyramid form.[A]

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.next();

        System.out.println("Pyramid form:");
        for (int i = 1; i <= str.length(); i++) {
            System.out.println(str.substring(0, i));
        }
        sc.close();
    }
}
