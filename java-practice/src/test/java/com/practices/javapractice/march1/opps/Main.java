package com.practices.javapractice.march1.opps;

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
        Parent p2 = new Parent();
        //Child c2 = (Child) new Parent();
        p.show();
        c.show();
        p2.show();
        //c2.show();
    }
}
