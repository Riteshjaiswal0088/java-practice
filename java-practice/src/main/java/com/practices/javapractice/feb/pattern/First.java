package com.practices.javapractice.feb.pattern;

public class First {
    public static void pattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        return;
    }

    public static void main(String[] args) {
        pattern();
    }
}
