package structural.adapter.src;


public class PayPalAdapter implements PaymentProcessor {
    private PayPalPayment payPal;

    public PayPalAdapter() {
        this.payPal = new PayPalPayment();
    }

    @Override
    public void pay(double amount) {
        payPal.sendPayment(amount);  // Convert to existing interface
    }
}
