package com.careerit.lcj.day7;
import static com.careerit.lcj.day6.AccountUtil.maskAccountNumber;
public class SavingsAccount extends Account{

        double minBalance = 500;

        public SavingsAccount(long accNumber,String name, double balance){
            super(accNumber,name,balance);
        }

        @Override
        public void withdraw(double amount) {
            if (amount > (balance -minBalance)) {
                System.out.println("Sorry! Insufficient funds");
            } else {
                balance -= amount;
                System.out.println("Account " + maskAccountNumber(accNumber) + " debited with amount " + amount + " and available balance is " + balance);
            }
        }

}
