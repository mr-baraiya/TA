// Copy content of one file to another using Byte and Character Stream both.[B]

import java.io.*;

public class Program2 {
    public static void copyUsingByteStream(File src, File dest) throws IOException {
        try (FileInputStream in = new FileInputStream(src);
             FileOutputStream out = new FileOutputStream(dest)) {
            int byteData;
            while ((byteData = in.read()) != -1) {
                out.write(byteData);
            }
        }
        System.out.println("Byte Stream Copy Successful -> " + dest.getName());
    }

    public static void copyUsingCharStream(File src, File dest) throws IOException {
        try (FileReader reader = new FileReader(src);
             FileWriter writer = new FileWriter(dest)) {
            int charData;
            while ((charData = reader.read()) != -1) {
                writer.write(charData);
            }
        }
        System.out.println("Character Stream Copy Successful -> " + dest.getName());
    }

    public static void main(String[] args) {
        File source = new File("source.txt");
        try (FileWriter fw = new FileWriter(source)) {
            fw.write("Demonstrating file copy using Byte and Character streams in Java.\n");
        } catch (IOException e) {}

        File byteDest = new File("dest_byte.txt");
        File charDest = new File("dest_char.txt");

        try {
            copyUsingByteStream(source, byteDest);
            copyUsingCharStream(source, charDest);
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
