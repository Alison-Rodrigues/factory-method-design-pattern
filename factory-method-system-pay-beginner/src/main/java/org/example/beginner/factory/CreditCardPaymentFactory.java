package org.example.beginner.factory;

import org.example.beginner.payment.CreditCardPayment;
import org.example.beginner.payment.Payment;

//Concrete Creator (Implements the Factory Method to return a instance of Concrete Product)
public class CreditCardPaymentFactory extends PaymentFactory {

    private final Long cardNumber;
    private final Integer cvvCode;

    public CreditCardPaymentFactory(Long cardNumber, Integer cvvCode) {
        this.cardNumber = cardNumber;
        this.cvvCode = cvvCode;
    }

    @Override
    Payment createPayment() {
        return new CreditCardPayment(this.cardNumber, this.cvvCode);
    }
}
