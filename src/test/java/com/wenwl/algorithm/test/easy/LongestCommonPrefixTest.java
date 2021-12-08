package com.wenwl.algorithm.test.easy;

import static org.junit.Assert.*;

import com.wenwl.algorithm.leetcode.easy.LongestCommonPrefix;
import org.junit.Test;


public class LongestCommonPrefixTest {
	
	private LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
	
	private String[] testCase1 = {"flower", "flow", "flight"};
	private String expected1 = "fl";

	private String[] testCase2 = {"dog", "racecar", "car"};
	private String expected2 = "";

	private String[] testCase3 = {"dog", "", "car"};
	private String expected3 = "";

	@Test
	public void test2() {
		assertEquals(expected1, longestCommonPrefix.longestCommonPrefix2(testCase1));
		assertEquals(expected2, longestCommonPrefix.longestCommonPrefix2(testCase2));
		assertEquals(expected3, longestCommonPrefix.longestCommonPrefix2(testCase3));
	}

	@Test
	public void test1() {
		assertEquals(expected1, longestCommonPrefix.longestCommonPrefix1(testCase1));
		assertEquals(expected2, longestCommonPrefix.longestCommonPrefix1(testCase2));
		assertEquals(expected3, longestCommonPrefix.longestCommonPrefix1(testCase3));
	}

}
