// Replace all 'word1' by 'word2' from file1 to file2 and display number of replacements.[A]

import java.io.*;

public class Program1 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        // Write sample data to file1 if it does not exist
        try (FileWriter fw = new FileWriter(file1)) {
            fw.write("Java is awesome. Java is robust and Java is popular.\n");
        } catch (IOException e) {
            System.out.println("Error initializing file: " + e.getMessage());
        }

        String word1 = "Java";
        String word2 = "Python";
        int replacements = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Count occurrences
                int index = 0;
                while ((index = line.indexOf(word1, index)) != -1) {
                    replacements++;
                    index += word1.length();
                }
                String modifiedLine = line.replace(word1, word2);
                writer.write(modifiedLine);
                writer.newLine();
            }
            System.out.println("Replaced '" + word1 + "' with '" + word2 + "' from file1 to file2.");
            System.out.println("Total replacements: " + replacements);
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}
