package com.leetcode.array;

public class CustomSortString {
    public static void main(String[] args) {
        String order = "cba";
        String s = "abcd";
        System.out.println(customOrder(order, s));  // Output: cbad
    }

    public static String customOrder(String order, String s) {
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];

        // Count frequency of each character in 's'
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Append characters as per 'order'
        for (char c : order.toCharArray()) {
            while (freq[c - 'a']-- > 0) {
                sb.append(c);
            }
        }

        // Append remaining characters not in 'order'
        for (char c = 'a'; c <= 'z'; c++) {
            while (freq[c - 'a']-- > 0) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
