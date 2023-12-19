package com.careerit.lcj.day3;

public class SumOfFirstNEvenAndOdd {

    public static void main(String[] args) {

        int n = 20;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("Sum of first " + n + " even numbers is :" + evenSum);
        System.out.println("Sum of first " + n + " odd numbers is :" + oddSum);
    }
}
