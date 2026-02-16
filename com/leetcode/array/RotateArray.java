package com.leetcode.array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int d = 2;
       // leftRotate(arr,n ,d);
        //System.out.println(Arrays.toString(arr));
        rightRotate(arr,n ,d);
        System.out.println(Arrays.toString(arr));
    }
    public  static void leftRotate(int arr[],int n, int d){
        rev(arr, 0, d-1);// reverse the 1st d elements
        rev(arr,d,arr.length-1);//reverse the remaining elements
        rev(arr,0,n-1);//reverse the entire array
    }
    public static void rightRotate(int arr[],int n, int d){
        rev(arr,0,n-1); // reverse the entire arrya
        rev(arr, 0,d-1); //reverse 1st d elements
        rev(arr,d,n-1); //reverse remaining elements

    }
    public static void rev(int arr[], int i, int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
