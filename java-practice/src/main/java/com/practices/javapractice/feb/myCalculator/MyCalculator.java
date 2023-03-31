package com.practices.javapractice.feb.myCalculator;

import java.util.Scanner;


public class MyCalculator {
    public static long calculatorSum(long a, long b, long c, long d) {
        return a + b + c + d;
    }
    public static long calculatorDivide(long a, long b) {
        return a / b;
    }
    public static long calculatorPower(long a) {
        return a * a;
    }
    public static long calculatorMul(long a, long d) {
        return a * d;
    }
    public static void calculateFactorial(int n) {

        if(n < 0) {
            System.out.println("Please enter valid number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        return;



    }

    public static void main(String[] args) {
        System.out.print("Please enter value for a:");
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();

        System.out.print("Please enter value for b:");
        long  b= scanner.nextLong();

        System.out.print("Please enter value for c:");
        long c = scanner.nextLong();

        System.out.print("Please enter value for d:");
        long d = scanner.nextLong();

        long calculator = calculatorSum(a,b,c,d);
        System.out.println("Sum:" +calculator);

        System.out.println("power:"+calculatorPower(c));

        System.out.println("Multiply:"+calculatorMul(a, b));

        System.out.println("Divide:"+calculatorDivide(a, b));

        System.out.print("enter a for Find factorial:");
        int n = scanner.nextInt();
        calculateFactorial(n);
    }
}
