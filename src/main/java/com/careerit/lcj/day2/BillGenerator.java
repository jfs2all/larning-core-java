package com.careerit.lcj.day2;

import java.util.Scanner;

public class BillGenerator {

    /*
        Accept bill amount from user and calculate the discount, if bill amount is greater than 5000
        then discount is 10% otherwise no discount;
        print the discount amount, bill amount and net amount
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount :");
        float billAmount = sc.nextFloat();
        float discount = 0;
        if(billAmount >= 5000){
            discount = billAmount * 0.1f;
        }
        float netAmount = billAmount - discount;
        System.out.println("Bill amount :"+billAmount);
        System.out.println("Discount    :"+discount);
        System.out.println("Net amount  :"+netAmount);
    }
}
