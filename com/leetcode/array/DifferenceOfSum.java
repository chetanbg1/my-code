package com.leetcode.array;
// Divisible and non divisible sum difference
public class DifferenceOfSum {
    public static void main(String[] args) {
        System.out.println(differenceOfSum(10 , 3));
    }

    public static int differenceOfSum(int n, int m){
        int x = n/m;
        int num2= m * x * (x +1)/2;
        int num1 = n * (n + 1)/2 - num2;

        return num1-num2;
    }
}
