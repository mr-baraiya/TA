// Create class BankDemo and Account(accNum:int, accType:String, balance: double). Implement getter/setter to assign and display.[C]

class Account {
    private int accNum;
    private String accType;
    private double balance;

    public int getAccNum() { return accNum; }
    public void setAccNum(int accNum) { this.accNum = accNum; }

    public String getAccType() { return accType; }
    public void setAccType(String accType) { this.accType = accType; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public void display() {
        System.out.println("Account No: " + accNum + " | Type: " + accType + " | Balance: Rs " + balance);
    }
}

public class Program3 {
    public static void main(String[] args) {
        Account[] accounts = new Account[3];

        accounts[0] = new Account();
        accounts[0].setAccNum(1001);
        accounts[0].setAccType("Savings");
        accounts[0].setBalance(25000.0);

        accounts[1] = new Account();
        accounts[1].setAccNum(1002);
        accounts[1].setAccType("Current");
        accounts[1].setBalance(85000.0);

        accounts[2] = new Account();
        accounts[2].setAccNum(1003);
        accounts[2].setAccType("Savings");
        accounts[2].setBalance(15000.0);

        System.out.println("=== Bank Accounts Information ===");
        for (Account a : accounts) {
            a.display();
        }
    }
}
