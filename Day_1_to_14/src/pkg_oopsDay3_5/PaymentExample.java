package pkg_oopsDay3_5;

public class PaymentExample {
    public static void main(String[] args) {
        PaymentExample ccp = new PaymentExample();  // Renamed class
        ccp.makePayment(1000.0);

        PayPalPayment ppp = new PayPalPayment();
        ppp.makePayment(2000.0);
    }
}

class PaymentExample {
    public void makePayment(double amount) {
        System.out.println("Credit card payment of $" + amount + " processed.");
    }
}

class PayPalPayment {
    public void makePayment(double amount) {
        System.out.println("PayPal payment of $" + amount + " processed.");
    }
}
