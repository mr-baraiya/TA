// Write a program that prompts the user to enter a letter and check whether a letter is a vowel or a constant.[C]

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            char lower = Character.toLowerCase(ch);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        } else {
            System.out.println(ch + " is not a valid alphabet letter.");
        }
        sc.close();
    }
}
