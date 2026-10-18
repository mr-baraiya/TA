// Write a Java program to create a class called BankAccount with instance variables 
// 'accountNo' and balance, and static variables bankName and interestRate. Implement 
// static methods to get and set the static variables. Create three BankAccount objects and 
// print their details along with the static variables. [A] 

class BankAccount {

    // Instance variables
    int accountNo;
    double balance;

    // Static variables
    static String bankName = "Bank of Baroda";
    static double interestRate = 6.5;

    public BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String name) {
        bankName = name;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public void display() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println();
    }
}

public class Program3 {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(101, 50000);
        BankAccount account2 = new BankAccount(102, 75000);
        BankAccount account3 = new BankAccount(103, 100000);

        account1.display();
        account2.display();
        account3.display();

        System.out.println("Bank Name: " + BankAccount.getBankName());
        System.out.println("Interest Rate: " + BankAccount.getInterestRate() + "%");
    }
}