package org.example.beginner.factory;

import org.example.beginner.payment.Payment;

import java.math.BigDecimal;

// Creator (Defines the Factory Method)
public abstract class PaymentFactory {
    // Factory Method
    abstract Payment createPayment();

    public void processPayment(BigDecimal amount) {
        Payment payment = createPayment();
        payment.process(amount);
    }
}
