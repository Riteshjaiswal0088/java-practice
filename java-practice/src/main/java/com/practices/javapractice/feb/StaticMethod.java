package com.practices.javapractice.feb;

import java.util.Scanner;

public class StaticMethod {
    public static int printNumber(int number) {
        return number;
    }
    public static String printName(String name) {
        return name;
    }
    public static void main(String[] args) {
        System.out.print("enter any number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(printNumber(number));

        System.out.println("=============");

        System.out.print("enter your name: ");
        Scanner scA = new Scanner(System.in);
        String name = scA.next();
        System.out.println(printName(name));
        
    }
}
