package com.leetcode.array;

import java.util.Arrays;

// right and left mush have the k number of elements
public class KrediusSubArrayAverage {
    public static void main(String[] args) {
        int [] arr = {7,4,3,9,1,8,5,2,6};
        int k = 3;
        int res [] =krediusAvg(arr , k);
        System.out.println(Arrays.toString(res));
    }

    public static int [] krediusAvg(int [] arr , int k){
       int n = arr.length;
       int [] ans = new int[n];
        Arrays.fill(ans , -1);
       long window = 0;
       int kk =k;
       int idx = 2*k+1;
       if(idx > n){
           return ans;
       }
       for(int i =0; i < idx; i++){
            window += arr[i];

       }
       ans[kk] = (int) (window / idx);
       for(int i = idx; i< n;i++){
           window -= arr[i - idx] + arr[i];
           ans[++k] = (int) (window/idx);
       }
        return ans;
    }



        public static int[] krediusAvg1(int[] arr, int k) {
            int n = arr.length;
            int[] ans = new int[n];
            Arrays.fill(ans, -1);

            int windowSize = 2 * k + 1;
            if (windowSize > n) return ans;

            long windowSum = 0;

            // Initial window
            for (int i = 0; i < windowSize; i++) {
                windowSum += arr[i];
            }

            // First center
            ans[k] = (int)(windowSum / windowSize);

            for (int i = windowSize; i < n; i++) {
                windowSum -= arr[i - windowSize];
                windowSum += arr[i];
                ans[i - k] = (int)(windowSum / windowSize);
            }

            return ans;
        }


}
