package com.practices.javapractice.stringMethods;

public class IndexOfExp {

    public static void main(String[] args) {

        System.out.println(stringFind("Chinmaya"));
    }
    public static int stringFind(String str) {
        int index = str.indexOf('n');
       /* if (index == -1) {
            System.out.print("character is not found: ");
        } else {
            System.out.print("character is found: ");
        }*/
        return index;
    }
}

