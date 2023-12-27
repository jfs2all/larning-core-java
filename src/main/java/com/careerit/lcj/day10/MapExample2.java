package com.careerit.lcj.day10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

    public static void main(String[] args) {

        String data = "learning java is fun to have fun learn java";
        String[] arr = data.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(String ele:arr){
            map.putIfAbsent(ele,0);
            map.put(ele,map.get(ele)+1);
        }
        System.out.println(map);
    }
}
