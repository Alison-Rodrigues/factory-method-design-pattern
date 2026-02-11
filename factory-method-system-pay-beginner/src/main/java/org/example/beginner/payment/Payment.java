package org.example.beginner.payment;

import java.math.BigDecimal;

//Product interface (Defines a kind of object that must be created)
public interface Payment {
    PaymentResult process(BigDecimal amount);
}
