package com.leetcode.array;
//given a binary array , return the max number of ones in array if you can flip at most one 0.
public class MaxNumOfOnes {
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,0,1};
        System.out.println(maxOnes(arr));
    }

    public static int maxOnes(int [] arr){
        int left = 0;
        int ans = 0;
        int window =0;
        for(int right =0 ; right < arr.length ; right++){
            //add element arr[right] to window
            window += arr[right];
            //while condition not met
            //do some logic to remove left from window and left ++
            while(! (window == right - left +1 || window ==right -left)){
                window -= arr[left];
                left++;
            }
            //update the ans
            ans = Math.max(ans , right - left +1);
        }
        return ans;
    }
}
