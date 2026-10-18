// Create a class which ask user to enter a sentence, display count of each vowel type. Continue till user enters "quit".[B]

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;

        while (true) {
            System.out.print("Enter a sentence (or 'quit' to exit): ");
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("quit")) {
                break;
            }

            int a = 0, e = 0, i = 0, o = 0, u = 0;
            for (char ch : line.toLowerCase().toCharArray()) {
                if (ch == 'a') a++;
                else if (ch == 'e') e++;
                else if (ch == 'i') i++;
                else if (ch == 'o') o++;
                else if (ch == 'u') u++;
            }

            System.out.println("Vowels in sentence: A=" + a + ", E=" + e + ", I=" + i + ", O=" + o + ", U=" + u);
            totalA += a; totalE += e; totalI += i; totalO += o; totalU += u;
        }

        System.out.println("\n=== Total Vowel Count for All Sentences ===");
        System.out.println("A: " + totalA + " | E: " + totalE + " | I: " + totalI + " | O: " + totalO + " | U: " + totalU);
        sc.close();
    }
}
