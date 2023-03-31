package com.practices.javapractice.feb.myCalculator;

import java.util.Scanner;

public class CalculateMultiply {

    public static int calculateMultiply(int x, int y) {
        int mul = x * y;
        return mul;
    }
    public static void main(String[] args) {

        System.out.print("enter value of X: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.print("enter value of Y: ");
        int y = scanner.nextInt();

        int mul = calculateMultiply(x, y);

        System.out.println(mul);

    }
}
