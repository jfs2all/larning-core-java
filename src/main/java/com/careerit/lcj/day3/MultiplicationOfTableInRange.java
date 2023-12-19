package com.careerit.lcj.day3;

public class MultiplicationOfTableInRange {

    public static void main(String[] args) {
        int lb = 10;
        int ub = 20;

        for (int num = ub; num >= lb; num--) {

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + num * i);
            }
            System.out.println("------------------");

        }

    }
}
