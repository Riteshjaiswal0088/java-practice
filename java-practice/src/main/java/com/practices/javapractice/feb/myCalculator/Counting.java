package com.practices.javapractice.feb.myCalculator;

import java.util.Scanner;

public class Counting {

    public static int counting(int a, int b) {
        int count = a + b;
        return count;
    }
    public static void main(String[] args) {
        System.out.print("Enter number for a & b: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(counting(a, b));


    }
}
