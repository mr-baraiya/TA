package Bank;

public class Account {
    public String name = "Vishal";
    private double balance = 5000;
    protected int accountNo = 101;
    String bankName = "SBI";

    public void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Account Number: " + accountNo);
        System.out.println("Bank Name: " + bankName);
    }
}