package com.practices.javapractice.dto;

public class Main {
    public static void main(String[] args) {
        //1, Ritesh->default constructor,  builder

          Emp e1 = new Emp();
          e1.setId(1);
          e1.setName("hemant");


        Emp e2 = new Emp(2, "ritesh");
        System.out.println(e2.toString());

        Emp e3 = Emp.builder().name("kumar").build();
        e3.setId(4);
        System.out.println(e3);
        System.out.println(e3.getName());
        System.out.println(e3.getId());
        e1.setName("sonu");
        System.out.println(e1);
    }
}
