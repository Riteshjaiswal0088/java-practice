package com.practices.javapractice;

public class TwoSortedArray {
    public static void main(String[] args) {

        int num1[] = {1,2,3};
        int num2[] = {4,5,9};

        System.out.println(findMedian(num1, num2));

    }
    static double findMedian(int num1[], int num2[]) {
        if (num2.length<num1.length) {
            return findMedian(num2, num1);
        }
        int m = num1.length;
        int n = num2.length;
        int start = 0;
        int end = m;
        while (start <= end)
        {
            int part1 = (start+end)/2;
            int part2 = (m+n+1)/2-part1;
            int maxLeftNum1 = part1 == 0?Integer.MIN_VALUE:num1[part1-1];
            int maxLeftNum2 = part2 == 0?Integer.MIN_VALUE:num2[part2-1];

            int minRightNum1 = part1 == m?Integer.MAX_VALUE:num1[part1];
            int minRightNum2 = part2 == m?Integer.MAX_VALUE:num2[part2];

            if(maxLeftNum1 <= minRightNum2 && maxLeftNum2 <= minRightNum1) {
                if ((m+n)%2==0) {
                    return (Math.max(maxLeftNum1,maxLeftNum2) + Math.min(minRightNum1,minRightNum2))/2.0;
                }
                else {
                    return Math.max(maxLeftNum1,maxLeftNum2);
                }
            }
            else if (maxLeftNum1 > minRightNum2) {
                end = part1 - 1;
            }
            else {
                start = part1 + 1;
            }
        }
        throw new IllegalArgumentException();
    }
}
