// Abstract class BankAccount with abstract methods deposit() and withdraw().[A]

abstract class BankAccount {
    protected int accountNo;
    protected double balance;

    public BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void displayBalance() {
        System.out.println("Account: " + accountNo + " | Balance: Rs " + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNo, double balance) {
        super(accountNo, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Savings Acc " + accountNo + ": Deposited Rs " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Savings Acc " + accountNo + ": Withdrew Rs " + amount);
        } else {
            System.out.println("Savings Acc " + accountNo + ": Insufficient funds!");
        }
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit = 5000.0;

    public CurrentAccount(int accountNo, double balance) {
        super(accountNo, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Current Acc " + accountNo + ": Deposited Rs " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Current Acc " + accountNo + ": Withdrew Rs " + amount);
        } else {
            System.out.println("Current Acc " + accountNo + ": Overdraft limit exceeded!");
        }
    }
}

public class Program2 {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount(101, 10000);
        sa.deposit(2000);
        sa.withdraw(5000);
        sa.displayBalance();

        System.out.println();
        BankAccount ca = new CurrentAccount(201, 5000);
        ca.withdraw(8000);
        ca.displayBalance();
    }
}
