// Write a program to replace all “word1” by “word2” from a file1, and output is written 
// to file2 file and display the no. of replacement. [A]

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source file path (file1): ");
        String file1Path = sc.nextLine();
        System.out.print("Enter target file path (file2): ");
        String file2Path = sc.nextLine();

        System.out.print("Enter word to replace (word1): ");
        String word1 = sc.next();
        System.out.print("Enter replacement word (word2): ");
        String word2 = sc.next();

        File file1 = new File(file1Path);
        File file2 = new File(file2Path);

        int replacementCount = 0;

        try (Scanner reader = new Scanner(file1);
             PrintWriter writer = new PrintWriter(file2)) {

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                // Count occurrences of word1 in line
                int lastIndex = 0;
                while ((lastIndex = line.indexOf(word1, lastIndex)) != -1) {
                    replacementCount++;
                    lastIndex += word1.length();
                }

                String modifiedLine = line.replaceAll(word1, word2);
                writer.println(modifiedLine);
            }

            System.out.println("Replacement complete!");
            System.out.println("Total replacements of '" + word1 + "' with '" + word2 + "': " + replacementCount);
            System.out.println("Output written to: " + file2Path);

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
