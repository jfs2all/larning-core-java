package com.careerit.lcj.day7;

public class AccountManager {

    public static void main(String[] args) {

        Account acc1 = new SavingsAccount(1001, "Krish", 10000);
        Account acc2 = new CurrentAccount(1002, "CTI", 20000);
        Account acc3 = new SavingsAccount(1003, "Manoj", 30000);
        Account acc4 = new CurrentAccount(1004, "SCT", 40000);
        Account acc5 = new SavingsAccount(1009, "Charan", 5000);
        Account acc6 = new SavingsAccount(1010, "John", 6000);

        Account[] accounts = new Account[]{acc1, acc2, acc3, acc4, acc5, acc6};

        double savingsTotal = 0;
        double currentTotal = 0;

        for (Account acc : accounts) {
            if (acc instanceof SavingsAccount) {
                savingsTotal += acc.getBalance();
            } else {
                currentTotal += acc.getBalance();
            }
        }
        System.out.println("Total savings balance :" + savingsTotal);
        System.out.println("Total current balance :" + currentTotal);
    }
}
