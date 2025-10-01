# Adapter Pattern – Interactive Payment System

## Overview
This project demonstrates the **Adapter design pattern** using a **console-based payment system** in Java.  
The Adapter pattern allows incompatible interfaces to work together.  

In this example, the `PayPalPayment` class has its own interface (`sendPayment()`), which is adapted to the common `PaymentProcessor` interface so it can be used alongside `StripePayment`.

---

## Features
- Supports multiple payment methods: **Stripe** and **PayPal**.  
- Uses an **Adapter** to integrate PayPal into the standard `PaymentProcessor` interface.  
- Interactive console-based interface for choosing payment method and entering amount.  
- Demonstrates **loose coupling** and **interface compatibility**.

---

## How to Run
1. Compile all classes:
```bash
javac -d out src/structural/adapter/src/*.java
java -cp out structural.adapter.src.Main
```
## Example Usage
```bash
=== Adapter Pattern: Interactive Payment ===

Choose payment method (stripe/paypal) or 'exit' to quit: stripe
Enter amount to pay: 50
Processing payment of $50.0 via Stripe.

Choose payment method (stripe/paypal) or 'exit' to quit: paypal
Enter amount to pay: 75
Processing payment of $75.0 via PayPal.

Choose payment method (stripe/paypal) or 'exit' to quit: exit
Exiting Payment System.
```