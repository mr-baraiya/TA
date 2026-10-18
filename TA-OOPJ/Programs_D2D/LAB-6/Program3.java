// Create class BankDemo and Account(accNum:int, accType:String, balance: double). 
// Implement getter() and setter() method to assign and display data for 3 students.[A]

import java.util.Scanner;

class Account {

    int accNum;
    String accType;
    double balance;

    public void set(int accNum, String accType, double balance) {
        this.accNum = accNum;
        this.accType = accType;
        this.balance = balance;
    }

    public void get() {
        System.out.println("Account Number: " + accNum);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + balance);
    }
}

public class Program3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account[] accounts = new Account[3];

        for (int i = 0; i < 3; i++) {

            accounts[i] = new Account();

            System.out.println("\nEnter details for Account " + (i + 1));

            System.out.print("Enter account number: ");
            int accNum = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter account type: ");
            String accType = sc.nextLine();

            System.out.print("Enter balance: ");
            double balance = sc.nextDouble();

            accounts[i].set(accNum, accType, balance);
        }

        System.out.println("\n----- Account Details -----");

        for (int i = 0; i < 3; i++) {

            System.out.println("\nAccount " + (i + 1));

            accounts[i].get();
        }

        sc.close();
    }
}