class Payment {
    void pay() {
        System.out.println("Processing generic payment");
    }

    void paymentDetails() {
        System.out.println("Payment details from parent");
    }
}

class CreditCard extends Payment {
    @Override
    void pay() {
        System.out.println("CreditCard processing generic payment...!");
    }

    @Override
    void paymentDetails() {
        System.out.println("Payment details from CreditCard...!");
    }

    // Child-specific method
    void cardDetails() {
        System.out.println("Credit card specific details");
    }
}

class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("UPI processing generic payment...!");
    }

    @Override
    void paymentDetails() {
        System.out.println("Payment details from UPI...!");
    }
}

class Cash extends Payment {
    @Override
    void pay() {
        System.out.println("Cash processing generic payment...!");
    }

    @Override
    void paymentDetails() {
        System.out.println("Payment details from Cash...!");
    }
}

public class Runtime_Polymorphism {
    public static void main(String[] args) {

        CreditCard cc = new CreditCard();
        cc.pay();
        cc.paymentDetails();
        cc.cardDetails();

        System.out.println("----------------------------------------");

        UPI u = new UPI();
        u.pay();
        u.paymentDetails();

        System.out.println("----------------------------------------");

        Cash c = new Cash();
        c.pay();
        c.paymentDetails();

        System.out.println("----------------------------------------");

        // Runtime polymorphism (Upcasting)
        Payment p;

        p = new CreditCard();
        p.pay();
        p.paymentDetails();
        // p.cardDetails(); //Expected result: Compilation error Reason: The reference type Payment does not contain the cardDetails() method

        p = new UPI();
        p.pay();
        p.paymentDetails();

        p = new Cash();
        p.pay();
        p.paymentDetails();
    }
}