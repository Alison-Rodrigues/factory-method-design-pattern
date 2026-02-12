package org.example.beginner.factory;

import org.example.beginner.account.Account;

public abstract class AccountFactory {
    //Factory Method
    abstract Account createAccount();

    public void processFees() {
        Account account = createAccount();
        account.calculateFees();
    }
}
