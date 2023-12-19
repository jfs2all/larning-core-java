package com.careerit.lcj.day5;

public class ArrayExample3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
        System.out.println(isPalindrome(arr));
    }

    private static boolean isPalindrome(int[] arr) {
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }


}
