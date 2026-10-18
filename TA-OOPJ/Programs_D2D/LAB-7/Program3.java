// Create a class which ask the user to enter a sentence, and it should display count of 
// each vowel type in the sentence. The program should continue till user enters a word 
// “quit”. Display the total count of each vowel for all sentences. [B] 

import java.util.Scanner;

class VowelCounter {

    int a = 0;
    int e = 0;
    int i = 0;
    int o = 0;
    int u = 0;

    // Count vowels in a sentence
    public void countVowels(String sentence) {

        sentence = sentence.toLowerCase();

        for (int j = 0; j < sentence.length(); j++) {

            char ch = sentence.charAt(j);

            if (ch == 'a') {
                a++;
            }
            else if (ch == 'e') {
                e++;
            }
            else if (ch == 'i') {
                i++;
            }
            else if (ch == 'o') {
                o++;
            }
            else if (ch == 'u') {
                u++;
            }
        }
    }

    public void displayCount() {

        System.out.println("\n----- Total Vowel Count -----");
        System.out.println("A = " + a);
        System.out.println("E = " + e);
        System.out.println("I = " + i);
        System.out.println("O = " + o);
        System.out.println("U = " + u);
    }
}

public class Program3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VowelCounter obj = new VowelCounter();

        while (true) {

            System.out.print("Enter a sentence (enter 'quit' to stop): ");
            String sentence = sc.nextLine();

            if (sentence.equalsIgnoreCase("quit")) {
                break;
            }

            obj.countVowels(sentence);
        }

        obj.displayCount();

        sc.close();
    }
}