package com.leetcode.set;

import java.util.HashSet;
import java.util.Set;

//given a string s of lowercase english letters, return the first letter to appear twice
public class FirstLetterToAppearTwise {
    public static void main(String[] args) {
        String s = "abccaddc";
        System.out.println(repeatedChar(s));
    }

    public static char repeatedChar(String s){
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                return c;
            }else{
                set.add(c);
            }
        }
        return 'z';
    }
}
