package org.example.beginner.factory;

import org.example.beginner.account.Account;
import org.example.beginner.account.CheckingAccount;

// Concrete creator (Implements the creator to return a concrete product instance)
public class CheckingAccountFactory extends AccountFactory {

    private final double baseTax;
    private final double openTax;

    public CheckingAccountFactory(double baseTax, double openTax) {
        this.baseTax = baseTax;
        this.openTax = openTax;
    }

    @Override
    Account createAccount() {
        return new CheckingAccount(this.baseTax, this.openTax);
    }
}
