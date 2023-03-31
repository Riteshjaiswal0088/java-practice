package com.practices.javapractice.march.collectionFramework.sets;

import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {
        // LinkedHashSet maintains insertion order.
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Chinmay");
        set.add("Bhanwar");
        set.add("Shikila");
        set.add("Zoontee");
        for (String str: set) {
            System.out.println(str);
        }
    }
}
