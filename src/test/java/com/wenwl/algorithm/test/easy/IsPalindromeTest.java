package com.wenwl.algorithm.test.easy;


import com.wenwl.algorithm.leetcode.easy.IsPalindrome;
import junit.framework.TestCase;
import org.junit.Test;

public class IsPalindromeTest {

	private String testCase1 = "A man, a plan, a canal: Panama";
	private boolean expected1 = true;

	private String testCase2 = "race a car";
	private boolean expected2 = false;

	private String testCase3 = "0P";
	private boolean expected3 = false;

	@Test
	public void test3() {
		TestCase.assertEquals(expected1, IsPalindrome.isPalindrome3(testCase1));
		TestCase.assertEquals(expected2, IsPalindrome.isPalindrome3(testCase2));
		TestCase.assertEquals(expected3, IsPalindrome.isPalindrome3(testCase3));
	}

	@Test
	public void test2() {
		TestCase.assertEquals(expected1, IsPalindrome.isPalindrome2(testCase1));
		TestCase.assertEquals(expected2, IsPalindrome.isPalindrome2(testCase2));
		TestCase.assertEquals(expected3, IsPalindrome.isPalindrome2(testCase3));
	}

	@Test
	public void test1() {
		TestCase.assertEquals(expected1, IsPalindrome.isPalindrome1(testCase1));
		TestCase.assertEquals(expected2, IsPalindrome.isPalindrome1(testCase2));
		TestCase.assertEquals(expected3, IsPalindrome.isPalindrome1(testCase3));
	}

}
