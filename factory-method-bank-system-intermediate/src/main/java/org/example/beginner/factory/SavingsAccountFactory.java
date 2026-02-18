package org.example.beginner.factory;

import org.example.beginner.account.Account;
import org.example.beginner.account.SavingsAccount;

// Concrete Creator (Implements the creator to return a concrete product instance)
public class SavingsAccountFactory extends AccountFactory{

    private final double baseTax;
    private final double openTax;

    public SavingsAccountFactory(double baseTax, double openTax) {
        this.baseTax = baseTax;
        this.openTax = openTax;
    }

    @Override
    Account createAccount() {
        return new SavingsAccount(this.baseTax, this.openTax);
    }
}
