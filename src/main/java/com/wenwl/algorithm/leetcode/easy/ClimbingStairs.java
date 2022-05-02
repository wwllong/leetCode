package com.wenwl.algorithm.leetcode.easy;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/climbing-stairs/">Q70-爬楼梯</a>
 */
public class ClimbingStairs {

    /**
     * m6(0ms, 45tc): 通项公式, Binet's Formula
     * Tn = O(logn)，Sn = O(1)
     */
    public int climbStairs6(int n) {
        double sqrt5 = Math.sqrt(5);
        double result = (Math.pow((1 + sqrt5)/2, n + 1) - Math.pow((1 - sqrt5)/2, n + 1)) / sqrt5;
        return (int)result;
    }

    /**
     * m5(0ms, 45tc): 矩阵快速幂(矩阵公式，优化时间复杂度）
     * Tn = O(logn)，Sn = O(1)
     */
    public int climbStairs5(int n) {
        int[][] m = {{0, 1}, {1, 1}};
        // 二分计算m矩阵的n次幂
        int[][] res = pow(m, n);
        return res[1][1];
    }

    private int[][] pow(int[][] m, int n) {
        int[][] ret = {{1, 0}, {0, 1}};
        while (n > 0) {
            if ((n & 1) == 1) {
                ret = multiply(ret, m);
            }
            n >>= 1;
            // 2 x 2 矩阵乘法
            m = multiply(m, m);
        }
        return ret;
    }

    private int[][] multiply(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        c[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0];
        c[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1];
        c[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0];
        c[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1];
        return c;
    }

    /**
     * m4(0ms, 45tc): 动态规划，滚动数组
     * Tn = O(n)，Sn = O(1)
     */
    public int climbStairs4(int n) {
        int first = 0, second = 0, third = 1;
        for (int i = 1; i <= n; i++) {
            first = second;
            second = third;
            third = first + second;
        }
        return third;
//        if (n == 1) {
//            return 1;
//        }
//        int first = 1;
//        int second = 2;
//        for (int i = 3; i <= n; i++) {
//            int third = first + second;
//            first = second;
//            second = third;
//        }
//        return second;
    }

    /**
     * m3(0ms, 45tc): 动态规划，固定数组
     * Tn = O(n)，Sn = O(n)
     */
    public int climbStairs3(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /**
     * m2(0ms, 45tc): 递归记忆，存储中间结果，避免重复计算
     * Tn = O(n)，Sn = O(n)
     */
    public int climbStairs2(int n) {
        int[] memo = new int[n + 1];
        return climbStairs2Memo(n, memo);
    }

    private int climbStairs2Memo(int n, int[] memo) {
        if (memo[n] > 0) {
            return memo[n];
        }
        if (n == 1) {
            memo[n] = 1;
        }else if (n == 2) {
            memo[n] = 2;
        }else {
            memo[n] = climbStairs2Memo(n - 1, memo) + climbStairs2Memo(n - 2, memo);
        }
        return memo[n];
    }

    /**
     * m1(直接干超时了): 递归，斐波那契数列
     * Tn = O(2^n)，Sn = O(n)
     */
    public int climbStairs1(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs1(n - 1 ) + climbStairs1(n - 2 );
    }

}
