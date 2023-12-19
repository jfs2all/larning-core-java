package com.careerit.lcj.day3;

public class FactorsOfGivenNumber {

    public static void main(String[] args) {

        for (int num = 1; num <= 100; num++) {
            int count = 0;
            System.out.println("Factors of " + num + " are :");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                    System.out.print(i + " ");
                }
            }
            if (count == 2) {
                System.out.println("\n"+num+" is prime number");
            } else {
                System.out.println("\n"+num+" is not prime number");
            }
            System.out.println("------------------------");
        }
    }
}
