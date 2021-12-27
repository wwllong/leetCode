package com.wenwl.algorithm.leetcode.easy;

/**
 * @author wenwl
 * @see <a href="https://leetcode-cn.com/problems/palindrome-number/">Q9-回文数</a>
 */
public class IsPalindromeNumber {

    /**
     * m2(4ms,11510tc): 反转数字
     */
    public boolean isPalindrome2(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }

    /**
     * m1(5ms,11510tc): 转换为字符串,双索引前后对比
     */
    public boolean isPalindrome1(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        String numberStr = String.valueOf(x);
        for (int i = 0, j = numberStr.length() - 1; i < j; ++i, --j) {
            if (numberStr.charAt(i) != numberStr.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
