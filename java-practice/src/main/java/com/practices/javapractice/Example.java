package com.practices.javapractice;

public class Example {
    public static void main(String[] args) {

        Example emp = new Example();
        emp.calculateSwap(10, 11);

    }

    public void calculateSwap(int a, int b) {
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("a value:" +a);
        System.out.println("b value:" +b);
    }
}
