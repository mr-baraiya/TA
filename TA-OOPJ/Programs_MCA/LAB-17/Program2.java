// Payment Processing System: PaymentMethod overridden by CreditCard, UPI, NetBanking.[A]

abstract class PaymentMethod {
    abstract void processPayment(double amount);
}

class CreditCardPayment extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of Rs " + amount + " (2% processing fee applied).");
    }
}

class UPIPayment extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI instant payment of Rs " + amount + " via UPI ID.");
    }
}

class NetBankingPayment extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Net Banking payment of Rs " + amount + " through secure gateway.");
    }
}

public class Program2 {
    public static void main(String[] args) {
        PaymentMethod payment;

        payment = new CreditCardPayment();
        payment.processPayment(2500);

        payment = new UPIPayment();
        payment.processPayment(750);

        payment = new NetBankingPayment();
        payment.processPayment(15000);
    }
}
