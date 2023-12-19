package com.careerit.lcj.day3;

import java.util.Scanner;

public class ProfitAndLossExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cp :");
        float cp = sc.nextFloat();
        System.out.println("Enter the  sp:");
        float sp = sc.nextFloat();

        if(cp > sp) {
            float loss = cp - sp;
            System.out.println("Loss is :" + loss);
        }else if(cp < sp) {
            float profit = sp - cp;
            System.out.println("Profit is :" + profit);
        }else{
            System.out.println("No profit no loss");
        }
    }
}
