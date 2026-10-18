// Write a Java program to simulate an ATM system where invalid transactions are skipped using continue/break.[B]

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000.0;
        System.out.println("=== Welcome to ATM System ===");
        System.out.println("Starting Balance: Rs " + balance);

        while (true) {
            System.out.println("\n1. Check Balance | 2. Deposit | 3. Withdraw | 4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: Rs " + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: Rs ");
                    double deposit = sc.nextDouble();
                    if (deposit <= 0) {
                        System.out.println("Invalid deposit amount! Transaction skipped.");
                        continue;
                    }
                    balance += deposit;
                    System.out.println("Deposited successfully. New Balance: Rs " + balance);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: Rs ");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= 0) {
                        System.out.println("Invalid withdrawal amount! Transaction skipped.");
                        continue;
                    }
                    if (withdraw > balance) {
                        System.out.println("Insufficient funds! Transaction skipped.");
                        continue;
                    }
                    balance -= withdraw;
                    System.out.println("Withdrawal successful. Remaining Balance: Rs " + balance);
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
        sc.close();
    }
}
