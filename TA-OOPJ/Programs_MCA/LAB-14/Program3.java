// BankAccount with instance variables accountNo, balance and static variables bankName, interestRate.[B]

class BankAccount {
    int accountNo;
    double balance;
    static String bankName = "State Bank";
    static double interestRate = 6.5;

    public BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public static void setBankName(String name) { bankName = name; }
    public static String getBankName() { return bankName; }

    public static void setInterestRate(double rate) { interestRate = rate; }
    public static double getInterestRate() { return interestRate; }

    public void display() {
        System.out.println("Bank: " + bankName + " | Acc No: " + accountNo + " | Balance: Rs " + balance + " | Interest: " + interestRate + "%");
    }
}

public class Program3 {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount(501, 12000);
        accounts[1] = new BankAccount(502, 34000);
        accounts[2] = new BankAccount(503, 56000);

        for (BankAccount a : accounts) a.display();
    }
}
