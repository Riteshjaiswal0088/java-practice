package com.practices.javapractice.feb;

import java.util.Scanner;

public class StringExample {

    public static String printName(String name) {
        return name;
    }
    public static void main(String[] args) {
        System.out.print("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
       /* String name = scanner.next();
        System.out.print(printName(name));*/

        String nameA = scanner.nextLine();
        System.out.print(printName(nameA));
    }
}
