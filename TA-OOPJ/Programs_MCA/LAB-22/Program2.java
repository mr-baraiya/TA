// Account class with InSufficientFundException when balance falls below minimum.[A]

class InSufficientFundException extends Exception {
    public InSufficientFundException(String message) {
        super(message);
    }
}

class BankAcc {
    private int accountNo;
    private double balance;
    private final double MIN_BALANCE = 1000.0;

    public BankAcc(int accountNo, double initialBalance) {
        this.accountNo = accountNo;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Rs " + amount + ". New Balance: Rs " + balance);
    }

    public void withdraw(double amount) throws InSufficientFundException {
        if (balance - amount < MIN_BALANCE) {
            throw new InSufficientFundException("Withdrawal of Rs " + amount + " denied! Minimum balance of Rs " + MIN_BALANCE + " must be maintained. Current Balance: Rs " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful of Rs " + amount + ". Remaining Balance: Rs " + balance);
    }
}

public class Program2 {
    public static void main(String[] args) {
        BankAcc acc = new BankAcc(1001, 2500);
        acc.deposit(500);

        try {
            acc.withdraw(1200); // Leaves 1800 (valid)
            acc.withdraw(1000); // Leaves 800 (< 1000 min, throws exception)
        } catch (InSufficientFundException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
