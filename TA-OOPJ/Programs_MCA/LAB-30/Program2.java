// Food Ordering System bill generation in foodBill.txt file.[B]

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program2 {
    public static void main(String[] args) {
        File billFile = new File("foodBill.txt");

        try (PrintWriter writer = new PrintWriter(new FileWriter(billFile))) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String now = dtf.format(LocalDateTime.now());

            writer.println("=================================================");
            writer.println("           DARSHAN CAFE & RESTAURANT             ");
            writer.println("                 TAX INVOICE                     ");
            writer.println("=================================================");
            writer.println("Date & Time: " + now);
            writer.println("Invoice No : INV-" + System.currentTimeMillis() % 100000);
            writer.println("-------------------------------------------------");
            writer.printf("%-4s %-22s %-6s %-8s%n", "No.", "Item", "Qty", "Amount");
            writer.println("-------------------------------------------------");

            double item1 = 300.00;
            double item2 = 160.00;
            double item3 = 120.00;
            double subtotal = item1 + item2 + item3;
            double gst = subtotal * 0.05;
            double total = subtotal + gst;

            writer.printf("%-4d %-22s %-6d Rs %-7.2f%n", 1, "Medium Cheese Pizza", 1, item1);
            writer.printf("%-4d %-22s %-6d Rs %-7.2f%n", 2, "Paneer Burger", 1, item2);
            writer.printf("%-4d %-22s %-6d Rs %-7.2f%n", 3, "Cold Coffee", 1, item3);
            writer.println("-------------------------------------------------");
            writer.printf("Subtotal              : Rs %.2f%n", subtotal);
            writer.printf("GST (5%%)              : Rs %.2f%n", gst);
            writer.println("-------------------------------------------------");
            writer.printf("GRAND TOTAL           : Rs %.2f%n", total);
            writer.println("=================================================");
            writer.println("          Thank You! Visit Again!               ");
            writer.println("=================================================");

            System.out.println("Food Ordering Bill successfully generated in " + billFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error generating bill: " + e.getMessage());
        }
    }
}
