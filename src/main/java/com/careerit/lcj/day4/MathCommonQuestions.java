package com.careerit.lcj.day4;

import java.util.ArrayList;
import java.util.List;

public class MathCommonQuestions {

    public static int gcd(int num1, int num2) {
        if (num1 == num2) {
            return num1;
        }
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }

    public static int biggestOf(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        }
        return Math.max(num2, num3);
    }

    public static int reverseOf(int num) {
        int rev = 0;
        while (num != 0) {
            int r = num % 10;
            rev = rev * 10 + r;
            num /= 10;
        }
        return rev;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int r = num % 10;
            sum += r;
            num /= 10;
        }
        return sum;
    }

    public static boolean isPrime(int num) {
        if (num < 2 || (num % 2 == 0 && num != 2)) {
            return false;
        }
        for (int i = 2; i <= num / 2; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        return reverseOf(num) == num;
    }

    public static List<Integer> primeNumbers(int lb, int ub) {
        List<Integer> primeList = new ArrayList<>();
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }
        return primeList;
    }

    public static int sumOfDigitsUntilSingleDigit(int num) {
        while(num > 9) {
            num = sumOfDigits(num);
        }
        return num;
    }


}
