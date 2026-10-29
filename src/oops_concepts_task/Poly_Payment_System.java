package oops_concepts_task;

class Payment {
    void pay(double amount) {
        System.out.println("Processing payment");
    }
}

class UPIPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}

class CardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Card");
    }
}

class CashPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Cash");
    }
}

public class Poly_Payment_System {
    public static void main(String[] args) {

        Payment p1 = new UPIPayment();
        Payment p2 = new CardPayment();
        Payment p3 = new CashPayment();

        p1.pay(1000);
        p2.pay(2000);
        p3.pay(500);
    }
}