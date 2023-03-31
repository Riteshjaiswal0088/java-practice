package com.practices.javapractice.march1;

public class ParentOops {
    public void print() {
        System.out.println("Parent");
    }
}

class Child extends ParentOops {
    public void print() {
        System.out.println("child");
    }
}

class Main {
    public static void printMain(ParentOops o) {
        o.print();
    }

    public static void main(String[] args) {
        ParentOops x = new ParentOops();
        ParentOops y = new Child();
        Child z = new Child();
        printMain(x);
        printMain(y);
        printMain(z);
    }
}
