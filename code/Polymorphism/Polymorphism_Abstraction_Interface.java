interface Refund {
    void processRefund();
}

abstract class Payment {
    abstract void pay(); // Abstract method

    void paymentStatus() {
        System.out.println("Payment processing...");
    }
}

class CreditCard extends Payment {
    @Override
    void pay() {
        System.out.println("Payment done using Credit Card.");
    }
}

class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Payment done using UPI.");
    }
}

class CreditCardRefund implements Refund {
    @Override
    public void processRefund() {
        System.out.println("Credit Card refund processed.");
    }
}

class UPIRefund implements Refund {
    @Override
    public void processRefund() {
        System.out.println("UPI refund processed.");
    }
}

public class Polymorphism_Abstraction_Interface {
    public static void main(String[] args) {
        // Runtime polymorphism using abstract class
        Payment p;
        p = new CreditCard();
        p.paymentStatus();
        p.pay();
        System.out.println("-----------------------------");
        p = new UPI();
        p.paymentStatus();
        p.pay();
        System.out.println("-----------------------------");
        // Runtime polymorphism using interface
        Refund r;
        r = new CreditCardRefund();
        r.processRefund();
        System.out.println("-----------------------------");
        r = new UPIRefund();
        r.processRefund();
    }
}