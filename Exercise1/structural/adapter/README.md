# Adapter Pattern – Payment Example

## Overview
This project demonstrates the **Adapter design pattern** in Java. The Adapter pattern allows **incompatible interfaces to work together**. 

---

## Structure
- **Payment:** Interface defining the `pay(amount)` method.  
- **PayPalPayment:** Adaptee class with its own method to process PayPal payments.  
- **StripePayment:** Adaptee class with its own method to process Stripe payments.  
- **PaymentAdapter:** Adapter class that allows PayPal and Stripe to implement the `Payment` interface.  
- **Main:** Interactive program where the user chooses a payment method and enters the amount to pay.

---

## How to Run
1. Ensure **Java is installed** on your machine.  
2. Open a terminal and navigate to the project folder.  
3. Compile the Java files:  
```bash
javac -d . src/adapter/*.java
Run the Main class:

java adapter.Main

Enter a payment method (paypal or stripe) and an amount. Type exit to quit.
