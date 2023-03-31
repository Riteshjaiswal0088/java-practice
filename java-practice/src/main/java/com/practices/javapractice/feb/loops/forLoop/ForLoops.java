package com.practices.javapractice.feb.loops.forLoop;

public class ForLoops {

/*    public static int countingNumbers(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
        return num;
    }*/
    public static int addingNumbers(int num) {

        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
        return num * (num +1)/2;
    }
    public static void main(String[] args) {
        System.out.println(addingNumbers(100));
        System.out.println(addingNumbers(12));
    }
}
