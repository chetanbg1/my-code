package com.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MaxSumOfPairWithEqualSumOfDigit {
    public static void main(String[] args) {
        int[] arr = {18, 43, 36, 13, 7};
        System.out.println(maxSum(arr)); // Expected output: 61 (43 + 18)
    }

    public static int maxSum(int[] arr) {
        int res = -1;
        Map<Integer, Integer> map = new HashMap<>(); // Map<digit_sum, max_number>
        for (int i = 0; i < arr.length; i++) {
            int s = sum(arr[i]);
            if (map.containsKey(s)) {
                res = Math.max(res, arr[i] + map.get(s));
                // Update to keep the max value for this digit sum
                map.put(s, Math.max(arr[i], map.get(s)));
            } else {
                map.put(s, arr[i]);
            }
        }
        return res;
    }

    public static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
