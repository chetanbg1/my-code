package com.leetcode.array;

public class MacAvgSubarray {


    public static void main(String[] args) {
        int [] arr = {1,12,-5,-6,50,3};
        int k =4;
        System.out.println(maxAvg(arr , k));
    }

    public static double maxAvg(int [] arr , int k){
        double ans =0 ;
        double window =0;
        int n = arr.length;
        for(int i = 0 ; i< k ; i++){
            window += arr[i];
        }
        ans = window / k;
        for(int right = k ; right < n ; right++){
            window -= arr[right -k];
            window += arr[right];
            ans = Math.max(ans , window/k);
        }
        return ans;
    }
}
