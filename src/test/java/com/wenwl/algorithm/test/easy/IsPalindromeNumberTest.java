package com.wenwl.algorithm.test.easy;

import com.wenwl.algorithm.leetcode.easy.IsPalindromeNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsPalindromeNumberTest {

    private IsPalindromeNumber isPalindromeNumber = new IsPalindromeNumber();

    private int x1 = 121;
    private boolean expected1 = true;

    private int x2 = -121;
    private boolean expected2 = false;

    private int x3 = 10;
    private boolean expected3 = false;

    private int x4 = -101;
    private boolean expected4 = false;

    @Test
    public void test2() {
        assertEquals(expected1, isPalindromeNumber.isPalindrome2(x1));
        assertEquals(expected2, isPalindromeNumber.isPalindrome2(x2));
        assertEquals(expected3, isPalindromeNumber.isPalindrome2(x3));
        assertEquals(expected4, isPalindromeNumber.isPalindrome2(x4));
    }

    @Test
    public void test1() {
        assertEquals(expected1, isPalindromeNumber.isPalindrome1(x1));
        assertEquals(expected2, isPalindromeNumber.isPalindrome1(x2));
        assertEquals(expected3, isPalindromeNumber.isPalindrome1(x3));
        assertEquals(expected4, isPalindromeNumber.isPalindrome1(x4));
    }

}
