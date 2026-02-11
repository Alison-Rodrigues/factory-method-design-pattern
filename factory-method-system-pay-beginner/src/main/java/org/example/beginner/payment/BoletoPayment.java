package org.example.beginner.payment;

import java.math.BigDecimal;

public class BoletoPayment implements Payment {

    @Override
    public PaymentResult process(BigDecimal amount) {
        System.out.println(String.format("[BOLETO] Pagamento do boleto realizado com sucesso no valor de %s", amount));
        System.out.println(String.format("[BOLETO] Código de barras gerado %s", generateBarCode()));
        return new PaymentResult(
                "Boleto emitido com sucesso",
                generateBarCode()
        );
    }

    private String generateBarCode() {
        return "342354353434324.23432423.324343242342.354542354";
    }
}
