package org.example.beginner;

import org.example.beginner.factory.AccountFactory;
import org.example.beginner.factory.CheckingAccountFactory;
import org.example.beginner.factory.SalaryAccountFactory;
import org.example.beginner.factory.SavingsAccountFactory;

public class Main {

    public static void main(String[] args) {
        AccountFactory checkingFactory = new CheckingAccountFactory(2.23, 3.39);
        SavingsAccountFactory savingsAccountFactory = new SavingsAccountFactory(3.00, 5.49);
        SalaryAccountFactory salaryAccountFactory = new SalaryAccountFactory(1.20, 1.58);

        checkingFactory.processFees(200.00);
        savingsAccountFactory.processFees(200.00);
        salaryAccountFactory.processFees(200.00);



    }
}