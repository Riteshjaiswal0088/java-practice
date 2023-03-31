package com.practices.javapractice.march.collectionFramework.sets;

import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        //It is substantially slower than HashSet
        //TreeSet elements are sorted in ascending order.

        TreeSet<String> set = new TreeSet<>();
        set.add("Puma");
        set.add("Sketchers");
        set.add("Woodland");
        set.add("Fenta");
        set.add("Reebok");
        set.add("Like");

        for (String str: set) {
            System.out.println(str);
        }

    }
}
