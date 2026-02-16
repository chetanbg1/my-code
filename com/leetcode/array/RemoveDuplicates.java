package com.leetcode.array;

//remove duplicate from sorted array
public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,2,3,4,5,5};
        int length = removeDuplicate(arr);
        System.out.println(length);
        for (int i =0 ; i <= length ; i++){
            System.out.println(i + " ");
        }
    }

    public static int removeDuplicate(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }

        }
        return i+1;
    }
}
