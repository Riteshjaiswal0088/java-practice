package com.practices.javapractice.feb.conditionalStatement;

import java.util.Scanner;

public class ThreeButton {

    public static int calculateButton(int button) {
        if (button == 1) {
            System.out.println("Hello");
        }
        else if (button == 2) {
            System.out.println("Namastey");
        }
        else if (button == 3){
            System.out.println("Bonjour");
        }
        else {
            System.out.println("invalid button");
        }
        return button;
    }
    public static void main(String[] args) {
        System.out.print("enter 1 or 2 or 3 button");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        System.out.println(calculateButton(button));

    }
}
