package com.careerit.lcj.day7;

import static com.careerit.lcj.day6.AccountUtil.maskAccountNumber;

public abstract class Account {
    long accNumber;
    String name;
    double balance;

    public Account(long accNumber,String name, double balance){
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);


    public void deposit(double amount) {
        balance += amount;
        System.out.println("Account " + maskAccountNumber(accNumber) + " credited with amount " + amount + " and available balance is " + balance);
    }

    public void showInfo() {
        System.out.println("Account number :" + maskAccountNumber(accNumber));
        System.out.println("Name           :" + name);
        System.out.println("Balance        :" + balance);
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
