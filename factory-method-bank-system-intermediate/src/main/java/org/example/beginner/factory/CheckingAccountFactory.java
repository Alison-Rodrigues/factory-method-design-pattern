package org.example.beginner.factory;

import org.example.beginner.account.Account;
import org.example.beginner.account.CheckingAccount;

public class CheckingAccountFactory extends AccountFactory {
    @Override
    Account createAccount() {
        return new CheckingAccount();
    }
}
