// Print the following Patterns: [B]
// Number & Character patterns (1..12345, 1..22..333, DARSHAN pattern)

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("\nPattern 1 (Incrementing Numbers):");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern 2 (Repeated Row Numbers):");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern 3 (Word Pyramid - DARSHAN):");
        String word = "DARSHAN";
        for (int i = 1; i <= word.length(); i++) {
            System.out.println(word.substring(0, i));
        }
        sc.close();
    }
}
