// Write a Java program to create an abstract class BankAccount with abstract methods 
// deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that 
// extend the BankAccount class and implement the respective   methods to handle 
// deposits and withdrawals for each account type.[A] 

abstract class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Savings Account Deposit: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Savings Account Withdrawal: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Current Account Deposit: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Current Account Withdrawal: " + amount);
        System.out.println("Balance: " + balance);
    }
}

public class Program2 {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(10000);
        CurrentAccount current = new CurrentAccount(20000);

        savings.deposit(5000);
        savings.withdraw(3000);

        System.out.println();

        current.deposit(10000);
        current.withdraw(25000);
    }
}