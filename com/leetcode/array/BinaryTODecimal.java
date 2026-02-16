package com.leetcode.array;

public class BinaryTODecimal {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal("101"));
    }

    public static int binaryToDecimal(String bin){
        int length = bin.length();
        int m = 1;
        int result = 0;
        for(int i = length-1; i >=0; i--){
            char lastChar = bin.charAt(i);
            Integer lastbit = Integer.valueOf(String.valueOf(lastChar).toString());
            result = result + m * lastbit;
            m = m*2;
        }
        return result;
    }
}
