package com.leetcode.array;

public class MaxOnesFlipkZero {
    public static void main(String[] args) {
        int [] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k =2;
        System.out.println(maxOnes(arr , k));
    }

    public static int maxOnes(int [] arr , int k){
        int left = 0;
        int ans = 0;
        int window =0;
        for(int right =0 ; right < arr.length ; right++){
            window += arr[right];
            while (right - left +1 > window + k){
                window -= arr[left];
                left++;
            }
            ans = Math.max(ans , right - left +1);
        }
        return ans;
    }
}
