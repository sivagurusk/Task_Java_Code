package section_C;

interface Payment {
    void pay(double amount);
}
class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("UPI Payment: "+amount);
    }
}
class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Credit Card Payment: "+amount);
    }
}
class Cash implements Payment {

    public void pay(double amount) {
        System.out.println("Cash Payment: "+amount);
    }
}
public class Payment_System {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay(1000);

        p = new CreditCard();
        p.pay(2000);

        p = new Cash();
        p.pay(500);
    }
}