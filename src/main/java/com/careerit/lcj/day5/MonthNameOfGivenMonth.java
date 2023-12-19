package com.careerit.lcj.day5;

public class MonthNameOfGivenMonth {

    public static void main(String[] args) {

    }
    private static String monthNameWithSwitchExpression(int month){
        return switch(month){
            case 1 -> {
                System.out.println("Wish you happy new year");
                yield  "January";
            }
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> throw new IllegalArgumentException("Invalid month :"+month);
        };
    }

    private static String monthNameWithSwitchStatement(int month){
        String monthName="";
        switch(month){
            case 1:
                monthName="January";
                break;
            case 2:
                monthName="February";
                break;
            case 3:
                monthName="March";
                break;
            case 4:
                monthName="April";
                break;
            case 5:
                monthName="May";
                break;
            case 6:
                monthName="June";
                break;
            case 7:
                monthName="July";
                break;
            case 8:
                monthName="August";
                break;
            case 9:
                monthName="September";
                break;
            case 10:
                monthName="October";
                break;
            case 11:
                monthName="November";
                break;
            case 12:
                monthName="December";
                break;
            default:
                throw new IllegalArgumentException("Invalid month :"+month);
        }
        return monthName;
    }
}
