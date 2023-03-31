package com.practices.javapractice.march1;

public class Practice {
    public static void main(String[] args) {
        System.out.println(value());
    }
    static int value() {
      final int data = 0;
       //  static int data = 0; // static not allowed here: illegal start of expression
       // int data = 0;
        return data;
    }
}
