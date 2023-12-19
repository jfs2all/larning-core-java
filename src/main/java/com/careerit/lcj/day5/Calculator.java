package com.careerit.lcj.day5;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the num1 :");
            int num1 = sc.nextInt();
            System.out.println("Enter the num2 :");
            int num2 = sc.nextInt();
            System.out.println("1.Add 2.Sub 3.Mul 4.Div");
            int ch = sc.nextInt();

            /*if(ch == 1){
                System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
            }else if(ch == 2){
                System.out.println("Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
            }else if(ch == 3) {
                System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
            }else if(ch == 4) {
                System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1 / num2));
            }else if(ch == 5){
                System.out.println("Thanks for using calculator");
                break;
            }else{
                System.out.println("Invalid choice");
            }*/

            int res = switch (ch) {
                case 1 ->{
                    System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
                    yield num1 + num2;
                }
                case 2 -> {
                    System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
                    yield num1 - num2;
                }
                case 3 -> {
                    System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
                    yield num1 * num2;
                }
                case 4 -> {
                    System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1 / num2));
                    yield num1 / num2;
                }
                default -> {
                    System.out.println("Invalid choice");
                    yield 0;
                }
            };
            System.out.println("Do you want to continue (y/n)");
            String choice = sc.next();
            if (choice.equals("n")) {
                System.out.println("Thanks for using calculator");
                break;
            }

        }
    }
}
