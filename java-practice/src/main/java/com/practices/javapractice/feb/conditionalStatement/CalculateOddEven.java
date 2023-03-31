package com.practices.javapractice.feb.conditionalStatement;

import java.util.Scanner;

public class CalculateOddEven {
    public static int calculateOddEven(int num) {
        if(num % 2 == 0) {
            System.out.println("Number is Even");
        }
        else{
            System.out.println("number is odd");
        }
        return num;
    }

    public static int compareTowNumbers(int a, int b) {
        if(a == b) {
            System.out.println("Equals");
        }
        else if(a < b) {
            System.out.println("a is less than b");
        }
        else {
            System.out.println("a is greater than b");
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.print("Enter any number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(calculateOddEven(num));

        System.out.println("Compare two number");

        System.out.print("Enter any two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(compareTowNumbers(a, b));
    }
}
