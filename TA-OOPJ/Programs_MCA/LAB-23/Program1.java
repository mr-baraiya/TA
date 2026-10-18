// Account class with InSufficientFundException (Custom Exception).[A]

import java.util.Scanner;

class InSufficientFundException extends Exception {
    public InSufficientFundException(String msg) {
        super(msg);
    }
}

class UserAccount {
    private double balance;
    private final double MIN_BALANCE = 500.0;

    public UserAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amt) throws InSufficientFundException {
        if (balance - amt < MIN_BALANCE) {
            throw new InSufficientFundException("Transaction failed: Minimum balance of Rs " + MIN_BALANCE + " required. Current balance: Rs " + balance);
        }
        balance -= amt;
        System.out.println("Withdrawn Rs " + amt + " successfully. Available Balance: Rs " + balance);
    }

    public double getBalance() { return balance; }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserAccount acc = new UserAccount(2000.0);
        System.out.println("Account created with balance: Rs " + acc.getBalance());

        System.out.print("Enter withdrawal amount: Rs ");
        double amt = sc.nextDouble();

        try {
            acc.withdraw(amt);
        } catch (InSufficientFundException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
