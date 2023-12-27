package com.careerit.lcj.day10;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample2 {

    public static void main(String[] args) {

        List<String> CS = List.of("Krish", "Manoj", "Charan", "Balaji");
        List<String> EC = List.of("Manasa", "Lakshmi", "Sai", "Siri", "Sai");
        List<String> ME = List.of("John", "Lakshmi", "Sai", "Aadhya", "Dhatri");
        List<String> IS = List.of("Manasa", "Pavan", "Sai", "Ramu", "Yash");

        Set<String> set = new HashSet<>();
        set.addAll(CS);
        set.addAll(EC);
        set.addAll(ME);
        set.addAll(IS);

        System.out.println(set);


    }
}
