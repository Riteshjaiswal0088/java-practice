package com.practices.javapractice.feb.myCalculator;

import java.util.Scanner;

public class CalculateSum {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Sum: "+calculateSum(a, b));
    }
}
