package com.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MinCardPickup {
    public static void main(String[] args) {
        int[] arr = {3, 4,4, 2, 3, 4, 7};
        System.out.println(minCardPicup(arr));
    }

    public static int minCardPicup(int[] card) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < card.length; i++) {
            if (map.containsKey(card[i])) {
                res = Math.min(res, i - map.get(card[i]) + 1);
            }
            map.put(card[i] , i);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
