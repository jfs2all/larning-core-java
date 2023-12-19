package com.careerit.lcj.day5;

import java.util.Arrays;

public class AnagramExample {
    // CAT, ACT, TAC, TCA, ATC, CTA

    public static void main(String[] args) {

            String name1 = "CCAT";
            String name2 = "ACT";
            System.out.println("Is "+name1+" and "+name2+" are anagrams  ? :"+isAnagram(name1, name2));
    }
    private static boolean isAnagram(String name1, String name2) {
        char[] arr1 = name1.toCharArray();
        char[] arr2 = name2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
