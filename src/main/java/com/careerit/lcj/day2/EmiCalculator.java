package com.careerit.lcj.day2;

import java.util.Scanner;

public class EmiCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter loan amount :");
        double amount = sc.nextDouble();
        System.out.println("Enter the rate of interest :");
        double ri = sc.nextDouble();
        System.out.println("Enter the duration in months ");
        double n = sc.nextDouble();

        double r = ri / 12 / 100;
        double emi = amount * r * (Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1));
        double totalAmount = emi * n;
        double totalInterest = totalAmount - amount;
        System.out.println("Amount :" + amount);
        System.out.println("Total interest :" + totalInterest);
        System.out.println("EMI :" + emi);
        System.out.println("Total amount :" + totalAmount);
    }
}
