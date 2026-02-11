package org.example.beginner;

import org.example.beginner.factory.BoletoPaymentFactory;
import org.example.beginner.factory.CreditCardPaymentFactory;
import org.example.beginner.factory.PaymentFactory;
import org.example.beginner.factory.PixPaymentFactory;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        PaymentFactory pixFactory = new PixPaymentFactory("17991132045");
        PaymentFactory creditCardFactory = new CreditCardPaymentFactory(4450998234775888312L, 435);
        PaymentFactory boletoFactory = new BoletoPaymentFactory();

        pixFactory.processPayment(new BigDecimal("200.00"));
        creditCardFactory.processPayment(new BigDecimal("59.90"));
        boletoFactory.processPayment(new BigDecimal("20.00"));

    }
}