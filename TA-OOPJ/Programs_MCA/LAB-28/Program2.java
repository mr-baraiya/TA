// Count occurrences of digit 5 in file supplied as command-line argument.[B]

import java.io.*;

public class Program2 {
    public static void main(String[] args) {
        String filename = "digits.txt";
        if (args.length > 0) {
            filename = args[0];
        }

        File file = new File(filename);
        if (!file.exists()) {
            try (FileWriter fw = new FileWriter(file)) {
                fw.write("Call 555-0199 or 54321 on day 25 of month 5.\n");
            } catch (IOException e) {}
        }

        int count5 = 0;
        try (FileReader reader = new FileReader(file)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if ((char) ch == '5') {
                    count5++;
                }
            }
            System.out.println("File: " + file.getName());
            System.out.println("Occurrences of digit '5': " + count5);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
