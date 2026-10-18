// Copy content using Buffered Stream and BufferedReader/Writer.[C]

import java.io.*;

public class Program3 {
    public static void copyBufferedStream(File src, File dest) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
        System.out.println("Buffered Stream Copy Completed -> " + dest.getName());
    }

    public static void copyBufferedReaderWriter(File src, File dest) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(src));
             BufferedWriter bw = new BufferedWriter(new FileWriter(dest))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        }
        System.out.println("BufferedReader & BufferedWriter Copy Completed -> " + dest.getName());
    }

    public static void main(String[] args) {
        File src = new File("advanced_io_source.txt");
        try (FileWriter fw = new FileWriter(src)) {
            fw.write("Advanced IO performance with buffered stream and character streams.\nFast buffer transfer.\n");
        } catch (IOException e) {}

        File dest1 = new File("copy_buffered_stream.txt");
        File dest2 = new File("copy_buffered_writer.txt");

        try {
            copyBufferedStream(src, dest1);
            copyBufferedReaderWriter(src, dest2);
        } catch (IOException e) {
            System.out.println("Copy error: " + e.getMessage());
        }
    }
}
