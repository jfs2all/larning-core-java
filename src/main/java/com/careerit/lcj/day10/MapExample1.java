package com.careerit.lcj.day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample1 {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1001,"Krish");
        map.put(1002,"Manoj");
        map.put(1003,"Charan");
        map.put(1004,"Balaji");
        map.put(1001,"Krishna");

        Set<Integer> keys = map.keySet();
        for(Integer key:keys){
            System.out.println(key+" : "+map.get(key));
        }

        System.out.println(map.containsKey(1001));
        map.putIfAbsent(1005,"Krishan Mohan");
        System.out.println(map);
    }
}
