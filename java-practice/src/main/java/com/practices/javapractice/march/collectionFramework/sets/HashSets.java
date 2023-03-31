package com.practices.javapractice.march.collectionFramework.sets;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {

        // HashSet which stores its elements in a hash table, s the best-performing implementation.
        // HashSet allows only unique elements.
        //It doesn’t maintain the insertion order
        // which means element inserted last can appear at first when traversing the HashSet.
        HashSet<String> sets = new HashSet<>();
        sets.add("Shankar");
        sets.add("Narayan");
        sets.add("Brahma");
        sets.add("Hanuman");

        for (String s : sets) {
            System.out.println(s);
        }

        System.out.println(sets);
    }
}
