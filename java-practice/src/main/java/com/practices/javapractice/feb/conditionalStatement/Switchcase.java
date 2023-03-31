package com.practices.javapractice.feb.conditionalStatement;

import java.util.Scanner;

class SwitchCaseExample {

    public static int switchCase(int button) {

        switch (button) {
            case 1:
            System.out.println("Hello");
            break;

            case 2:
                System.out.println("namastey");
                break;

                case 3:
                    System.out.println("Bojingulu");
                    break;

                    default:
                        System.out.println("invalid");
        }

        return button;
    }
    public static void main(String[] args) {
        System.out.println("enter number 1 or 2 or 3: ");
        Scanner sc = new Scanner(System.in);
        int button = Integer.parseInt(sc.next());
        System.out.println(switchCase(button));

    }
}
