package com.leetcode.array;

import java.util.Arrays;

public class SquareofSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        int[] res = sortedSquare(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] sortedSquare(int[] num) {

        int n = num.length;
        int[] res = new int[n];
        int l = 0;
        int r = n - 1;
        for(int i = n-1; i >=0; i--){
            if(num[r]* num[r] > num[l]*num[l]){
                res[i] = num[r]*num[r];
                r--;
            }else{
                res[i] = num[l]*num[l];
                l++;
            }
        }
        return res;
    }
}
