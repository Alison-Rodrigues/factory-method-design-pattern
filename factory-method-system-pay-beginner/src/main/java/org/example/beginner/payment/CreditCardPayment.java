package org.example.beginner.payment;

import java.math.BigDecimal;

public class CreditCardPayment implements Payment {

    private final Long cardNumber;
    private final Integer cvvCode;

    public CreditCardPayment(Long cardNumber, Integer cvvCode) {
        this.cardNumber = cardNumber;
        this.cvvCode = cvvCode;
    }

    @Override
    public PaymentResult process(BigDecimal amount) {
        System.out.println(String.format("[CARTÃO CRÉDITO] Valor de %s com cartão de número %d e CVV %d", amount, this.cardNumber, this.cvvCode));
        return new PaymentResult(
                "Pagamento Cartão realizado com sucesso",
                null
        );
    }
}
