package com.careerit.lcj.day5;

public class StringExample2 {

    public static void main(String[] args) {
        String names = "Krish , Manoj, Rajesh ,Siva,Charan,Kiran";
        String[] arr = names.split(",");
        for(String name:arr){
            System.out.println(name.trim().substring(0,3).toUpperCase());
        }

        String userName = String.join("-", "John","Doe","Joy","Smith");
        System.out.println(userName);

    }
}
