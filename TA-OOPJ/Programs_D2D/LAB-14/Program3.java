// Write an application that reads a file and counts the number of occurrences of digit 5. 
// Supply the file name as a command-line argument. [B]

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Program3 <filename>");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);
        int countFive = 0;

        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                for (char ch : line.toCharArray()) {
                    if (ch == '5') {
                        countFive++;
                    }
                }
            }

            System.out.println("File: " + fileName);
            System.out.println("Total occurrences of digit '5': " + countFive);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File '" + fileName + "' not found.");
        }
    }
}
