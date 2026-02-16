package com.leetcode.array;
//given an array of positive numbers and a positive integer tartget, return the minimum length of subarray
// whose sum is greater than or equal to target, or return 0
public class MinSizeSubArraySum {
    public static void main(String[] args) {
        int [] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSize(arr , target));
    }

    public static int minSize(int [] arr, int target){
        int left =0;
        int sum = 0;
        int n = arr.length;
        int ans =n+1;

        for(int right =0; right < n; right++){
            sum += arr[right];
            while(sum >= target){
                ans = Math.min(ans , right-left+1);
                sum -= arr[left++];
            }
        }

        return ans == n+1 ? 0: ans;
    }
}
