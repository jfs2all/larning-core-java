package com.careerit.lcj.day2;

import java.util.Scanner;

public class PersonDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Enter the age :");
        int age = sc.nextInt();
        if(age < 0){
            age = -age;
        }
        System.out.println("Name :"+name);
        System.out.println("Age  :"+age);

    }
}
