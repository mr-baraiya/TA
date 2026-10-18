// A power company charges: Rs 5 per unit for first 100 units, Rs 7 for next 100, Rs 10 above 200, plus Rs 50 meter surcharge.[B]

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total units consumed: ");
        double units = sc.nextDouble();

        double bill = 0;
        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = (100 * 5) + ((units - 100) * 7);
        } else {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        double surcharge = 50.0;
        double totalBill = bill + surcharge;

        System.out.printf("Energy Charges: Rs %.2f%n", bill);
        System.out.printf("Meter Surcharge: Rs %.2f%n", surcharge);
        System.out.printf("Total Electricity Bill: Rs %.2f%n", totalBill);
        sc.close();
    }
}
