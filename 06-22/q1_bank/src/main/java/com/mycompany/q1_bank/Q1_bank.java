package com.mycompany.q1_bank;
public class Q1_bank {

    public static void main(String[] args) {
        
        System.out.println("Savings Account Details");
        
        SavingsAccount s1 = new SavingsAccount();
        s1.setAcNum(1578953);
        s1.setBalance(2000000);
        System.out.println("Account Number: "+s1.getAcNum());
        System.out.println("Interest: "+s1.calculateInterest());
        
        System.out.println("Checking Account Details");
        
        CheckingAccount c1 = new CheckingAccount();
        c1.setAcNum(45893);
        c1.setBalance(1000000);
        System.out.println("Account Number: "+c1.getAcNum());
        System.out.println("Interest: "+c1.calculateInterest());

    }
}
