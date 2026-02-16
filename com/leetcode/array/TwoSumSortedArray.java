package com.leetcode.array;

import java.util.Arrays;

public class TwoSumSortedArray {
    public static void main(String[] args) {
        int arr [] = {2,3,5,7,11};
        int target = 10;
        int[] res = twoSum(arr ,target);
        System.out.println(Arrays.toString(res));
    }
    public static int [] twoSum(int arr[] , int target){
        int l =0;
        int r = arr.length-1;

        while (l <= r){
            if(arr[l]+ arr[r] == target){
                return new int[]{l ,r};
            }
            else if(arr[l]+ arr[r] < target){
                l++;
            }else{
                r--;
            }
        }
        return new int[]{-1, -1};
    }
}
