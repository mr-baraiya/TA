// Bank Account Management System demonstrating access modifiers across packages.[B]

import Bank.Account;

public class Program3 {
    public static void main(String[] args) {
        Account a = new Account();

        System.out.println("Account Holder: " + a.name);

        // Private and protected members cannot
        // be accessed directly from another package.
        a.display();
    }
}