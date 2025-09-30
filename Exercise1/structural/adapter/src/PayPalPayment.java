package structural.adapter.src;


public class PayPalPayment {
    public void sendPayment(double value) {
        System.out.println("Processing payment of $" + value + " via PayPal.");
    }
}
