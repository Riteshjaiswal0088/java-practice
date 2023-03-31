package com.practices.javapractice;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {3,2,1};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n-1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
         int[] numbers = new int[n+1];
        numbers[0] = 1;
        return numbers;
    }
}
