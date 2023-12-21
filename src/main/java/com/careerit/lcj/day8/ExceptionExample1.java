package com.careerit.lcj.day8;

import java.util.Scanner;

public class ExceptionExample1 {

    public static void main(String[] args) {

        System.out.println("Start of main method");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2: ");
        int num2 = sc.nextInt();
        try{
            int res = num1 / num2;
            System.out.println("Result :" + res);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Denominator should not be zero");
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("End of main method");

    }
}
