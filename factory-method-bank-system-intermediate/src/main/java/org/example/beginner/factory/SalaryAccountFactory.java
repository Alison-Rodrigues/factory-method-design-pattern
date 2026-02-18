package org.example.beginner.factory;

import org.example.beginner.account.Account;
import org.example.beginner.account.SalaryAccount;

public class SalaryAccountFactory extends AccountFactory{

    private final double baseTax;
    private final double openTax;

    public SalaryAccountFactory(double baseTax, double openTax) {
        this.baseTax = baseTax;
        this.openTax = openTax;
    }

    @Override
    Account createAccount() {
        return new SalaryAccount(this.baseTax, this.openTax);
    }
}
