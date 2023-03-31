package com.practices.javapractice.march.collectionFramework.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {

       /* ArrayList is a resizable-array implementation of the List interface.
        It implements all optional list operations, and permits all elements, including null.*/

        //inserting element at first position, index 0
        //represents first element because ArrayList is based
        //on zero based indexing system

        ArrayList<String> list = new ArrayList<>();
        list.add("ritesh");
        list.add("Hemant");
        list.add("Dharam");
        list.add("Ganesh");
        list.add("Raaka");
        System.out.println(list);

        System.out.println("Adding new element");
        list.add(3, "Ramesh");
        System.out.println(list);

        //If we want to change an existing element use set()
        System.out.println("Change existing element");
        list.set(2,"PredyBoy");
        System.out.println(list);

        // removing an element
        System.out.println("removing");
        list.remove(1);
        System.out.println(list );

        list.remove("Raaka");
        System.out.println(list);

        //Size
        System.out.println("Size");
        System.out.println("Number of elements of ArrayList: "+ list.size());

        //Sorting
        System.out.println("sort arrayList");
        Collections.sort(list);
        System.out.println();
        //Traversing ArrayList using enhanced for loop
        // Iterating arrayList
        System.out.println("Using for loop");
        for (String str : list) {
            System.out.print(str+" ");
        }

        System.out.println("\n contains");
        list.contains("Steve");
        System.out.println(list);
    }
}
