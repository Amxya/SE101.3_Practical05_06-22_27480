package com.mycompany.q1_bank;
public class SavingsAccount extends BankAccount{
    
    private double i = 0.12;
    double interest;
    
    @Override
    public double calculateInterest(){
        interest = getBalance() * i;
        return interest;
    }
}
