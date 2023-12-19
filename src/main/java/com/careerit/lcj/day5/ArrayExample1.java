package com.careerit.lcj.day5;

import java.util.Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Length of array :" + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for(int ele:arr){
            System.out.println(ele);
        }
        // Print array elements in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        // update the array elements with square of the elements
        System.out.println("Before update :"+ Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        System.out.println("After update :"+ Arrays.toString(arr));

    }
}
