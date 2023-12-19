package com.careerit.lcj.day2;

import java.util.Scanner;

public class OperatorExamples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the m :");
        int m = sc.nextInt();
        System.out.println("Enter the n :");
        int n = sc.nextInt();
        double res = Math.pow(m,n);
        System.out.println("Result :"+res);


    }
}
