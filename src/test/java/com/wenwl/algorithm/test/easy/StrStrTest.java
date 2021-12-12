package com.wenwl.algorithm.test.easy;

import static org.junit.Assert.*;

import com.wenwl.algorithm.leetcode.easy.StrStr;
import org.junit.Test;

public class StrStrTest {

	private String haystack1 = "hello", needle1 = "ll";
	private int expected1 = 2;

	private String haystack2 = "aaaaa", needle2 = "bba";
	private int expected2 = -1;

	private String haystack3 = "", needle3 = "";
	private int expected3 = 0;

	@Test
	public void test3() {
		assertEquals(expected1, StrStr.strStr3(haystack1, needle1));
		assertEquals(expected2, StrStr.strStr3(haystack2, needle2));
		assertEquals(expected3, StrStr.strStr3(haystack3, needle3));
	}

	@Test
	public void test2() {
		assertEquals(expected1, StrStr.strStr2(haystack1, needle1));
		assertEquals(expected2, StrStr.strStr2(haystack2, needle2));
		assertEquals(expected3, StrStr.strStr2(haystack3, needle3));
	}
	
	@Test
	public void test1() {
		assertEquals(expected1, StrStr.strStr1(haystack1, needle1));
		assertEquals(expected2, StrStr.strStr1(haystack2, needle2));
		assertEquals(expected3, StrStr.strStr1(haystack3, needle3));
	}


}
