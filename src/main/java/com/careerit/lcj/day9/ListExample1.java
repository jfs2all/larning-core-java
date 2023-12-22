package com.careerit.lcj.day9;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();

        namesList.add("Krish");
        namesList.add("Manoj");
        namesList.add("Charan");
        namesList.add("Sai");
        namesList.add("Balaji");

        System.out.println(namesList.isEmpty());
        System.out.println(namesList.size());

        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }
        System.out.println("--------------------");
        for (String name : namesList) {
            System.out.println(name);
        }
        System.out.println("--------------------");

        namesList.forEach(System.out::println);
        System.out.println("Before removing size :"+namesList.size());
        namesList.remove("Sai");
        System.out.println("After removing size :"+namesList.size());

        System.out.println(namesList.contains("Krish"));

    }
}
