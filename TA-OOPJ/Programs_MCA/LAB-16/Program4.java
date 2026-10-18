// Banking System: Account base class inherited by SavingsAccount and CurrentAccount.[C]

class BaseAccount {
    protected int accountNo;
    protected double balance;

    public BaseAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Acc " + accountNo + ": Deposited Rs " + amount + ". Balance: Rs " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Acc " + accountNo + ": Withdrew Rs " + amount + ". Balance: Rs " + balance);
        } else {
            System.out.println("Acc " + accountNo + ": Insufficient funds!");
        }
    }
}

class SavingsAccount extends BaseAccount {
    private double interestRate;

    public SavingsAccount(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest of Rs " + interest + " applied to Savings Account.");
    }
}

class CurrentAccount extends BaseAccount {
    private double overdraftLimit;

    public CurrentAccount(int accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Acc " + accountNo + ": Withdrew Rs " + amount + " (Current Acc). Balance: Rs " + balance);
        } else {
            System.out.println("Acc " + accountNo + ": Overdraft limit exceeded!");
        }
    }
}

public class Program4 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, 5000, 4.0);
        sa.deposit(1000);
        sa.applyInterest();
        sa.withdraw(2000);

        System.out.println();
        CurrentAccount ca = new CurrentAccount(201, 3000, 2000);
        ca.withdraw(4500); // within overdraft
        ca.withdraw(1000); // exceeds overdraft
    }
}
