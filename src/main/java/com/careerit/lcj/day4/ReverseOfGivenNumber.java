package com.careerit.lcj.day4;

public class ReverseOfGivenNumber {

    public static void main(String[] args) {
        int num = 9889;
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int r = temp % 10;
            rev = rev * 10 + r;
            temp /= 10;
        }
        System.out.println("Reverse of " + num + " is " + rev);
        if(num == rev) {
            System.out.println(num + " is palindrome");
        }else {
            System.out.println(num + " is not palindrome");
        }
    }
}
