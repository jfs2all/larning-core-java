package com.careerit.lcj.day9;

import java.util.ArrayList;
import java.util.List;

public class ListExample3 {

    public static void main(String[] args) {

        List<String> boysList = List.of("Krish", "Manoj", "Charan", "Balaji");
        List<String> girlsList = List.of("Manasa", "Lakshmi", "Sai", "Siri", "Sai");

        List<String> namesList = new ArrayList<>();
        namesList.addAll(boysList);
        namesList.addAll(girlsList);

        System.out.println(namesList);
        System.out.println(namesList.containsAll(boysList));
    }
}
