package com.leetcode.array;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "hello world aaaa";
        System.out.println(lengthofLast(s));
    }

//    public static int lengthofLast(String s){
//        int len =0;
//        String [] word = s.split(" ");
//        for(int i = word.length-1; i >=0 ; i--){
//             len = word[i].length();
//             break;
//        }
//        return len;
//    }

    public static int lengthofLast(String s){
        int len =0;

        for(int i = s.length()-1; i >=0 ; i--){
           if(s.charAt(i)!= ' '){
               len++;
           } else if (len > 0) {
               return len;
           }
        }
        return len;
    }
}
