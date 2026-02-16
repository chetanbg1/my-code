package com.leetcode.array;

public class DecimalToBinary {
    private static String decimalToBinary(int n){
        String res = "";
        if(n==0){
            return "0";
        }
        while(n>0){
            int rem = n%2;
            n = n/2;
            res += rem;
        }
        return new StringBuilder(res).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(19));
    }
}
