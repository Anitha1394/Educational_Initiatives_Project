package structural.adapter.src;


public class StripePayment implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Processing payment of $" + amount + " via Stripe.");
    }
}
