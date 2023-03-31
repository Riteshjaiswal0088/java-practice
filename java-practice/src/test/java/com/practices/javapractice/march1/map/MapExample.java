package com.practices.javapractice.march1.map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    @Test
    void mapForEach(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ritesh");
        map.put(2, "hemant");

        map.forEach((k,v)->{         //forEach method java 8
            System.out.println(k+" : "+v);
        });

    }

    @Test
    void mapEntrySet(){
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("A", 1);
        myMap.put("B", 2);
        myMap.put("C", 3);

        for (Map.Entry<String, Integer> entry : myMap.entrySet()) { //enhanced forEach java 5
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }


    }
}
