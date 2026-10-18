// Write a program that counts number of characters, words, and lines in a file. Use 
// exceptions to check whether the file that is read exists or not. [A]

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filePath = inputScanner.nextLine();

        File file = new File(filePath);

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lineCount++;
                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (words.length > 0 && !words[0].isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("--- File Statistics ---");
            System.out.println("Lines     : " + lineCount);
            System.out.println("Words     : " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found at '" + filePath + "'. Please check the path and try again.");
        } finally {
            inputScanner.close();
        }
    }
}
