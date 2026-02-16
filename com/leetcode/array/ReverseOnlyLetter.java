package com.leetcode.array;

public class ReverseOnlyLetter {
    public static void main(String[] args) {
        String s ="ab-cd12-m4-";
        System.out.println(reverse(s));
    }

    public static String reverse(String s){
        int start =0;
        int last = s.length()-1;
        char [] arr = s.toCharArray();
//        while (start < last) {
//            if (isEnglish(arr[start])){
//                while (!isEnglish(arr[last])){
//                    last--;
//                }
//        }
//            char temp = arr[start];
//            arr[start] = arr[last];
//            arr[last] = temp;
//            last --;
//            start++;
//        }
        while (start < last) {
            if (!isEnglish(arr[start])) {
                start++;
            } else if (!isEnglish(arr[last])) {
                last--;
            } else {
                // Swap only if both are letters
                char temp = arr[start];
                arr[start] = arr[last];
                arr[last] = temp;
                start++;
                last--;
            }
        }
        return new String(arr);
    }

    public static boolean isEnglish(char c){
        return (65 <= c && c <=90) || (97 <= c && c <= 122);
    }
}
