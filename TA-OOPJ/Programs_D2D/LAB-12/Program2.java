// Write a program to create Account class, which is representing a bank account where 
// we can deposit and withdraw money. If user need to withdraw money which exceed 
// our minimum bank balance then it will not be allowed, and will throw 
// InSufficientFundException(Custom Exception). Handle above exception and display 
// proper error message. [A]

import java.util.Scanner;

class InSufficientFundException extends Exception {
    public InSufficientFundException(String message) {
        super(message);
    }
}

class Account {
    private double balance;
    private static final double MIN_BALANCE = 1000.0;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
            System.out.println("Current Balance: " + balance);
        }
    }

    public void withdraw(double amount) throws InSufficientFundException {
        if (balance - amount < MIN_BALANCE) {
            throw new InSufficientFundException("Withdrawal failed! Remaining balance (" 
                + (balance - amount) + ") would fall below minimum required balance of " + MIN_BALANCE);
        } else {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Program2 {
    public static void main(String[] args) {
        Account acc = new Account(5000.0);
        Scanner sc = new Scanner(System.in);

        System.out.println("Initial Balance: " + acc.getBalance());
        
        try {
            System.out.print("Enter amount to deposit: ");
            double dep = sc.nextDouble();
            acc.deposit(dep);

            System.out.print("Enter amount to withdraw: ");
            double with = sc.nextDouble();
            acc.withdraw(with);

            System.out.print("Enter another amount to withdraw: ");
            with = sc.nextDouble();
            acc.withdraw(with);
        } catch (InSufficientFundException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
