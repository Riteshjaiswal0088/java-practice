package com.practices.javapractice.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ArrayExample {
    public static void main(String[] args) {
       //WM to print integer element from array
        int[] arr = {3,6,9,1,4,5};
        int[] arr1 = {3,6,9,4,5,6,7,8,4,5};
        printArray(arr);
        printArray(arr1);

        int searchElement = 9;
       // check(arr, searchElement);
   // sahi baya hai
       findElementInArray(arr,searchElement);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(19);
        listExample(numbers);
        //map----------
        Map<Integer, String> map = new HashMap<>();
        map.put(10,"sjesmsj");
        map.put(11,"iedmnd");
        map.put(12,"owjdnx");
        mapExample(map);
    }
    public static void printArray(int[] array) {
     /* for (int i = 0; i < array.length; i++) {
          System.out.println(array[i]);
      }*/
        for (int value : array) {
            System.out.println(value);
        }
    }
    public static void listExample(List<Integer> ls) {
        for (Integer l : ls) {
            System.out.println(l);
        }
    }
    public static void mapExample(Map<Integer, String> hm) {
       hm.forEach((key, value) -> System.out.println(key + ":" + value));
    }
    public static void findElementInArray(int[] array, int searchElement) {

        for (int vl: array) {
            System.out.println(vl);
            if (vl == searchElement) {
                System.out.println("Available");
            }
        }

    }

}
