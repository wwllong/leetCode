package com.wenwl.algorithm.test.easy;

import com.wenwl.algorithm.leetcode.easy.RomanToInt;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author wenwl
 * @version 1.0.0
 * @date 2022/5/6 12:51
 */
public class RomanToIntTest {

    private final String testCase1 = "III";
    private final int expected1 = 3;
    private final String testCase2 = "IV";
    private final int expected2 = 4;
    private final String testCase3 = "IX";
    private final int expected3 = 9;
    private final String testCase4 = "LVIII";
    private final int expected4 = 58;
    private final String testCase5 = "MCMXCIV";
    private final int expected5 = 1994;

    @Test
    public void test() {
        Assert.assertEquals(expected1, RomanToInt.romanToInt1(testCase1));
        Assert.assertEquals(expected2, RomanToInt.romanToInt1(testCase2));
        Assert.assertEquals(expected3, RomanToInt.romanToInt1(testCase3));
        Assert.assertEquals(expected4, RomanToInt.romanToInt1(testCase4));
        Assert.assertEquals(expected5, RomanToInt.romanToInt1(testCase5));
    }
}
