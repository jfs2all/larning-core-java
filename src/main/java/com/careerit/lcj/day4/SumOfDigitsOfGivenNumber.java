package com.careerit.lcj.day4;

public class SumOfDigitsOfGivenNumber {

    public static void main(String[] args) {
        int num = 9819;
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum += r;
            temp /= 10;
        }
        System.out.println("Sum of digits of " + num + " is " + sum);
    }
}
