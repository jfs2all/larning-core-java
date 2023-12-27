package com.careerit.lcj.day10;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Krish");
        names.add("Manoj");
        names.add("Charan");
        names.add("Sai");
        names.add("Balaji");
        names.add("Krish");
        names.add("Charan");

        System.out.println(names);

        for(String name:names) {
        	System.out.println(name);
        }
    }
}
