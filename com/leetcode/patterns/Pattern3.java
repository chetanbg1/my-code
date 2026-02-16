package com.leetcode.patterns;

public class Pattern3 {
    public static void main(String[] args) {
        for (int i = 0 ; i < 5; i++){
            for(int j = 0 ; j <= 5-i; j++){
                System.out.print(" ");
            }
            for(int k = 5-i; k < 5 ; k++ ){
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
