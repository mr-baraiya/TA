// Replace all 'word1' by 'word2' from file1 to file2 and display number of replacements.[A]

import java.io.*;

public class Program1 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
            StringBuilder data = new StringBuilder();
            String line;

            do {
                line = br.readLine();
                if (line != null) {
                    data.append(line).append("\n");
                }
            } while (line != null);
            br.close();

            System.out.println("data :" + data.toString());

            String text = data.toString();
            int count = 0;
            int index = 0;

            do {
                index = text.indexOf("word1", index);

                if (index != -1) {
                    count++;
                    index += 5;
                }
            } while (index != -1);

            text = text.replace("word1", "word2");

            FileWriter fw = new FileWriter("file2.txt");
            fw.write(text);
            fw.close();

            System.out.println("Number of replacements: " + count);
            System.out.println("Updated content written to file2.txt");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}