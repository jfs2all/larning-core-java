package com.careerit.lcj.day8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AccountManager {

    public static void main(String[] args) {
        List<Account> accountList = loadAccounts();
        System.out.println("Total number of accounts :" + accountList.size());
        List<Account> list = chargeAnnualFee(accountList, 1000);
        showAccountDetails(list);
    }


    public static List<Account> loadAccounts() {
        List<Account> list = new ArrayList<>();
        try {
            List<String> data = Files.readAllLines(Path.of(AccountManager.class.getResource("/accounts.csv").getPath()));
            for (String row : data) {
                String[] arr = row.split(",");
                long accNumber = Long.parseLong(arr[0]);
                String name = arr[1];
                double balance = Double.parseDouble(arr[2]);
                Account acc = new Account(accNumber, name, balance);
                list.add(acc);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<Account> chargeAnnualFee(List<Account> accountList, double amount) {
        List<Account> accountWithOutMinBalance = new ArrayList<>();
        for (Account acc : accountList) {
            try {
                acc.withdraw(amount);
            }catch (InsufficientFundException e){
                e.printStackTrace();
                accountWithOutMinBalance.add(acc);
            }
        }
        return accountWithOutMinBalance;
    }

    public static void showAccountDetails(List<Account> accountList) {
        for (Account acc : accountList) {
            acc.showInfo();
        }
    }
}
