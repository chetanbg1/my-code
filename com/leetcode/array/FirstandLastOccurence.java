package com.leetcode.array;

public class FirstandLastOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 3, 3, 4, 5, 6};
        int x = 3;
        int[] result = firstAndLast(arr, x);
        for(int i :result){
            System.out.print(i + " ");
        }
    }

    public static int[] firstAndLast(int[] arr, int x) {
        int firstApparence = binaryLeft(arr, x);
        int lastApparence = binaryRight(arr, x);
        int[] result = {firstApparence, lastApparence};
        return result;
    }

    public static int binaryLeft(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        int result = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) {
                result =  mid;
                r = mid - 1;
            }
            if (mid < x) {
                l = mid + 1;
            } else {
                r = mid -1;

            }
        }
        return result;
    }
    public static int binaryRight(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        int result = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) {
                result =  mid;
                l = mid + 1;
            }
            if (mid < x) {
                l = mid + 1;
            } else {
                r = mid -1;

            }
        }
        return result;
    }
}
