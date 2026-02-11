package org.example.beginner.payment;

public class PaymentResult {
    private String message;
    private String barCode;

    public PaymentResult(String message, String barCode) {
        this.message = message;
        this.barCode = barCode;
    }
}
