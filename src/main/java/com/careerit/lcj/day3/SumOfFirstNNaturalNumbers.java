package com.careerit.lcj.day3;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N value :");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = n; i >= 1; i--) {
            sum += i; // sum = sum + i;
        }
        System.out.println("Sum of first " + n + " natural numbers is " + sum);
    }
}
