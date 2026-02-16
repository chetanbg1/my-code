package com.leetcode.dynamicPorg;

public class Knapscak01 {
    public static void main(String[] args) {

        int[] weight = {3, 4, 2};
        int[] profit = {6, 8, 7};
        int wt = 7;
        int n = weight.length;

        int result = knapsack(weight, profit, wt, n);
        System.out.println(result);
    }

    private static int knapsack(int[] weight, int[] profit, int wt, int n) {

        // Base condition
        if (n == 0 || wt == 0) {
            return 0;
        }

        // If current item weight is more than capacity
        if (weight[n - 1] > wt) {
            return knapsack(weight, profit, wt, n - 1);
        }

        // Choice: pick or not pick
        return Math.max(
                knapsack(weight, profit, wt, n - 1), // not pick
                profit[n - 1] + knapsack(weight, profit, wt - weight[n - 1], n - 1) // pick
        );
    }
}
