// Write a java program to compute shopping bill with discount rules.[C]

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total purchase amount: Rs ");
        double bill = sc.nextDouble();

        double discountRate = 0.0;
        if (bill >= 5000) {
            discountRate = 0.20;
        } else if (bill >= 3000) {
            discountRate = 0.15;
        } else if (bill >= 1000) {
            discountRate = 0.10;
        } else {
            discountRate = 0.0;
        }

        double discount = bill * discountRate;
        double netPayable = bill - discount;

        System.out.printf("Original Bill   : Rs %.2f%n", bill);
        System.out.printf("Discount (%.0f%%) : Rs %.2f%n", (discountRate * 100), discount);
        System.out.printf("Final Payable   : Rs %.2f%n", netPayable);
        sc.close();
    }
}
