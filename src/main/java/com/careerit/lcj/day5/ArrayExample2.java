package com.careerit.lcj.day5;

import com.careerit.lcj.day4.MathCommonQuestions;

public class ArrayExample2 {

    public static void main(String[] args) {

        int[] arr = new int[]{121,131,1221,1234,12321,125,125521,12345};

        for(int num:arr) {
            if(MathCommonQuestions.isPalindrome(num)) {
                System.out.println(num);
            }
        }

    }
}
