package com.practices.javapractice.stringMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexOfStreamApi {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "chilli", "coconut", "pineapple");

        Integer index = list.stream().
                filter(str -> str.equals("chilli"))
                .findFirst()
                .map(list::indexOf)
                .orElse(-1);
        System.out.println("Index is: " +index);
    }
}
