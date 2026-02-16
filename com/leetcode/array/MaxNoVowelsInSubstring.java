package com.leetcode.array;
//given a string s and an integer k, return the max number of vowels letters in any substring of s with length k


public class MaxNoVowelsInSubstring {
    public static void main(String[] args) {
        String s = "abciidef";
        int k = 3;
        System.out.println(maxVowels(s, k));  // Output: 3
    }

    public static int maxVowels(String s, int k) {
        int n = s.length();
        int max = 0, count = 0;

        // Initial window
        for (int i = 0; i < k; i++) {
            count += isVowel(s.charAt(i));
        }

        max = count;

        // Slide the window
        for (int i = k; i < n; i++) {
            count += isVowel(s.charAt(i)) - isVowel(s.charAt(i - k));
            max = Math.max(max, count);
        }

        return max;
    }

    public static int isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
    }
}
