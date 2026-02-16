package com.leetcode.array;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,1,1,0,1,1};
        System.out.println(maxConsecativeOnes(arr));
    }

//    public static int maxConsecativeOnes(int [] arr){
//        int max = 0;
//        for(int i = 0; i<= arr.length-1; i++){
//            if(arr[i]==1){
//                max++;
//            }else{
//                max =0;
//            }
//        }
//        return max;
//    }

    public static int maxConsecativeOnes(int [] arr){
        int left = 0;
        int ans = -1;
        int window = 0;
        for(int right =0; right < arr.length; right++){
            window += arr[right];
            while (right - left +1 != window){
                window -= arr[left];
                left++;
            }
            ans = Math.max(ans , right -left +1);
        }
        return ans;
    }
}
