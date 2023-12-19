package com.careerit.lcj.day6;
import static com.careerit.lcj.day6.AccountUtil.*;
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
            System.out.println("Sorry! Insufficient funds");
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
