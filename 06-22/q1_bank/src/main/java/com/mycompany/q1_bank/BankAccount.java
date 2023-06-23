package com.mycompany.q1_bank;
public abstract class BankAccount {
    
    private int accountNumber;
    private double balance;
    
    public void setAcNum(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public int getAcNum(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    
    public abstract double calculateInterest();
}
