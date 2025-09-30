package structural.adapter.src;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PaymentProcessor stripe = new StripePayment();
        PaymentProcessor paypal = new PayPalAdapter();

        System.out.println("=== Adapter Pattern: Interactive Payment ===");

        while(true) {
            System.out.print("\nChoose payment method (stripe/paypal) or 'exit' to quit: ");
            String method = sc.nextLine();

            if(method.equalsIgnoreCase("exit")) break;

            System.out.print("Enter amount to pay: ");
            double amount = Double.parseDouble(sc.nextLine());

            if(method.equalsIgnoreCase("stripe")) {
                stripe.pay(amount);
            } else if(method.equalsIgnoreCase("paypal")) {
                paypal.pay(amount);
            } else {
                System.out.println("Invalid payment method!");
            }
        }

        sc.close();
        System.out.println("Exiting Payment System.");
    }
}
