package org.example.beginner.account;

public class CheckingAccount implements Account {

    @Override
    public void calculateFees() {
        System.out.println("Calculando taxas para Conta Corrente");
    }
}
