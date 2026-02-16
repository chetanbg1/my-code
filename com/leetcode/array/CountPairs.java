package com.leetcode.array;

import java.util.Arrays;
import java.util.List;

// Count pairs whose sum is less than target
public class CountPairs {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(-1,1,2,3,1);
        int target = 2;
        System.out.println(countPair(num , target));
    }

//    public static int countPair(List<Integer> num, int target){
//        int res =0;
//        for (int i =0 ; i< num.size(); i++){
//            for(int j = i+1; j < num.size() ; j++){
//                if(num.get(i)+ num.get(j) < target){
//                    res++;
//                }
//            }
//        }
//        return res;
//    }

    public static int countPair(List<Integer> num, int target){
        int res =0;
        num.sort((a, b) -> a-b);
        int l =0;
        int r = num.size()-1;
        while (l != r){
            if(num.get(l) + num.get(r) < target){
                res +=  r -l;
                l++;
            }else{
                r--;
            }
        }
        return res;
    }
}
