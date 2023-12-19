package com.careerit.lcj.day5;

import java.util.Arrays;

public class ArrayExample4 {

    public static void main(String[] args) {

        String name = "CAT";
        char[] arr1 = name.toCharArray();
        char[] arr2 = new char[]{'A', 'C', 'T'};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr1, arr2));
    }
}
