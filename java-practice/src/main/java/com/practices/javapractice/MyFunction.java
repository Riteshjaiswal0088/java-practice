package com.practices.javapractice;

import java.util.Scanner;

public class MyFunction {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        System.out.println("Enter your valid name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        printMyName(name);
    }
}
