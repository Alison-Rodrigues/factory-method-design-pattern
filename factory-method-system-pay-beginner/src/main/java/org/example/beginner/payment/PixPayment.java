package org.example.beginner.payment;

import java.math.BigDecimal;

//Concrete Product
public class PixPayment implements Payment {

    private final String pixKey;

    public PixPayment(String pixKey) {
        this.pixKey = pixKey;
    }

    @Override
    public PaymentResult process(BigDecimal amount) {
        System.out.println(String.format("[PIX] Valor de %s para a chave %s", amount.toString(), this.pixKey));
        return new PaymentResult(
                "Pix realizado com sucesso",
                null
        );
    }

}
