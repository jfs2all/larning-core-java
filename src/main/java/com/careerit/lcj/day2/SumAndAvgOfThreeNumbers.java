package com.careerit.lcj.day2;

import java.util.Scanner;

public class SumAndAvgOfThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 :");
        float num1 = sc.nextFloat();
        System.out.println("Enter the num2 : ");
        float num2 = sc.nextFloat();
        System.out.println("Enter the num2 :");
        float num3 = sc.nextFloat();

        float sum = num1 + num2 + num3;
        float avg = sum / 3;
        System.out.println("The sum is :"+sum);
        System.out.println("Avg is :"+avg);

    }
}
