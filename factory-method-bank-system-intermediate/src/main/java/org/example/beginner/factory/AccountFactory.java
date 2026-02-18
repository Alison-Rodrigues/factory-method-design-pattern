package org.example.beginner.factory;

import org.example.beginner.account.Account;

// Creator (defines the factory method)
public abstract class AccountFactory {
    //Factory Method
    abstract Account createAccount();

    public void processFees(double amount) {
        Account account = createAccount();
        account.calculateFees(amount);
    }
}
