package com.careerit.lcj.day2;

import java.util.Scanner;

public class EvenOrOddExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num :");
        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println("The given num " + num + " is even");
        }else {
            System.out.println("The given num " + num + " is odd");
        }
        System.out.println("End of main method");
    }
}
