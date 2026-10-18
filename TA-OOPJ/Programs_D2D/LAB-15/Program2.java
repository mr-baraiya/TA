// Write a program to check that whether the name given from command line is file or 
// not. If it is a file then print the size of file and if it is directory then it should display the 
// name of all files in it. [B]

import java.io.File;

public class Program2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Program2 <path_name>");
            return;
        }

        String pathName = args[0];
        File file = new File(pathName);

        if (!file.exists()) {
            System.out.println("Error: The path '" + pathName + "' does not exist.");
            return;
        }

        if (file.isFile()) {
            System.out.println("Path: '" + pathName + "' is a FILE.");
            System.out.println("File Size: " + file.length() + " bytes (" + (file.length() / 1024.0) + " KB)");
        } else if (file.isDirectory()) {
            System.out.println("Path: '" + pathName + "' is a DIRECTORY.");
            String[] fileList = file.list();
            if (fileList != null && fileList.length > 0) {
                System.out.println("\nFiles and directories inside '" + pathName + "':");
                for (String name : fileList) {
                    File child = new File(file, name);
                    String type = child.isDirectory() ? "[DIR] " : "[FILE]";
                    System.out.println(type + " " + name);
                }
            } else {
                System.out.println("Directory is empty.");
            }
        } else {
            System.out.println("Unknown file type.");
        }
    }
}
