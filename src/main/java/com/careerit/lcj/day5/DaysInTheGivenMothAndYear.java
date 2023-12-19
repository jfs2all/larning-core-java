package com.careerit.lcj.day5;

public class DaysInTheGivenMothAndYear {

    public static void main(String[] args) {

            int month = 2;
            int year = 2020;
            int days = daysInMonth(month, year);
            System.out.println("Days in month :" + month + " and year :" + year + " is " + days);
    }

    private static int daysInMonth(int month, int year) {
        return switch(month) {
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9,11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> throw new IllegalArgumentException("Invalid month :"+month);
        };

    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
