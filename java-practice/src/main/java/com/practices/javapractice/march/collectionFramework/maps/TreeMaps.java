package com.practices.javapractice.march.collectionFramework.maps;

import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        //The elements of TreeMap are sorted in ascending order.
        // It is substantially slower than HashMap.
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("sumant", 100);
        map.put("Laali", 110);
        map.put("Deepak", 150);
        map.put("Sailaja", 140);
        map.forEach((value, key) -> System.out.println(value + " : " + key));
    }
}
