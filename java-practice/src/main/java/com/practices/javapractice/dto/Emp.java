package com.practices.javapractice.dto;

import lombok.Builder;

@Builder
public class Emp {
    private int id;
    private String name;

    public Emp(int id, String name) {
         this.id = id;
        this.name = name;
    }

    public Emp() {
    }




    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
       add("nanv");
    }
    public static void add(String name) {

    }

    public void setName(String name) {
        this.name = name;
    }

 /*  public String toString() {
        return "Emp(id=" + this.getId() + ", name=" + this.getName() + ")";
    }*/

}
