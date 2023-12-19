package com.careerit.lcj.day6;

public class AccountUtil {

        public static String maskAccountNumber(long accountNumber) {
            String str = String.valueOf(accountNumber);
            return str.substring(0, 2) + "XXXXX" + str.substring(str.length() - 3);
        }
}
