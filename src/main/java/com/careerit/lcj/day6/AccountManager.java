package com.careerit.lcj.day6;

public class AccountManager {

    public static void main(String[] args) {

        Account acc1 = new Account(1000000091, "Krish", 5000);
        Account acc2 = new Account(1000000081, "Manoj", 6000);
        Account acc5 = new Account(1000000291, "Siva", 9000);
        Account acc3 = new Account(1000000092, "Charan", 7000);
        Account acc4 = new Account(1000000191, "Rajesh", 8000);


        Account[] arr = new Account[]{acc1, acc2, acc3, acc4, acc5};
        double totalAmount = 0;
        for (Account acc : arr) {
            totalAmount += acc.balance;
        }
        System.out.println("Total amount :" + totalAmount);
        System.out.println("Max balanced account");
        Account maxAcc = getMaxBalancedAccount(arr);
        maxAcc.showInfo();

    }

    public static Account getMaxBalancedAccount(Account[] arr) {
        double max = arr[0].balance;
        Account acc = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i].balance > max) {
                max = arr[i].balance;
                acc = arr[i];
            }
        }
        return acc;
    }
}
