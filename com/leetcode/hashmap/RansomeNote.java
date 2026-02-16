package com.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomeNote {
    public static void main(String[] args) {
        String a = "aa";
        String b = "aab";
        System.out.println(canConstruct(a, b));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (char c : magazine.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (--arr[c - 'a'] < 0) {
                return false; // not enough of character c
            }
        }
        return true;
    }

}
