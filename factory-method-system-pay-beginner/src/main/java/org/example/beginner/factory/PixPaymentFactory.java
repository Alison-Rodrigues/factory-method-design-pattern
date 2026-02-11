package org.example.beginner.factory;

import org.example.beginner.payment.Payment;
import org.example.beginner.payment.PixPayment;

//Concrete Creator (Implements the Factory Method to return a instance of Concrete Product)
public class PixPaymentFactory extends PaymentFactory {

    private final String pixKey;

    public PixPaymentFactory(String pixKey) {
        this.pixKey = pixKey;
    }

    @Override
    Payment createPayment() {
        return new PixPayment(this.pixKey);
    }
}
