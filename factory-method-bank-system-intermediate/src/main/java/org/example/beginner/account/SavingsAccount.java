package org.example.beginner.account;

public class SavingsAccount implements Account{

     private final double baseTax;
     private final double openTax;

    public SavingsAccount(double baseTax, double openTax) {
        this.baseTax = baseTax;
        this.openTax = openTax;
    }

    @Override
    public double calculateFees(double amount) {
        double totalTax = this.baseTax + this.openTax;
        System.out.println(String.format("Taxa para conta poupança [%s]", totalTax));
        System.out.println(String.format("Valor do depósito com a taxa [%s]", amount + totalTax));
        return totalTax;
    }
}
