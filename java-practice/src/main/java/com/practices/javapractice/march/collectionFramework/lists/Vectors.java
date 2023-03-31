package com.practices.javapractice.march.collectionFramework.lists;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("apna");
        v.add("sapna");
        v.add("money");
        v.add("hai");

        for (String str : v) {
            System.out.print(str+" ");
        }

    }
}
