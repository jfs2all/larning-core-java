package com.careerit.lcj.day3;

public class GenerateEvenNumberInRange {

    public static void main(String[] args) {

        int lb = 10;
        int ub = 20;
        // print all the even numbers in the range lb and ub
        for (int i = lb; i <= ub; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
