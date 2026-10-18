// JDK installation and configuration.[A]

public class Program1 {
    public static void main(String[] args) {
        System.out.println("=== JDK Environment & Installation Details ===");
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Home   : " + System.getProperty("java.home"));
        System.out.println("OS Name     : " + System.getProperty("os.name"));
        System.out.println("User Name   : " + System.getProperty("user.name"));
        System.out.println("JDK successfully installed and configured!");
    }
}
