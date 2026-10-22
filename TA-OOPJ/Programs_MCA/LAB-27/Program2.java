// Copy content of one file to another using Byte and Character Stream both.[B]

import java.io.*;

public class Program2 {
    public static void main(String[] args) {
        try {
            // Byte Stream
            FileInputStream fin = new FileInputStream("file1.txt");
            FileOutputStream fout = new FileOutputStream("file2.txt");

            int ch;
            while ((ch = fin.read()) != -1) {
                fout.write(ch);
            }

            fin.close();
            fout.close();
            System.out.println("Copied using Byte Stream.");

            // Character Stream
            FileReader fr = new FileReader("file1.txt");
            FileWriter fw = new FileWriter("file3.txt");

            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }

            fr.close();
            fw.close();
            System.out.println("Copied using Character Stream.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}