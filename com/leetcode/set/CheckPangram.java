package com.leetcode.set;

import java.util.HashSet;
import java.util.Set;

public class CheckPangram {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPanagram(s));
    }

    public static boolean isPanagram(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
           return set.size() == 26;
    }

    public static boolean isPanagram2(String s) {
       boolean arr [] = new boolean[26];
        for (char c : s.toCharArray()) {
            arr[c -'a']=true;
        }
        for (boolean curr : arr){
            if(!curr){
                return false;
            }
        }
        return true;
    }

}
