package com.practices.javapractice.march.collectionFramework.lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {
    public static void main(String[] args) {
        /*LinkedList
    LinkedList is a linear data structure.
    However LinkedList elements are not stored in contiguous locations like arrays,
    they are linked with each other using pointers.
    Each element of the LinkedList has the reference(address/pointer)
    to the next element of the LinkedList.*/

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Greps");
        fruits.add("Coconut");
        System.out.println(fruits);

        //iterating LinkedList using iterator
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
            System.out.println("for");
            for (String str : fruits) {
                System.out.println(str);
            }
        System.out.println("Adding new elements");
        fruits.addFirst("Pear");
            fruits.addLast("Mango");
        System.out.println(fruits);

        //This is how to get and set Values
        Object obj = fruits.get(0);
        System.out.println(obj);
        Object obj1 = fruits.get(1);
        System.out.println(obj1);

        System.out.println(fruits);
     //   Remove first and last element
        System.out.println("Removing element first");
       fruits.removeFirst();
        System.out.println(fruits);

        System.out.println("Removing element last");
        fruits.removeLast();
        System.out.println(fruits);

        //Iterating linkedList
        System.out.println("Iterator");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        }
    }
