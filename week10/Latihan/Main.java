package week10.Latihan;

class paymentMethod{
    public void processPayment(double amount){
        System.out.println("Processing payment of " + 100.0);
    }

    public void processPayment(double amount, String currency){
        System.out.println("Processing payment of " + 100.0 + " in " + "USD");
    }
}

class CreditCard extends paymentMethod {
    @Override
    public void processPayment(double amount){
        System.out.println("Processing credit card payment of " + amount);
    }

    public void processPayment(double amount, String currency){
        System.out.println("Processing credit card payment of " + amount + " in " + currency);
    }
}

class EWallet extends paymentMethod {
    @Override
    public void processPayment(double amount){
        System.out.println("Processing e-wallet payment of " + amount);
    }

    public void processPayment(double amount, String currency){
        System.out.println("Processing e-wallet payment of " + amount + " in " + currency);
    }
}

class BankTransfer extends paymentMethod {
    @Override
    public void processPayment(double amount){
        System.out.println("Processing bank transfer payment of " + amount);
    }

    public void processPayment(double amount, String currency){
        System.out.println("Processing bank transfer payment of " + amount + " in " + currency);
    }
}

public class Main {
    public static void main(String[] args) {
        paymentMethod pm = new paymentMethod();
        pm.processPayment(100.0);
        pm.processPayment(100.0, "USD");

        paymentMethod cc = new CreditCard();
        cc.processPayment(200.0);
        cc.processPayment(200000.0, "IDR");

        paymentMethod ew = new EWallet();
        ew.processPayment(300.0);
        ew.processPayment(300.0, "EUR");

        paymentMethod bt = new BankTransfer();
        bt.processPayment(400.0);
        bt.processPayment(5000.0, "TRY");
    }
}
