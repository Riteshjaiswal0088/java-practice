package com.practices.javapractice.interview_practices;

import java.util.HashMap;

public class EmployeesFind {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(10000,"Ram");
        map.put(11000,"Reet");
        map.put(7000,"Shyam");
        map.put(20000,"Gyan");
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
