// Bank Account Management System demonstrating access modifiers across packages.[B]

class AccountSecurityDemo {
    public int accountNo = 1001;                 // public
    protected String customerName = "Aarav";    // protected
    String accountType = "Savings";              // default (package-private)
    private double balance = 50000.0;            // private

    public double getBalance() {
        return balance;
    }

    public void displayAll() {
        System.out.println("Account No (public)     : " + accountNo);
        System.out.println("Customer Name (protected): " + customerName);
        System.out.println("Account Type (default)   : " + accountType);
        System.out.println("Balance (private via get): Rs " + getBalance());
    }
}

public class Program3 {
    public static void main(String[] args) {
        System.out.println("Access Control Demonstration:");
        AccountSecurityDemo acc = new AccountSecurityDemo();
        acc.displayAll();

        System.out.println("\nDirect access in same package:");
        System.out.println("acc.accountNo (public): " + acc.accountNo);
        System.out.println("acc.customerName (protected): " + acc.customerName);
        System.out.println("acc.accountType (default): " + acc.accountType);
        System.out.println("acc.balance (private): Restricted! Must use acc.getBalance(): Rs " + acc.getBalance());
    }
}
