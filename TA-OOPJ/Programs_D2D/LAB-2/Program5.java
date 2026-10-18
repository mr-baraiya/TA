// Write a program that prompts the user to enter a letter and check whether a letter is a 
// vowel or a constant.[C] 

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char letter = sc.next().charAt(0);
        letter = Character.toLowerCase(letter);
        if(!Character.isLetter(letter)) {
            System.out.println(letter + " is not a letter.");
        }
        else if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println(letter + " is a vowel.");
        } else {
            System.out.println(letter + " is a consonant.");
        }
        sc.close();
    }
}
