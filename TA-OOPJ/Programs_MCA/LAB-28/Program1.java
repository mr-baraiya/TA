// Count number of characters, words, and lines in a file with existence check exception.[A]

import java.io.*;

public class Program1 {
    public static void main(String[] args) {
        File file = new File("sample.txt");

        // Ensure sample file exists for demonstration
        if (!file.exists()) {
            try (FileWriter fw = new FileWriter(file)) {
                fw.write("Hello world!\nJava file processing demonstration.\nCount characters, words, and lines.\n");
            } catch (IOException e) {}
        }

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File '" + file.getName() + "' does not exist!");
            }

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    lineCount++;
                    charCount += line.length();
                    String[] words = line.trim().split("\\s+");
                    if (words.length > 0 && !words[0].isEmpty()) {
                        wordCount += words.length;
                    }
                }
            }

            System.out.println("File: " + file.getName());
            System.out.println("Total Lines     : " + lineCount);
            System.out.println("Total Words     : " + wordCount);
            System.out.println("Total Characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
