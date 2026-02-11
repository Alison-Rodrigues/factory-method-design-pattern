package org.example.beginner.factory;

import org.example.beginner.payment.BoletoPayment;
import org.example.beginner.payment.Payment;

//Concrete Creator (Implements the Factory Method to return a instance of Concrete Product)
public class BoletoPaymentFactory extends PaymentFactory {
    @Override
    Payment createPayment() {
        return new BoletoPayment();
    }
}
