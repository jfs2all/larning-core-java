package com.careerit.lcj.day7;
import static com.careerit.lcj.day6.AccountUtil.maskAccountNumber;
public class CurrentAccount extends Account{

    double overDraftLimit = 10000;

    public CurrentAccount(long accNumber,String name, double balance){
        super(accNumber,name,balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > (balance + overDraftLimit)) {
            System.out.println("Sorry! Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Account " + maskAccountNumber(accNumber) + " debited with amount " + amount + " and available balance is " + balance);
        }
    }
}
