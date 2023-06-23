package com.mycompany.q1_bank;
public class CheckingAccount extends BankAccount{
    
    private double i = 0.02;
    double interest;
    
    @Override
    public double calculateInterest(){
        interest = getBalance() * i;
        return interest;
    }
}
    

