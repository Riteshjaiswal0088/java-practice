package com.practices.javapractice;

public class Singleton {

    private static Singleton instance;
    {}
    static{}


    private Singleton() {} // private constructor to prevent direct instantiation

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();//

        Singleton s2 = Singleton.getInstance();

        Singleton s3 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

