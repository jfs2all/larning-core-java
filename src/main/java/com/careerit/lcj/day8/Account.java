package com.careerit.lcj.day8;

import static com.careerit.lcj.day6.AccountUtil.maskAccountNumber;

public class Account {

    long accno;
    String name;
    double balance;
    static String bankName = "IBS";

    public Account(long accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;

    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientFundException("Sorry! you don't have sufficient funds");
        } else {
            balance -= amount;
            System.out.println("Account " + maskAccountNumber(accno) + " debited with amount " + amount + " and available balance is " + balance);
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Account " + maskAccountNumber(accno) + " credited with amount " + amount + " and available balance is " + balance);
    }

    public void showInfo() {
        System.out.println("Account number :" + maskAccountNumber(accno));
        System.out.println("Name           :" + name);
        System.out.println("Balance        :" + balance);
    }
}
